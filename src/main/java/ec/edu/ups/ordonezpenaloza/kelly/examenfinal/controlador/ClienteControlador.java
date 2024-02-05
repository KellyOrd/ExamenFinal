/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.ordonezpenaloza.kelly.examenfinal.controlador;

import ec.edu.ups.ordonezpenaloza.kelly.examenfinal.IDAO.ClienteIDAO;
import ec.edu.ups.ordonezpenaloza.kelly.examenfinal.IDAO.RestauranteIDAO;
import ec.edu.ups.ordonezpenaloza.kelly.examenfinal.modelo.Cliente;
import ec.edu.ups.ordonezpenaloza.kelly.examenfinal.modelo.Reserva;
import ec.edu.ups.ordonezpenaloza.kelly.examenfinal.modelo.Restaurante;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ESTUDIANTE
 */
public class ClienteControlador {
    private List<Reserva> reservas;
    private RestauranteIDAO restauranteDAO;
    private ClienteIDAO clienteDAO;
    private Cliente cliente;

    public ClienteControlador(ClienteIDAO clienteDAO) {
        this.clienteDAO = clienteDAO;
    }
    
    
    public void registrarCliente(String nombre, String cedula, String correo, String direccion, String telefono) {
        cliente = new Cliente(nombre, cedula, correo, direccion, telefono);
        clienteDAO.registrarCliente(cliente);
    }

    public Cliente buscarClientePorCedula(String cedula) {
        cliente = clienteDAO.buscarClientePorCedula(cedula);
        return null;
    }

    public List<Reserva> listarReservaPorClientes(String cedula) {
    return clienteDAO.listarReservaPorClientes(cedula);
    }

    public boolean validarAforoDisponible(String nombreRestaurante, int numeroPersonas, String fecha, String hora) {
        Restaurante restaurante = restauranteDAO.buscarRestaurantePorNombre(nombreRestaurante);
        int aforoDisponible = Integer.parseInt(restaurante.getAforoDisponible());
        int aforoRestante = aforoDisponible - numeroPersonas;
        return aforoRestante >= 0;
    }

    public void crearReserva(Reserva reserva) {

        Cliente cliente = clienteDAO.buscarClientePorCedula(reserva.getCedulaCliente());
        Restaurante restaurante = restauranteDAO.buscarRestaurantePorNombre(reserva.getNombreRestaurante());

        if (cliente != null && restaurante != null) {
            if (validarAforoDisponible(restaurante.getNombre(), reserva.getNumeroPersonas(), reserva.getFecha(), reserva.getHora())) {
                int disponible = Integer.parseInt(restaurante.getAforoDisponible());
                restaurante.actualizarAforoDisponible(disponible - reserva.getNumeroPersonas());
                restauranteDAO.actualizarRestaurante(restaurante);
                cliente.addReserva(reserva);
                clienteDAO.actualizarCliente( cliente);
                // TODO: Guardar la reserva en el sistema (BD, archivo, etc.)
            } else {
                // Mostrar mensaje de error: Aforo no disponible
            }
        } else {
            // Mostrar mensaje de error: Cliente o restaurante no encontrado
        }
    }

    public List<String> buscarRestaurantesDisponibles(String cedula, String fecha, String hora) {

        List<Restaurante> restaurantes = restauranteDAO.listarRestaurantesDisponibles();
        List<String> restaurantesDisponibles = new ArrayList<>();

        for (Restaurante restaurante : restaurantes) {
            if (validarAforoDisponible(restaurante.getNombre(), 1, fecha, hora)) {
                restaurantesDisponibles.add(restaurante.getNombre());
            }
        }

        return restaurantesDisponibles;
    }
    public List <Restaurante> listarReservasPorRestaurante(){
        List<Restaurante> restaurantesDisponibles = new ArrayList<>();
    for (Reserva reserva : reservas) {
      Restaurante restaurante = reserva.getRestaurante(); // Assuming access to the restaurant in Reserva
      restaurantesDisponibles.add(restaurante);
    }

    return restaurantesDisponibles;
    }

    public List<Reserva> buscarReservasPorCedulaCliente(String cedulaCliente) {
    List<Reserva> reservasCliente = new ArrayList<>();
    for (Reserva reserva : reservas) { 
        if (reserva.getCliente().equals(cedulaCliente)) {
            reservasCliente.add(reserva);
        }
    }
    return reservasCliente;
}

public List<Reserva> obtenerReservasPorCliente(String cedula) {
    Cliente cliente = clienteDAO.buscarClientePorCedula(cedula);
    if (cliente != null) {
        return cliente.getReservas(); 
    } else {
        return new ArrayList<>(); 
    }
}

}

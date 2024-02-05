/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.ordonezpenaloza.kelly.examenfinal.controlador;

import ec.edu.ups.ordonezpenaloza.kelly.examenfinal.IDAO.ReservaIDAO;
import ec.edu.ups.ordonezpenaloza.kelly.examenfinal.IDAO.RestauranteIDAO;
import ec.edu.ups.ordonezpenaloza.kelly.examenfinal.modelo.Reserva;
import ec.edu.ups.ordonezpenaloza.kelly.examenfinal.modelo.Restaurante;

/**
 *
 * @author ESTUDIANTE
 */
public class ReservaControlador {
    private RestauranteIDAO restauranteDAO;
    private ReservaIDAO reservaDAO;
    private Reserva reserva;

    public ReservaControlador(ReservaIDAO reservaDAO) {
        this.reservaDAO = reservaDAO;
    }
    public String crearReserva(String cedulaCliente, String nombreRestaurante, int numeroPersonas, String fecha, String hora) {
        reserva = new Reserva(cedulaCliente, nombreRestaurante, numeroPersonas, fecha, hora);
        reservaDAO.crearReserva(reserva);
        return null;
    }

    public boolean validarAforoDisponible(String nombreRestaurante, int numeroPersonas, String fecha, String hora) {
    Restaurante restaurante = restauranteDAO.buscarRestaurantePorNombre(nombreRestaurante);
    int aforoDisponible = Integer.parseInt(restaurante.getAforoDisponible());
    int aforoRestante = aforoDisponible - numeroPersonas;
    return aforoRestante >= 0;
    }
}

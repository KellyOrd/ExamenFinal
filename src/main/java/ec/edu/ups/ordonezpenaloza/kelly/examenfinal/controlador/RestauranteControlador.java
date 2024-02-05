/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.ordonezpenaloza.kelly.examenfinal.controlador;

import ec.edu.ups.ordonezpenaloza.kelly.examenfinal.IDAO.RestauranteIDAO;
import ec.edu.ups.ordonezpenaloza.kelly.examenfinal.modelo.Reserva;
import ec.edu.ups.ordonezpenaloza.kelly.examenfinal.modelo.Restaurante;
import java.util.List;

/**
 *
 * @author ESTUDIANTE
 */
public class RestauranteControlador {
    private RestauranteIDAO restauranteDAO;
    private Restaurante restaurante;

    public RestauranteControlador(RestauranteIDAO restauranteDAO) {
        this.restauranteDAO = restauranteDAO;
    }
    
    public Restaurante registrarRestaurante(String nombre, String direccion, String telefono, String aforoMaximo, String aforoDisponible){
        restaurante = new Restaurante(nombre,direccion,telefono,aforoMaximo, aforoDisponible);
        restauranteDAO.registrarRestaurante(restaurante);
        return restaurante;
    }

    public boolean validarAforoDisponible(String nombreRestaurante, int numeroPersonas, String fecha, String hora) {
    Restaurante restaurante = restauranteDAO.buscarRestaurantePorNombre(nombreRestaurante);
    int aforoDisponible = Integer.parseInt(restaurante.getAforoDisponible());
    int aforoRestante = aforoDisponible - numeroPersonas;
    return aforoRestante >= 0;
    }


    public Restaurante buscarRestaurantePorNombre(String nombreRestaurante) {
        restaurante = restauranteDAO.buscarRestaurantePorNombre(nombreRestaurante);
        return restaurante;
    }

    public List<Reserva> buscarReservasPorNombreRestauranteFecha(String nombreRestaurante, String fechaReservacion) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}

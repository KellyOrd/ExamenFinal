/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.ordonezpenaloza.kelly.examenfinal.IDAO;

import ec.edu.ups.ordonezpenaloza.kelly.examenfinal.modelo.Reserva;
import ec.edu.ups.ordonezpenaloza.kelly.examenfinal.modelo.Restaurante;
import java.util.List;

/**
 *
 * @author ESTUDIANTE
 */
public interface RestauranteIDAO {
    void registrarRestaurante(Restaurante restaurante);
    Restaurante buscarRestaurantePorNombre(String nombre);
    List<Reserva> listarReservasPorRestaurante(String nombre, String fecha);
    void actualizarAforoDisponible(String nombre, int aforo);

    public void actualizarRestaurante(Restaurante restaurante);
    public List<Restaurante> listarRestaurantesDisponibles();
}

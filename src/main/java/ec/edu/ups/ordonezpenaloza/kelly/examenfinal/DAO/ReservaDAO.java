/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.ordonezpenaloza.kelly.examenfinal.DAO;

import ec.edu.ups.ordonezpenaloza.kelly.examenfinal.IDAO.ReservaIDAO;
import ec.edu.ups.ordonezpenaloza.kelly.examenfinal.modelo.Reserva;
import ec.edu.ups.ordonezpenaloza.kelly.examenfinal.modelo.Restaurante;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ESTUDIANTE
 */
public class ReservaDAO implements ReservaIDAO{
    private List<Reserva> reservas;

    public ReservaDAO() {
        reservas = new ArrayList<>();
    }

    @Override
    public void crearReserva(Reserva reserva) {
        reservas.add(reserva);
    }

    @Override
    public boolean validarAforoDisponible(String nombreRestaurante, int numeroPersonas, String fecha, String hora) {
        Restaurante restaurante = buscarRestaurantePorNombre(nombreRestaurante);
        return restaurante.validarAforoDisponible(numeroPersonas);
    }

    private Restaurante buscarRestaurantePorNombre(String nombreRestaurante) {
        // Implementar la lógica para buscar un restaurante por nombre
        // ...
        return null; // Valor temporal para el ejemplo
    }
}


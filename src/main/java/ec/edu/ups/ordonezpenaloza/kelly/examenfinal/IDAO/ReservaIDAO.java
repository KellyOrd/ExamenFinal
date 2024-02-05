/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.ordonezpenaloza.kelly.examenfinal.IDAO;

import ec.edu.ups.ordonezpenaloza.kelly.examenfinal.modelo.Reserva;
import java.io.RandomAccessFile;

/**
 *
 * @author ESTUDIANTE
 */
public interface ReservaIDAO {
    void crearReserva(Reserva reserva);
    boolean validarAforoDisponible(String nombreRestaurante, int numeroPersonas, String fecha, String hora);
    //void escribirReservaEnArchivo(RandomAccessFile raf, Reserva reserva);
}

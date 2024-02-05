/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.ordonezpenaloza.kelly.examenfinal.IDAO;

import ec.edu.ups.ordonezpenaloza.kelly.examenfinal.modelo.Cliente;
import ec.edu.ups.ordonezpenaloza.kelly.examenfinal.modelo.Reserva;
import java.io.RandomAccessFile;
import java.util.List;

/**
 *
 * @author ESTUDIANTE
 */
public interface ClienteIDAO {
    void registrarCliente(Cliente cliente);
    Cliente buscarClientePorCedula(String cedula);
    List<Reserva> listarReservaPorClientes(String cedula);
    void actualizarCliente(Cliente cliente);
    //void cargarUsuariosEnArchivos();
    //Cliente leerClienteDesdeArchivo(RandomAccessFile raf);
    //void escribirClientesEnArchivo(RandomAccessFile raf, Cliente cliente);
    //void guardarDatosEnArchivo();
}

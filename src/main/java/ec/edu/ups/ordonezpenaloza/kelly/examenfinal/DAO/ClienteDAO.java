/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.ordonezpenaloza.kelly.examenfinal.DAO;

import ec.edu.ups.ordonezpenaloza.kelly.examenfinal.IDAO.ClienteIDAO;
import ec.edu.ups.ordonezpenaloza.kelly.examenfinal.modelo.Cliente;
import ec.edu.ups.ordonezpenaloza.kelly.examenfinal.modelo.Reserva;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author ESTUDIANTE
 */
public class ClienteDAO implements ClienteIDAO{
private List<Cliente> clientes;
  private List<Reserva> reservas;

  public ClienteDAO() {
    clientes = new ArrayList<>();
    //reservas = new ArrayList<>();
  }

  @Override
  public void registrarCliente(Cliente cliente) {
    clientes.add(cliente);
  }

  @Override
  public Cliente buscarClientePorCedula(String cedula) {
    for (Cliente cliente : clientes) {
      if (cliente.getCedula().equals(cedula)) {
        return cliente;
      }
    }
    return null;
  }

  @Override
  public List<Reserva> listarReservaPorClientes(String cedula) {
    List<Reserva> reservasCliente = new ArrayList<>();
  for (Reserva reserva : reservas) {
    if (reserva.getCliente().equals(cedula)) { 
      reservasCliente.add(reserva);
    }
  }
  return reservasCliente;
  }

@Override
  public void actualizarCliente(Cliente cliente) {
      for (int i = 0; i < clientes.size(); i++) {
            Cliente clienteEncontrado = clientes.get(i);
            if (clienteEncontrado.getCedula().equalsIgnoreCase(cliente.getCedula())) {
                clientes.set(i, cliente);
                break;
            }
      }
  }

}
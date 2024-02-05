/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.ordonezpenaloza.kelly.examenfinal.DAO;

import ec.edu.ups.ordonezpenaloza.kelly.examenfinal.IDAO.RestauranteIDAO;
import ec.edu.ups.ordonezpenaloza.kelly.examenfinal.modelo.Reserva;
import ec.edu.ups.ordonezpenaloza.kelly.examenfinal.modelo.Restaurante;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ESTUDIANTE
 */
public class RestauranteDAO implements RestauranteIDAO{
    private List<Restaurante> restaurantes;
    private List<Reserva> reserva;
    private Restaurante restaurante;
    
    public RestauranteDAO(){
        restaurantes = new ArrayList<>();
    }

    @Override
    public void registrarRestaurante(Restaurante restaurante) {
        restaurantes.add(restaurante);
    }

    @Override
    public Restaurante buscarRestaurantePorNombre(String nombre) {
        for (Restaurante restaurante : restaurantes) {
            if (restaurante.getNombre() == nombre) {
                return restaurante;
            }
        }
        return null;
    }

    @Override
    public List<Reserva> listarReservasPorRestaurante(String nombre, String fecha) {
        return reserva;
    }

    @Override
    public void actualizarAforoDisponible(String nombre, int aforo) {
        for(int i=0; i<restaurantes.size(); i++){
            Restaurante restauranteBuscado=restaurantes.get(i);
            if(restauranteBuscado.getNombre()==nombre){
                restaurantes.set(i,restaurante);
                break;
            }
        }
    }

    @Override
    public void actualizarRestaurante(Restaurante restaurante) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Restaurante> listarRestaurantesDisponibles() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}

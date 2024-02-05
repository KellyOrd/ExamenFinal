/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.ordonezpenaloza.kelly.examenfinal.modelo;

import java.util.Objects;

/**
 *
 * @author ESTUDIANTE
 */
public class Restaurante {
    private String nombre;
    private String direccion;
    private String telefono;
    private String aforoMaximo;
    private String aforoDisponible;

    public Restaurante(String nombre, String direccion, String telefono, String aforoMaximo, String aforoDisponible) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.aforoMaximo = aforoMaximo;
        this.aforoDisponible = aforoDisponible;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getAforoMaximo() {
        return aforoMaximo;
    }

    public void setAforoMaximo(String aforoMaximo) {
        this.aforoMaximo = aforoMaximo;
    }

    public String getAforoDisponible() {
        return aforoDisponible;
    }

    public void setAforoDisponible(String aforoDisponible) {
        this.aforoDisponible = aforoDisponible;
    }
    public void actualizarAforoDisponible(int nuevoAforoDisponible) {
        this.aforoDisponible = String.valueOf(nuevoAforoDisponible);
    }
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.nombre);
        hash = 89 * hash + Objects.hashCode(this.direccion);
        hash = 89 * hash + Objects.hashCode(this.telefono);
        hash = 89 * hash + Objects.hashCode(this.aforoMaximo);
        hash = 89 * hash + Objects.hashCode(this.aforoDisponible);
        return hash;
    }
    

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Restaurante other = (Restaurante) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.direccion, other.direccion)) {
            return false;
        }
        if (!Objects.equals(this.telefono, other.telefono)) {
            return false;
        }
        if (!Objects.equals(this.aforoMaximo, other.aforoMaximo)) {
            return false;
        }
        return Objects.equals(this.aforoDisponible, other.aforoDisponible);
    }

    @Override
    public String toString() {
        return "Restaurante{" + "nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono + ", aforoMaximo=" + aforoMaximo + ", aforoDisponible=" + aforoDisponible + '}';
    }

    public boolean validarAforoDisponible(int numeroPersonas) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Restaurante buscarRestaurantePorNombre(String nombreRestaurante) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    
}
//nombre, dirección, teléfono y máximo número de aforo 
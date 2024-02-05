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
public class Reserva {
    private String cedulaCliente;
    private String nombreRestaurante;
    private int numeroPersonas;
    private String fecha;
    private String hora;
    
    
    //cedulaCliente nombreRest numper fecha hora

    public Reserva(String cedulaCliente, String nombreRestaurante, int numeroPersonas, String fecha, String hora) {
        this.cedulaCliente = cedulaCliente;
        this.nombreRestaurante = nombreRestaurante;
        this.numeroPersonas = numeroPersonas;
        this.fecha = fecha;
        this.hora = hora;
    }

    public String getCedulaCliente() {
        return cedulaCliente;
    }

    public void setCedulaCliente(String cedulaCliente) {
        this.cedulaCliente = cedulaCliente;
    }

    public String getNombreRestaurante() {
        return nombreRestaurante;
    }

    public void setNombreRestaurante(String nombreRestaurante) {
        this.nombreRestaurante = nombreRestaurante;
    }

    public int getNumeroPersonas() {
        return numeroPersonas;
    }

    public void setNumeroPersonas(int numeroPersonas) {
        this.numeroPersonas = numeroPersonas;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.cedulaCliente);
        hash = 29 * hash + Objects.hashCode(this.nombreRestaurante);
        hash = 29 * hash + this.numeroPersonas;
        hash = 29 * hash + Objects.hashCode(this.fecha);
        hash = 29 * hash + Objects.hashCode(this.hora);
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
        final Reserva other = (Reserva) obj;
        if (this.numeroPersonas != other.numeroPersonas) {
            return false;
        }
        if (!Objects.equals(this.cedulaCliente, other.cedulaCliente)) {
            return false;
        }
        if (!Objects.equals(this.nombreRestaurante, other.nombreRestaurante)) {
            return false;
        }
        if (!Objects.equals(this.fecha, other.fecha)) {
            return false;
        }
        return Objects.equals(this.hora, other.hora);
    }

    @Override
    public String toString() {
        return "Reserva{" + "cedulaCliente=" + cedulaCliente + ", nombreRestaurante=" + nombreRestaurante + ", numeroPersonas=" + numeroPersonas + ", fecha=" + fecha + ", hora=" + hora + '}';
    }

    public Restaurante getRestaurante() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Object getNombreCliente() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Object getCliente() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getCedula() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}

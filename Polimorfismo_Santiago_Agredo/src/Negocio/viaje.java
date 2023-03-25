/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio;

/**
 *
 * @author agred
 */
import java.util.Date;

public abstract class viaje {
    protected String origen;
    protected String destino;
    protected int costo;
    protected Date fechaDeSalida;
    protected Date fechaDeLlegada;

    public viaje(String origen, String destino, int costo, Date fechaDeSalida, Date fechaDeLlegada) {
        this.origen = origen;
        this.destino = destino;
        this.costo = costo;
        this.fechaDeSalida = fechaDeSalida;
        this.fechaDeLlegada = fechaDeLlegada;
    }

    public abstract String descripcion();

    public String cualquierMetodo() {
        return "Este es cualquier método.";
    }

    public String cualquierMetodo2() {
        return "Este es cualquier método 2.";
    }

    // Getters y Setters
    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public Date getFechaDeSalida() {
        return fechaDeSalida;
    }

    public void setFechaDeSalida(Date fechaDeSalida) {
        this.fechaDeSalida = fechaDeSalida;
    }

    public Date getFechaDeLlegada() {
        return fechaDeLlegada;
    }

    public void setFechaDeLlegada(Date fechaDeLlegada) {
        this.fechaDeLlegada = fechaDeLlegada;
    }
}
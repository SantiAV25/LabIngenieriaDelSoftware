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

public class viajeFamiliar extends viaje {
    private int familia;

    public viajeFamiliar(String origen, String destino, int costo, Date fechaDeSalida, Date fechaDeLlegada, int familia) {
        super(origen, destino, costo, fechaDeSalida, fechaDeLlegada);
        this.familia = familia;
    }

    @Override
    public String descripcion() {
        return "Un viaje para disfrutar en familia";
    }

    @Override
    public String cualquierMetodo2() {
        return "Método implementado en la clase hija ViajeFamiliar";
    }

    // Getters y Setters
    public int getFamilia() {
        return familia;
    }

    public void setFamilia(int familia) {
        this.familia = familia;
    }
}
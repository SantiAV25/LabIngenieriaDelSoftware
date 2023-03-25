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

public class viajeIndividual extends viaje {
    public viajeIndividual(String origen, String destino, int costo, Date fechaDeSalida, Date fechaDeLlegada) {
        super(origen, destino, costo, fechaDeSalida, fechaDeLlegada);
    }

    @Override
    public String descripcion() {
        return "Disfruta tu viaje individual";
    }
}
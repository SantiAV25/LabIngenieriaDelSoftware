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

public class viajeTodoIncluido extends viaje {
    
    public viajeTodoIncluido(String origen, String destino, int costo, Date fechaDeSalida, Date fechaDeLlegada) {
        super(origen, destino, costo, fechaDeSalida, fechaDeLlegada);
    }

    @Override
    public String descripcion() {
        return "Disfruta tu viaje todo incluido";
    }
}
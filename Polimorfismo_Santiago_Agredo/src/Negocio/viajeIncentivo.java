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

public class viajeIncentivo extends viaje {
    private String empresa;

    public viajeIncentivo(String origen, String destino, int costo, Date fechaDeSalida, Date fechaDeLlegada, String empresa) {
        super(origen, destino, costo, fechaDeSalida, fechaDeLlegada);
        this.empresa = empresa;
    }

    @Override
    public String descripcion() {
        return "Un viaje Incentivo dado por la " + empresa;
    }

    @Override
    public String cualquierMetodo2() {
        return "Método implementado en la clase hija ViajeIncentivo";
    }

    // Getters y Setters
    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
}
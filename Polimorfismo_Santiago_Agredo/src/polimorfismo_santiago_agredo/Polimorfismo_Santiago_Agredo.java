/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package polimorfismo_santiago_agredo;
import Negocio.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author agred
 */
public class Polimorfismo_Santiago_Agredo {

    /**
     * @param args the command line arguments
     */
    public static List<viaje> viajes = new ArrayList<viaje>();
    public static void main(String[] args) {
        
        leerViajer();
        MostrarViaje();
        // TODO code application logic here
    }
    
    public static void leerViajer(){
       
        viajeFamiliar viajeFamiliar = new viajeFamiliar("Ciudad de México", "Acapulco", 7000, new Date(123456789), new Date(1234567890), 5);
        viajes.add(viajeFamiliar);
        
        viajeIncentivo viajeIncentivo = new viajeIncentivo("Ciudad de México", "Los Cabos", 10000, new Date(123456789), new Date(1234567890), "Emtel");
        viajes.add(viajeIncentivo);
        
        viajeIndividual viajeIndividual = new viajeIndividual("Ciudad de México", "Puerto Vallarta", 4000, new Date(123456789), new Date(1234567890));
        viajes.add(viajeIndividual);
        
        viajeTodoIncluido viajeTodoIncluido = new viajeTodoIncluido("Ciudad de México", "Riviera Maya", 8000, new Date(123456789), new Date(1234567890));
        viajes.add(viajeTodoIncluido);
     }
    public static void MostrarViaje(){
                for (viaje v : viajes) {
            System.out.println("Tipo de viaje: " + v.getClass().getSimpleName());
            System.out.println("Origen: " + v.getOrigen());
            System.out.println("Destino: " + v.getDestino());
            System.out.println("Costo: " + v.getCosto());
            System.out.println("Fecha de salida: " + v.getFechaDeSalida());
            System.out.println("Fecha de llegada: " + v.getFechaDeLlegada());
            
            if (v instanceof viajeFamiliar) {
                viajeFamiliar vf = (viajeFamiliar) v;
                System.out.println("Número de personas en el grupo: " + vf.getFamilia());
            }
            
            if (v instanceof viajeIncentivo) {
                viajeIncentivo vi = (viajeIncentivo) v;
                System.out.println("Empresa: " + vi.getEmpresa());
            }
            
            System.out.println("----------------------");
        }
    }

    }


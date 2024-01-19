/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Eventos;

import java.util.Calendar;
import javax.swing.JComboBox;

/**
 *
 * @author Josue Gavidia
 */
public class EventoDeportivo extends EventoBase {

    protected Equipo equipo1;
    protected Equipo equipo2;
    protected  Enums.tipoDeporte sport;

    public EventoDeportivo(int codigo, String titulo, String descripcion, Calendar fechaRealizacion, double renta) {
        super(codigo, titulo, descripcion, fechaRealizacion, renta);

    }
    
     public class Equipo {

        public String teamName;
        public String jugadores[];

        public Equipo(String teamName, String[] jugadores) {
            this.teamName = teamName;
            this.jugadores = jugadores;
        }

    }

  
    public  Enums.tipoDeporte getSportType_from_Combo(JComboBox box) {
        String item = box.getSelectedItem().toString();
        for (Enums.tipoDeporte scout : Enums.tipoDeporte.values()) {
            if (item.equals(scout.toString())) {
               return scout;
            }
        }
        System.out.println("KILL ME ALREADY");
        return null;
    }
    
  
    
    public void setSport(Enums.tipoDeporte a){
       sport = a;
    }

   

  

}

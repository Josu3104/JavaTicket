/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Eventos;

import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author Josue Gavidia
 */
public class EventoDeportivo extends EventoBase {

    protected ArrayList<Equipo> equipo1;
    protected ArrayList<Equipo> equipo2;
    protected  Enums.tipoDeporte sport;

    public EventoDeportivo(int codigo, String titulo, String descripcion, Calendar fechaRealizacion, double renta, Enums.tipoDeporte sport) {
        super(codigo, titulo, descripcion, fechaRealizacion, renta);
        this.sport = sport;
        equipo1 = new ArrayList<>();
        equipo2 = new ArrayList<>();
    }
    
     public class Equipo {

        public String teamName;
        public String jugadores[];

        public Equipo(String teamName, String[] jugadores) {
            this.teamName = teamName;
            this.jugadores = jugadores;
        }

    }

  
  
    
  
    
 
    
    

   

  

}

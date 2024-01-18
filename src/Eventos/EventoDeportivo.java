/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Eventos;

import java.util.Date;

/**
 *
 * @author Josue Gavidia
 */
public class EventoDeportivo extends EventoBase {
   protected String equipo1;
   protected String equipo2;
   
   
   
   
   public enum tipoDeporte {
       FUTBOL,
       TENIS,
       RUGBY,
       BASEBALL
   }
   
    public EventoDeportivo(int codigo, String titulo, String descripcion, Date fechaRealizacion, double renta) {
        super(codigo, titulo, descripcion, fechaRealizacion, renta);
        
        
    }
    
}

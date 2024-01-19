/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Eventos;

import java.util.Calendar;

/**
 *
 * @author Josue Gavidia
 */
public class EventoReligioso extends EventoBase {
    protected int convertidos;

    public EventoReligioso(int codigo, String titulo, String descripcion, Calendar fechaRealizacion, double renta) {
        super(codigo, titulo, descripcion, fechaRealizacion, renta);

    }

    public int getConvertidos() {
        return convertidos;
    }

    public void setConvertidos(int convertidos) {
        this.convertidos = convertidos;
    }

  
}

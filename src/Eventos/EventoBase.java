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
public abstract class EventoBase {
    protected int codigo;
    protected String titulo;
    protected String descripcion;
    protected Date fechaRealizacion;
    protected double renta;

    public EventoBase(int codigo, String titulo, String descripcion, Date fechaRealizacion, double renta) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechaRealizacion = fechaRealizacion;
        this.renta = renta;
    }
    
    public enum tipoEvento
   
}

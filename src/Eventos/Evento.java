/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Eventos;

import Eventos.Enums.tipoDeporte;
import Eventos.Enums.tipoEvento;
import Eventos.Enums.tipoMusica;
import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author Josue Gavidia
 */
public class Evento {
    protected int cantPersonas;
    protected int codigo;
    protected String titulo;
    protected String descripcion;
    protected Calendar fechaRealizacion;
    protected double renta;
    private Evento[] eventos;
    protected String tipo;
    private int cont;

    public Evento(int cantPersonas,int codigo, String titulo, String descripcion,  Calendar fechaRealizacion, double renta) {
        this.cantPersonas = cantPersonas;
        this.codigo = codigo;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechaRealizacion = fechaRealizacion;
        this.renta = renta;
        cont = 0;
        eventos = new Evento[100];
    }

    public Evento searchEvent(int code) {
        for (int i = 0; i <= cont; i++) {
            if (eventos[i] != null && eventos[i].getCodigo() == code) {
                return eventos[i];
                //Encuentra el evento con dicho codigo
            }

        }
        return null;
    }

    public void createEvent(int cantPersonas,int codigo, String titulo, String descripcion, Calendar fechaRealizacion, double renta, tipoEvento tipoE, tipoMusica tipoM, tipoDeporte tipoS, String T1, String T2) {
        Evento temp = searchEvent(codigo);
        EventoMusical tempMusic;
        EventoDeportivo tempSport;
        EventoReligioso tempRel;

        if (temp == null) {
            switch (tipoE) {
                case DEPORTIVO:
                    
                    tempSport = new EventoDeportivo( cantPersonas,codigo, titulo, descripcion, fechaRealizacion, renta, T1, T2);

                    switch (tipoS) {
                        case FUTBOL:
                            tempSport.sport = "FUTBOL";
                            break;
                        case BASEBALL:
                            tempSport.sport = "BASEBALL";
                            break;
                        case RUGBY:
                            tempSport.sport = "RUGBY";
                            break;
                        case TENIS:
                            tempSport.sport = "TENIS";
                            break;

                    }

                    eventos[cont] = tempSport;
                    System.out.println(eventos[cont].toString());
                    cont++;
                    break;
                case MUSICAL:
                    tempMusic = new EventoMusical( cantPersonas,codigo, titulo, descripcion, fechaRealizacion, renta);

                    //POP, ROCK, RAP, CLASICA, REGGEATON, OTRO
                    switch (tipoM) {
                        case POP:
                            tempMusic.musicType = "POP";
                            break;
                        case ROCK:
                            tempMusic.musicType = "ROCK";
                            break;
                        case RAP:
                            tempMusic.musicType = "RAP";
                            break;
                        case CLASICA:
                            tempMusic.musicType = "CLASICA";
                            break;
                        case REGGEATON:
                            tempMusic.musicType = "REGGEATON";
                            break;
                        case OTRO:
                            tempMusic.musicType = "OTRO";
                            break;
                    }
                    eventos[cont] = tempMusic;
                    System.out.println(eventos[cont].toString());
                    cont++;
                    break;
                case RELIGIOSO:
                    tempRel = new EventoReligioso( cantPersonas,codigo, titulo, descripcion, fechaRealizacion, renta);
                    eventos[cont] = tempRel;
                    System.out.println(eventos[cont].toString());
                    cont++;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "SELECCIONE UN TIPO DE EVENTO");
                    break;
            }
        }
         
    }

//AQUI SE FILTRAN TODAS LAS FUNCIONES QUE ESTAN CREADAS CON EL FIN DE CREAR UN EVENTO INDIVIDUAL-----INCOMPLETE
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Calendar getFechaRealizacion() {
        return fechaRealizacion;
    }

    public void setFechaRealizacion(Calendar fechaRealizacion) {
        this.fechaRealizacion = fechaRealizacion;
    }

    public double getRenta() {
        return renta;
    }

    public void setRenta(double renta) {
        this.renta = renta;
    }

}

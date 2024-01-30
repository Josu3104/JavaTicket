/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Eventos;

import Eventos.Enums.tipoDeporte;
import Eventos.Enums.tipoEvento;
import Eventos.Enums.tipoMusica;
import GUI.Sistema;
import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author Josue Gavidia
 */
public class Evento {
   
    protected boolean cancelado;
    protected boolean realizado;
    protected String tipoEvento;
    protected int cantPersonas;
    protected int codigo;
    protected String titulo;
    protected String descripcion;
    protected Calendar fechaRealizacion;
    protected double renta;
    public Evento[] eventos;
    private int cont;
    
    public Evento(int cantPersonas, int codigo, String titulo, String descripcion, Calendar fechaRealizacion, double renta) {
        this.cantPersonas = cantPersonas;
        this.codigo = codigo;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechaRealizacion = fechaRealizacion;
        this.renta = renta;
        cont = 0;
        eventos = new Evento[100];
        cancelado = false;
        realizado = false;
        
    }
    
    public Evento searchEvent(int code) {
        for (int i = 0; i <= cont; i++) {
            if (eventos[i] != null && eventos[i].codigo == code) {
                return eventos[i];
                //Encuentra el evento con dicho codigo
            }
            
        }
        return null;
    }
    
    public void createEvent(int cantPersonas, int codigo, String titulo, String descripcion, Calendar fechaRealizacion, double renta, tipoEvento tipoE, tipoMusica tipoM, tipoDeporte tipoS, String T1, String T2) {
        Evento temp = searchEvent(codigo);
        EventoMusical tempMusic;
        EventoDeportivo tempSport;
        EventoReligioso tempRel;
        
        if (temp == null) {
            switch (tipoE) {
                case DEPORTIVO:
                    
                    tempSport = new EventoDeportivo(cantPersonas, codigo, titulo, descripcion, fechaRealizacion, renta, T1, T2);
                    
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
                    tempSport.tipoEvento = "deportivo";
                    System.out.println(tempSport.tipoEvento);
                    eventos[cont] = tempSport;
                    addEventTo(tempSport);
                    System.out.println(eventos[cont].toString());
                    cont++;
                    break;
                case MUSICAL:
                    tempMusic = new EventoMusical(cantPersonas, codigo, titulo, descripcion, fechaRealizacion, renta);

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
                    
                    tempMusic.tipoEvento = "musical";
                    System.out.println(tempMusic.musicType);
                    eventos[cont] = tempMusic;
                    addEventTo(tempMusic);
                    System.out.println(eventos[cont].toString());
                    cont++;
                    break;
                case RELIGIOSO:
                    tempRel = new EventoReligioso(cantPersonas, codigo, titulo, descripcion, fechaRealizacion, renta);
                    tempRel.tipoEvento = "religioso";
                    eventos[cont] = tempRel;
                    addEventTo(tempRel);
                    System.out.println(eventos[cont].toString());
                    cont++;
                    break;
                
            }
        }
        
    }
    
    private void addEventTo(Evento event) {
        for (int i=0;i<Sistema.usuarios.length;i++) {
            if (Sistema.usuarios[i] != null) {
                if (Sistema.usuarios[i].getUsername().equals(Sistema.loggeado)) {
                    if (Sistema.loggeado.equals("admin")) {
                        Sistema.usuarios[i].getEventosCreadosPor().add(event);
                        System.out.println("Event added to "+Sistema.usuarios[i].getUsername());
                        JOptionPane.showMessageDialog(null, "SIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
                    }else{
                        Sistema.usuarios[i].getEventosCreadosPor().add(event);
                        System.out.println("Event added to "+Sistema.usuarios[i].getUsername());
                    }
                }
            }
        }
    }
    
    
    
}

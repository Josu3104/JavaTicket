/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Eventos;

import Eventos.Enums.tipoDeporte;
import Eventos.Enums.tipoEvento;
import Eventos.Enums.tipoMusica;
import GUI.Sistema;
import static GUI.Sistema.fechaNeitor;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;

/**
 *
 * @author Josue Gavidia
 */
public class Evento {

    protected boolean cancelado;
    protected boolean realizado;
    public tipoEvento eventoTipo;
    protected int cantPersonas;
    protected int codigo;
    protected String titulo;
    protected String descripcion;
    protected Calendar fechaRealizacion;
    protected double renta;
    static public ArrayList<Evento> eventos = new ArrayList();

    public Evento(int cantPersonas, int codigo, String titulo, String descripcion, double renta) {
        this.cantPersonas = cantPersonas;
        this.codigo = codigo;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechaRealizacion = Calendar.getInstance();
        this.renta = renta;
        cancelado = false;
        realizado = false;

    }

    public Evento searchEvent(int code) {
        if (eventos.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No se han creado eventos");
            return null;
        }
        for (Evento a : eventos) {
            if (a != null && a.codigo == code) {
                return a;
                //Encuentra el evento con dicho codigo
            }

        }

        return null;

    }

    public Evento createEvent(int cantPersonas, int codigo, String titulo, String descripcion, double renta, tipoEvento tipoE, tipoMusica tipoM, tipoDeporte tipoS, String T1, String T2) {

        EventoMusical tempMusic;
        EventoDeportivo tempSport;
        EventoReligioso tempRel;

        switch (tipoE) {
            case DEPORTIVO:

                tempSport = new EventoDeportivo(cantPersonas, codigo, titulo, descripcion, renta, T1, T2);
                tempSport.fechaRealizacion.setTime(Sistema.dateSelected);

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
                //GYYAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAATTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT
                tempSport.eventoTipo = tipoEvento.DEPORTIVO;
                System.out.println(tempSport.eventoTipo);
                eventos.add(tempSport);
                System.out.println(fechaNeitor.format(tempSport.fechaRealizacion.getTime()));
                System.out.println(eventos.get(0).toString());
                addEventTo(tempSport);
                return tempSport;

            case MUSICAL:
                tempMusic = new EventoMusical(cantPersonas, codigo, titulo, descripcion, renta);
                tempMusic.fechaRealizacion.setTime(Sistema.dateSelected);

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

                System.out.println(tempMusic.musicType);
                eventos.add(tempMusic);
                addEventTo(tempMusic);

                return tempMusic;
            case RELIGIOSO:
                tempRel = new EventoReligioso(cantPersonas, codigo, titulo, descripcion, renta);
                tempRel.fechaRealizacion.setTime(Sistema.dateSelected);
                eventos.add(tempRel);
                addEventTo(tempRel);

                return tempRel;

        }
        return null;

    }

    private void addEventTo(Evento event) {
        for (int i = 0; i < Sistema.usuarios.length; i++) {
            if (Sistema.usuarios[i] != null) {
                if (Sistema.usuarios[i].getUsername().equals(Sistema.loggeado)) {

                    Sistema.usuarios[i].getEventosCreadosPor().add(event);
                    System.out.println("Event added to " + Sistema.usuarios[i].getUsername());
                    JOptionPane.showMessageDialog(null, "Evento Creado");
                }
            }
        }
    }

    public void print(int code, JLabel tipo, JLabel cant, JLabel codigo, JLabel title, JLabel desc, JLabel fecha, JLabel equipo1, JLabel equipo2,
            JList playersT1, JList playersT2, JLabel tipoMusica, JLabel tipoDeporte, JList musicos, JLabel personasConvertidas) {

    }

}

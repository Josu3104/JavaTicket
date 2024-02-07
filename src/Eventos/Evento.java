/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Eventos;

import Eventos.Enums.tipoDeporte;
import Eventos.Enums.tipoEvento;
import static Eventos.Enums.tipoEvento.DEPORTIVO;
import static Eventos.Enums.tipoEvento.MUSICAL;
import static Eventos.Enums.tipoEvento.RELIGIOSO;
import Eventos.Enums.tipoMusica;
import GUI.Sistema;
import static GUI.Sistema.fechaNeitor;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

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
    public static boolean kiwi;
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
        kiwi = true;
    }

    public final Evento searchEvent(int code) {

        for (Evento a : eventos) {
            if (a != null && a.codigo == code) {
                return a;
                //Encuentra el evento con dicho codigo
            }

        }

        return null;

    }

    public final void createEvent(int cantPersonas, int codigo, String titulo, String descripcion, double renta, tipoEvento tipoE, tipoMusica tipoM, tipoDeporte tipoS, String T1, String T2) {

        EventoMusical tempMusic;
        EventoDeportivo tempSport;
        EventoReligioso tempRel;
        if (isCodeOriginal(codigo)) {
            switch (tipoE) {
                case DEPORTIVO:

                    tempSport = new EventoDeportivo(cantPersonas, codigo, titulo, descripcion, renta, T1, T2);
                    tempSport.fechaRealizacion.setTime(Sistema.dateSelected);

                    switch (tipoS) {
                        case FUTBOL:
                            tempSport.sport = tipoDeporte.TENIS;
                            break;
                        case BASEBALL:
                            tempSport.sport = tipoDeporte.BASEBALL;
                            break;
                        case RUGBY:
                            tempSport.sport = tipoDeporte.RUGBY;
                            break;
                        case TENIS:
                            tempSport.sport = tipoDeporte.TENIS;
                            break;

                    }
                    //GYYAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAATTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT
                    tempSport.eventoTipo = tipoEvento.DEPORTIVO;
                    System.out.println(tempSport.eventoTipo);
                    eventos.add(tempSport);
                    System.out.println(fechaNeitor.format(tempSport.fechaRealizacion.getTime()));
                    System.out.println(eventos.get(0).toString());
                    addEventTo(tempSport);
                    break;
                case MUSICAL:
                    double seguro = 0;
                    tempMusic = new EventoMusical(cantPersonas, codigo, titulo, descripcion, renta);
                    tempMusic.fechaRealizacion.setTime(Sistema.dateSelected);
                    seguro = 0.30 * tempMusic.renta;
                    tempMusic.renta += seguro;
                    //POP, ROCK, RAP, CLASICA, REGGEATON, OTRO
                    switch (tipoM) {
                        case POP:
                            tempMusic.musicType = tipoMusica.POP;
                            break;
                        case ROCK:
                            tempMusic.musicType = tipoMusica.ROCK;
                            break;
                        case RAP:
                            tempMusic.musicType = tipoMusica.RAP;
                            break;
                        case CLASICA:
                            tempMusic.musicType = tipoMusica.CLASICA;
                            break;
                        case REGGEATON:
                            tempMusic.musicType = tipoMusica.REGGEATON;
                            break;
                        case OTRO:
                            tempMusic.musicType = tipoMusica.OTRO;
                            break;
                    }

                    System.out.println(tempMusic.musicType);
                    eventos.add(tempMusic);
                    addEventTo(tempMusic);
                    break;
                case RELIGIOSO:
                    tempRel = new EventoReligioso(cantPersonas, codigo, titulo, descripcion, renta);
                    tempRel.fechaRealizacion.setTime(Sistema.dateSelected);
                    tempRel.renta += 2000;
                    eventos.add(tempRel);
                    addEventTo(tempRel);
                    break;
            }
        }
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

    public boolean isCodeOriginal(int code) {
        if (searchEvent(code) != null) {
            JOptionPane.showMessageDialog(null, "EL CODIGO INGRESADO NO ES UNICO");
            kiwi = false;
            return false;
        }
        kiwi = true;
        return true;
    }

    public int getPos(int code) {
        for (int i = 0; i < eventos.size(); i++) {
            if (code == eventos.get(i).codigo) {
                return i;
            }
        }
        return -1;

    }

    public void editEvent(int code, JTextField cant, JTextField codigo, JTextField title, JTextField desc, Date fecha, JTextField equipo1, JTextField equipo2, JTextField renta,
            ArrayList jugadores1, ArrayList jugadores2, JTextField p1, JTextField p2, JLabel tipoMusica, JComboBox musicType, JLabel tipoDeporte, JComboBox sportType, ArrayList musicos, JTextField personasConvertidas, boolean editable) {

        Evento oldEvent = searchEvent(code);
        Calendar fechaNueva = Calendar.getInstance();
        tipoDeporte temp = null;
        JComboBox sporttt;
        tipoMusica temp2 = null;
        JComboBox musiccc;

        if (editable) {

            cant.setEditable(true);
            codigo.setEditable(true);
            title.setEditable(true);
            desc.setEditable(true);
            equipo1.setEditable(true);
            equipo2.setEditable(true);
            renta.setEditable(true);
            personasConvertidas.setEditable(true);
            
            //poner visibles las vainas para editar

            switch (oldEvent.eventoTipo) {

                case DEPORTIVO:
                    if (!jugadores1.isEmpty() && !jugadores2.isEmpty()) {

                        switch (sportType.getSelectedItem().toString()) {
                            case "FUTBOL":
                                temp = Enums.tipoDeporte.FUTBOL;
                                break;
                            case "BASEBALL":
                                temp = Enums.tipoDeporte.BASEBALL;
                                break;
                            case "TENIS":
                                break;
                            case "RUGBY":
                                temp = Enums.tipoDeporte.RUGBY;
                                break;

                        }

                        EventoDeportivo oldD = (EventoDeportivo) oldEvent;
                        oldD.setCantPersonas(Integer.parseInt(cant.getText()));
                        oldD.setCodigo(Integer.parseInt(codigo.getText()));
                        oldD.setRenta(Double.parseDouble(renta.getText()));
                        oldD.setDescripcion(desc.getText());
                        fechaNueva.setTime(fecha);
                        oldD.setFechaRealizacion(fechaNueva);
                        oldD.equipo1.setTeamName(equipo1.getText());
                        oldD.equipo2.setTeamName(equipo2.getText());
                        oldD.equipo1.setJugadores(jugadores1);
                        oldD.equipo2.setJugadores(jugadores2);
                        oldD.setSport(temp);

                    } else {
                        JOptionPane.showMessageDialog(null, "ANTES DE CONTINUAR, INGRESE EL NOMBRE DE CADA JUGADOR");

                    }

                    break;
                case MUSICAL:

                    switch (musicType.getSelectedItem().toString()) {
                        case "CLASICA":
                            temp2 = Enums.tipoMusica.CLASICA;
                            break;
                        case "OTRO":
                            temp2 = Enums.tipoMusica.OTRO;
                            break;
                        case "POP":
                            temp2 = Enums.tipoMusica.POP;
                            break;
                        case "RAP":
                            temp2 = Enums.tipoMusica.RAP;
                            break;
                        case "REGGEATON":
                            temp2 = Enums.tipoMusica.REGGEATON;
                            break;
                        case "ROCK":
                            temp2 = Enums.tipoMusica.ROCK;
                            break;

                    }

                    EventoMusical oldM = (EventoMusical) oldEvent;
                    oldM.setCantPersonas(Integer.parseInt(cant.getText()));
                    oldM.setCodigo(Integer.parseInt(codigo.getText()));
                    oldM.setDescripcion(desc.getText());
                    fechaNueva.setTime(fecha);
                    oldM.setFechaRealizacion(fechaNueva);
                    oldM.setMusicType(temp2);
                    oldM.setMusicians(musicos);

                    break;
                case RELIGIOSO:
                    EventoReligioso oldR = (EventoReligioso) oldEvent;
                    oldR.setCantPersonas(Integer.parseInt(cant.getText()));
                    oldR.setCodigo(Integer.parseInt(codigo.getText()));
                    oldR.setDescripcion(desc.getText());
                    fechaNueva.setTime(fecha);
                    oldR.setFechaRealizacion(fechaNueva);
                    oldR.setConvertidos(Integer.parseInt(personasConvertidas.getText()));

                    break;

            }

        } else {
            JOptionPane.showMessageDialog(null, "SELECCIONE EDITAR PRIMERO");
        }
    }

    public boolean isCancelado() {
        return cancelado;
    }

    public void setCancelado(boolean cancelado) {
        this.cancelado = cancelado;
    }

    public boolean isRealizado() {
        return realizado;
    }

    public void setRealizado(boolean realizado) {
        this.realizado = realizado;
    }

    public tipoEvento getEventoTipo() {
        return eventoTipo;
    }

    public void setEventoTipo(tipoEvento eventoTipo) {
        this.eventoTipo = eventoTipo;
    }

    public int getCantPersonas() {
        return cantPersonas;
    }

    public void setCantPersonas(int cantPersonas) {
        this.cantPersonas = cantPersonas;
    }

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

    public static boolean isKiwi() {
        return kiwi;
    }

    public static void setKiwi(boolean kiwi) {
        Evento.kiwi = kiwi;
    }

}

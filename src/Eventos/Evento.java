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
import GUI.MAIN;
import static GUI.MAIN.fechaNeitor;
import Usuarios.Administrador;
import Usuarios.Contenidos;
import Usuarios.Default;
import com.toedter.calendar.JDateChooser;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Josue Gavidia
 */
public class Evento extends Reportes {

    public boolean cancelado;
    public boolean realizado;

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
                    tempSport.fechaRealizacion.setTime(MAIN.dateSelected);
                    if (tempSport.fechaRealizacion.before(MAIN.GLOBAL)) {
                        tempSport.setRealizado(true);
                    }

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
                    tempMusic.fechaRealizacion.setTime(MAIN.dateSelected);
                    if (tempMusic.fechaRealizacion.before(MAIN.GLOBAL)) {
                        tempMusic.setRealizado(true);
                    }
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
                    tempRel.fechaRealizacion.setTime(MAIN.dateSelected);
                    if (tempRel.fechaRealizacion.before(MAIN.GLOBAL)) {
                        tempRel.setRealizado(true);
                    }

                    tempRel.renta += 2000;
                    eventos.add(tempRel);
                    addEventTo(tempRel);
                    break;
            }

        }
    }

    private void addEventTo(Evento event) {
        if (MAIN.loggeado instanceof Administrador) {
            Administrador temp = (Administrador) MAIN.loggeado;
            temp.getEventosCreados().add(event);
            System.out.println("Added to " + temp.getUsername());
            JOptionPane.showMessageDialog(null, "EVENTO CREADO EXITOSAMENTE");
        } else if (MAIN.loggeado instanceof Default) {
            Default temp = (Default) MAIN.loggeado;
            temp.getEventosCreados().add(event);
            System.out.println("Added to " + temp.getUsername());
            JOptionPane.showMessageDialog(null, "EVENTO CREADO EXITOSAMENTE");
        } else if (MAIN.loggeado instanceof Contenidos) {
            Contenidos temp = (Contenidos) MAIN.loggeado;
            temp.getEventosCreados().add(event);
            System.out.println("Added to " + temp.getUsername());
            JOptionPane.showMessageDialog(null, "EVENTO CREADO EXITOSAMENTE");
        } else {
            System.out.println("Added to NOBODY");
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

    public void editEvent(int code, JTextField cant, JTextField codigo, JTextField title, JTextArea desc, JDateChooser fecha, JLabel fechaText, JTextField equipo1, JTextField equipo2, JTextField renta,
            ArrayList jugadores1, ArrayList jugadores2, JTextField p1, JTextField p2, JLabel tipoMusica, JComboBox musicType, JTextField musics, JTextField instruments,
            JLabel tipoDeporte, JComboBox sportType, ArrayList musicos, JTextField personasConvertidas, JLabel intsOne, JLabel intsTwo, boolean editable) {

        //THE ARRAYS THINGY 
        Evento oldEvent = searchEvent(code);
        Calendar fechaNueva = Calendar.getInstance();
        tipoDeporte temp;
        if (editable) {

            switch (oldEvent.eventoTipo) {

                case DEPORTIVO:
                    //CORREGIR SET VISIBLES

                    EventoDeportivo oldD = (EventoDeportivo) oldEvent;

                    switch (sportType.getSelectedItem().toString()) {
                        case "FUTBOL":
                            temp = Enums.tipoDeporte.FUTBOL;
                            break;
                        case "BASEBALL":
                            temp = Enums.tipoDeporte.BASEBALL;
                            break;
                        case "TENIS":
                            temp = Enums.tipoDeporte.TENIS;
                            break;
                        case "RUGBY":
                            temp = Enums.tipoDeporte.RUGBY;
                            break;

                    }

                    oldD.setTitulo(title.getText());
                    oldD.setCantPersonas(Integer.parseInt(cant.getText()));
                    oldD.setCodigo(Integer.parseInt(codigo.getText()));
                    oldD.setRenta(Double.parseDouble(renta.getText()));
                    oldD.setDescripcion(desc.getText());
                    fechaNueva.setTime(fecha.getDate());
                    oldD.setFechaRealizacion(fechaNueva);
                    oldD.equipo1.setTeamName(equipo1.getText());
                    oldD.equipo2.setTeamName(equipo2.getText());
                    oldD.equipo1.setJugadores(jugadores1);
                    oldD.equipo2.setJugadores(jugadores2);
                    oldD.setSport(oldD.getSport());

                    break;

                case MUSICAL:
                    tipoMusica temp2 = null;

                    EventoMusical oldM = (EventoMusical) oldEvent;

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
                    oldM.setTitulo(title.getText());
                    oldM.setRenta(Double.parseDouble(renta.getText()));
                    oldM.setCantPersonas(Integer.parseInt(cant.getText()));
                    oldM.setCodigo(Integer.parseInt(codigo.getText()));
                    oldM.setDescripcion(desc.getText());
                    fechaNueva.setTime(fecha.getDate());
                    oldM.setFechaRealizacion(fechaNueva);

                    oldM.setMusicians(musicos);

                    if (temp2 != null) {
                        oldM.setMusicType(temp2);
                    } else {
                        oldM.setMusicType(oldM.getMusicType());
                    }

                    break;

                case RELIGIOSO:

                    EventoReligioso oldR = (EventoReligioso) oldEvent;
                    oldR.setTitulo(title.getText());
                    oldR.setRenta(Double.parseDouble(renta.getText()));
                    oldR.setCantPersonas(Integer.parseInt(cant.getText()));
                    oldR.setCodigo(Integer.parseInt(codigo.getText()));
                    oldR.setDescripcion(desc.getText());
                    fechaNueva.setTime(fecha.getDate());
                    oldR.setFechaRealizacion(fechaNueva);
                    oldR.setConvertidos(Integer.parseInt(personasConvertidas.getText()));

                    break;

            }

            JOptionPane.showMessageDialog(null, "CAMBIOS GUARDADOS EXITOSAMENTE");

        } else {
            JOptionPane.showMessageDialog(null, "SELECCIONE EDITAR PRIMERO");
        }
    }

    @Override
    public String printRealizados() {
        String DATA = "";
        String lastData = "";
        String code, tipo, tit, fecha, monto;
        for (Evento a : MAIN.realizados) {
            code = a.getCodigo() + "";
            tipo = a.eventoTipo.toString();
            tit = a.getTitulo();
            fecha = MAIN.fechaNeitor.format(a.getFechaRealizacion().getTime());
            monto = a.getRenta() + "";
            DATA = "CODIGO: " + code + " – TIPO: " + tipo + " - TITULO:" + tit + " – FECHA: " + fecha + " –MONTO: " + monto + "\n";
            lastData += DATA;
        }
        return lastData;
    }

    @Override
    public String printFuturos() {
 
        String DATA = "";
        String lastData = "";
        String code, tipo, tit, fecha, monto;
        for (Evento a : MAIN.futuros) {
            code = a.getCodigo() + "";
            tipo = a.eventoTipo.toString();
            tit = a.getTitulo();
            fecha = MAIN.fechaNeitor.format(a.getFechaRealizacion().getTime());
            monto = a.getRenta() + "";
            DATA = "CODIGO: " + code + " – TIPO: " + tipo + " - TITULO:" + tit + " – FECHA: " + fecha + " –MONTO: " + monto + "\n";
            lastData += DATA;
            
        }
        
        return lastData;
    }

    @Override
    public String printCancelados() {
          String DATA = "";
        String lastData = "";
        String code, tipo, tit, fecha, monto;
        for (Evento a : MAIN.cancelados) {
            code = a.getCodigo() + "";
            tipo = a.eventoTipo.toString();
            tit = a.getTitulo();
            fecha = MAIN.fechaNeitor.format(a.getFechaRealizacion().getTime());
            monto = a.getRenta() + "";
            DATA = "CODIGO: " + code + " – TIPO: " + tipo + " - TITULO:" + tit + " – FECHA: " + fecha + " –MONTO: " + monto + "\n";
            lastData += DATA;
            
        }
        
        return lastData;
    }

    @Override
    public String printPorFecha() {
        return "NO DISPONIBLE";
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

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Eventos;

import Eventos.Enums.tipoEvento;
import java.util.Calendar;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author Josue Gavidia
 */
public class EventoBase {

    protected int codigo;
    protected String titulo;
    protected String descripcion;
    protected Calendar fechaRealizacion;
    protected double renta;
    private EventoDeportivo tk;

    public EventoBase(int codigo, String titulo, String descripcion, Calendar fechaRealizacion, double renta) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechaRealizacion = fechaRealizacion;
        this.renta = renta;
    }

    private int searchForFreeSpace(EventoBase array[]) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                System.out.println("Occupied");
            } else {
                System.out.println("Free");
                return i;
            }
        }
        return -1;
    }

    //Funcion a base de enums 1
    private tipoEvento getEventType_from_Combo(JComboBox box) {
        String item = box.getSelectedItem().toString();
        for (tipoEvento scout : tipoEvento.values()) {
            if (item.equals(scout.toString())) {
                return scout;
            }
        }
        System.out.println("KILL ME ALREADY");
        return null;
    }

    //Funcion a base de enums 2
    private Enums.tipoDeporte getSportType_from_Combo(JComboBox box) {
        String item = box.getSelectedItem().toString();
        for (Enums.tipoDeporte scout : Enums.tipoDeporte.values()) {
            if (item.equals(scout.toString())) {
                return scout;
            }
        }
        System.out.println("KILL ME ALREADY");
        return null;
    }

    public EventoBase crear(int codigo, String titulo, String descripcion, Calendar fechaRealizacion, double renta, EventoBase array[], JComboBox typeEv, JComboBox typeSport) throws NullPointerException {

        Enums.tipoDeporte sportType;
        EventoBase temp;
        int index = searchEventByCode(codigo, array);

        Enums.tipoEvento evType = getEventType_from_Combo(typeEv);

        if (index == -1) {
            if (evType != null) {
                switch (evType) {
                    case DEPORTIVO:
                        sportType = getSportType_from_Combo(typeSport);
                        if (sportType != null) {
                            temp = new EventoDeportivo(codigo, titulo, descripcion, fechaRealizacion, renta, sportType);
                            JOptionPane.showMessageDialog(null, "Evento Deportivo creado con exito ! ! !");
                            return temp;
                        } else {
                            JOptionPane.showMessageDialog(null, "SELECCIONE UN TIPO DE DEPORTE");
                        }
                    case MUSICAL:

                    case RELIGIOSO:

                    default:
                        System.out.println("HELP MEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE");
                        return null;

                }
            } else {
                JOptionPane.showMessageDialog(null, "SELECCIONE UN TIPO DE EVENTO");
            }
        } else {
            JOptionPane.showMessageDialog(null, "YA EXISTE UN EVENTO CON DICHO CODIGO");
        }
    }

    private int searchEventByCode(int code, EventoBase array[]) {

        for (int i = 0; i < array.length; i++) {
            if (array[i].codigo == code) {
                System.out.println("FOUND IT!!!");
                return i;
            }
        }
        System.out.println("Could not find it");
        return -1;
    }

    public void addEventToArray(int code, EventoBase array[], int index, EventoBase evento) {

        array[index] = evento;
        System.out.println("Se añadio exitosamente");

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

}

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

    public tipoEvento getEventType_from_Combo(JComboBox box) {
        String item = box.getSelectedItem().toString();
        for (tipoEvento scout : tipoEvento.values()) {
            if (item.equals(scout.toString())) {
                return scout;
            }
        }
        System.out.println("KILL ME ALREADY");
        return null;
    }

    public void crear(int codigo, String titulo, String descripcion, Calendar fechaRealizacion, double renta, EventoBase Eventarray[], JComboBox EvBox, JComboBox SpBox) {
        int pos = searchForFreeSpace(Eventarray);
        tipoEvento ev = getEventType_from_Combo(EvBox);

        if (pos !=-1) {

            switch (ev) {
                case DEPORTIVO:
                    Eventarray[pos] = new EventoDeportivo(codigo, titulo, descripcion, fechaRealizacion, renta);
                    tk.setSport(tk.getSportType_from_Combo(SpBox));

                    JOptionPane.showMessageDialog(null, "Evento Deportivo creado con exito ! ! !");
                    break;
                case MUSICAL:
                    Eventarray[pos] = new EventoMusical(codigo, titulo, descripcion, fechaRealizacion, renta);
                    JOptionPane.showMessageDialog(null, "Evento creado con exito ! ! !");
                    break;
                case RELIGIOSO:
                    Eventarray[pos] = new EventoReligioso(codigo, titulo, descripcion, fechaRealizacion, renta);
                    JOptionPane.showMessageDialog(null, "Evento creado con exito ! ! !");
                    break;
                default:
                    System.out.println("HELP MEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE");

            }

        }else{
            System.out.println("Boutta Kms at 4am on a Uni day at this rate");
        }
    }

    public EventoBase FetchEvent(int code, EventoBase array[]) {
        EventoBase temp;
        for (int i = 0; i < array.length; i++) {
            if (array[i].codigo == code) {
                System.out.println("FOUND IT!!!");
                temp = array[i];
                return temp;
            }
        }
        System.out.println("Could not find it");
        return null;
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

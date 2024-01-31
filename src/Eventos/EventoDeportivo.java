/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Eventos;

import static GUI.Sistema.fechaNeitor;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JLabel;
import javax.swing.JList;

/**
 *
 * @author Josue Gavidia
 */
public class EventoDeportivo extends Evento implements printeable {

    protected Equipo equipo1;
    protected Equipo equipo2;
    protected String sport;

    public EventoDeportivo(int cantPersonas, int codigo, String titulo, String descripcion, Calendar fechaRealizacion, double renta, String T1, String T2) {
        super(cantPersonas, codigo, titulo, descripcion, fechaRealizacion, renta);
        equipo1 = new Equipo(T1);
        equipo2 = new Equipo(T2);
        equipo1.teamName = T1;
        equipo2.teamName = T2;

    }
  //Objeto de equipo
    public class Equipo {

        private String teamName;
        private ArrayList<String> jugadores;

        public Equipo(String teamName) {
            this.teamName = teamName;
            jugadores = new ArrayList();
        }

    }

    //Si esta cancelado, se muestra un mensaje y al a hora de editar, no se puede editar.
    //
    //tipoEvento,cantPeople,code,titulo,desc,fecha de Realizacion,equipos,jugadores
    @Override
    public void print(int code, JLabel tipo, JLabel cant, JLabel codigo, JLabel title, JLabel desc, JLabel fecha, JLabel equipo1, JLabel equipo2,
            JList playersT1, JList playersT2, JLabel tipoMusica, JLabel tipoDeporte, JList musicos, JLabel personasConvertidas) {

        EventoDeportivo temp = (EventoDeportivo) super.searchEvent(code);
        ArrayList listT1 = temp.equipo1.jugadores;
        ArrayList listT2 = temp.equipo2.jugadores;

        tipo.setText(temp.tipoEvento);
        cant.setText(temp.cantPersonas + "");
        codigo.setText(temp.codigo + "");
        title.setText(temp.titulo);
        desc.setText(temp.descripcion);
        fecha.setText(fechaNeitor.format(temp.fechaRealizacion.getTime()));
        tipoDeporte.setText(temp.sport);
        equipo1.setText(temp.equipo1.teamName);
        equipo2.setText(temp.equipo2.teamName);
        playersT1.setListData(listT1.toArray());
        playersT2.setListData(listT2.toArray());

    }

    public Equipo getEquipo1() {
        return equipo1;
    }

    public void setEquipo1(Equipo equipo1) {
        this.equipo1 = equipo1;
    }

    public Equipo getEquipo2() {
        return equipo2;
    }

    public void setEquipo2(Equipo equipo2) {
        this.equipo2 = equipo2;
    }

}

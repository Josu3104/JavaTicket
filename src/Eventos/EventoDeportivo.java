/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Eventos;

import Eventos.Enums.tipoDeporte;
import static GUI.MAIN.fechaNeitor;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Josue Gavidia
 */
public class EventoDeportivo extends Evento implements printeable {

    public Equipo equipo1;
    public Equipo equipo2;
    public tipoDeporte sport;

    public EventoDeportivo(int cantPersonas, int codigo, String titulo, String descripcion, double renta, String T1, String T2) {
        super(cantPersonas, codigo, titulo, descripcion, renta);
        equipo1 = new Equipo(T1);
        equipo2 = new Equipo(T2);
        this.eventoTipo = Enums.tipoEvento.DEPORTIVO;

    }
    //Objeto de equipo

    public class Equipo {

        private String teamName;
        private ArrayList<String> jugadores;

        public Equipo(String teamName) {
            this.teamName = teamName;
            jugadores = new ArrayList();
        }

        public String getTeamName() {
            return teamName;
        }

        public void setTeamName(String teamName) {
            this.teamName = teamName;
        }

        public ArrayList<String> getJugadores() {
            return jugadores;
        }

        public void setJugadores(ArrayList<String> jugadores) {
            this.jugadores = jugadores;
        }

    }

    //Si esta cancelado, se muestra un mensaje y al a hora de editar, no se puede editar.
    //
    //tipoEvento,cantPeople,code,titulo,desc,fecha de Realizacion,equipos,jugadores
    //GYAAAAAAAAAAAAAAAAAAAAAATT
    @Override
    public void printEvent(int code, JTextField renta, JLabel tipo, JTextField cant, JTextField codigo, JTextField title, JTextArea desc, JLabel fecha, JTextField equipo1, JTextField equipo2,
            JList playersT1, JList playersT2, JLabel tipoMusica, JLabel tipoDeporte, JList musicos, JTextField personasConvertidas) {

        Evento event = super.searchEvent(code);
        if (event != null) {
            if (event instanceof EventoDeportivo) {
                EventoDeportivo temp = (EventoDeportivo) event;

                if (!temp.equipo1.jugadores.isEmpty() && !temp.equipo2.jugadores.isEmpty()) {

                    playersT1.setListData(temp.equipo1.jugadores.toArray());
                    playersT2.setListData(temp.equipo2.jugadores.toArray());
                }
                tipo.setText("Tipo de Evento " + temp.eventoTipo.toString());
                cant.setText(temp.cantPersonas + "");
                equipo1.setText(temp.equipo1.teamName);
                equipo2.setText(temp.equipo2.teamName);
                renta.setText(temp.renta + "");
                codigo.setText(temp.codigo + "");
                title.setText(temp.titulo);
                desc.setText(temp.descripcion);
                fecha.setText(fechaNeitor.format(temp.fechaRealizacion.getTime()));
                tipoDeporte.setText(temp.getSport().toString());
            }
        }

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

    public tipoDeporte getSport() {
        return sport;
    }

    public void setSport(tipoDeporte sport) {
        this.sport = sport;
    }

}

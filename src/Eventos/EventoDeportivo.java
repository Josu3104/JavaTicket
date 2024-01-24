/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Eventos;

import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author Josue Gavidia
 */
public class EventoDeportivo extends Evento {

    protected Equipo equipo1;
    protected Equipo equipo2;
    protected String sport;

    public EventoDeportivo(int cantPersonas,int codigo, String titulo, String descripcion, Calendar fechaRealizacion, double renta, String T1, String T2) {
        super( cantPersonas,codigo, titulo, descripcion, fechaRealizacion, renta);
        equipo1 = new Equipo(T1);
        equipo2 = new Equipo(T2);
        equipo1.teamName = T1;
        equipo2.teamName = T2;

    }

    public class Equipo {

        public String teamName;
        public ArrayList<String> jugadores;

        public Equipo(String teamName) {
            this.teamName = teamName;
            jugadores = new ArrayList<>();
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

}

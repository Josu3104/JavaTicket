/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Usuarios;

import Eventos.Evento;
import java.util.ArrayList;

/**
 *
 * @author Josue Gavidia
 */
public class Contenidos extends Usuario {

    public ArrayList<Evento> eventosCreados = new ArrayList();

    public Contenidos(String fullName, String username, String password, int age) {
        super(fullName, username, password, age);
    }

    public ArrayList<Evento> getEventosCreados() {
        return eventosCreados;
    }

    public void setEventosCreados(ArrayList<Evento> eventosCreados) {
        this.eventosCreados = eventosCreados;
    }
}

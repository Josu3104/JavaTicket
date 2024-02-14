/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Usuarios;

import Eventos.Evento;
import GUI.MAIN;
import javax.swing.JTextField;

/**
 *
 * @author Josue Gavidia
 */
public class Usuario extends ManagerUsuarios {

    protected String fullName;
    protected String username;
    protected String password;
    protected int age;

    public Usuario(String fullName, String username, String password, int age) {

        this.fullName = fullName;
        this.username = username;
        this.password = password;
        this.age = age;

    }

    @Override
    public String printLoggedEvents(JTextField AREA) {
        String id, tipo, title, estado, monto, temporal, creados = "";
        if (MAIN.loggeado instanceof Administrador) {
            AREA.setText("Administrador");
            Administrador temp = (Administrador) MAIN.loggeado;
            if (temp.getEventosCreados().isEmpty()) {
                return "NO DISPONIBLE";
            }
            for (Evento a : temp.getEventosCreados()) {
                id = a.getCodigo() + "";
                tipo = a.eventoTipo.toString();
                title = a.getTitulo();
                estado = a.getEstado();
                monto = a.getRenta() + "";
                temporal = "CODIGO: " + id + " – TIPO: " + tipo + " - TITULO:" + title + " – ESTADO: " + estado + " –MONTO: " + monto + "\n";
                creados += temporal;
            }
            return creados;

        } else if (MAIN.loggeado instanceof Default) {
            Default temp = (Default) MAIN.loggeado;
            AREA.setText("Administrador");
            if (temp.getEventosCreados().isEmpty()) {
                return "NO DISPONIBLE";
            }

            for (Evento a : temp.getEventosCreados()) {
                id = a.getCodigo() + "";
                tipo = a.eventoTipo.toString();
                title = a.getTitulo();
                estado = a.getEstado();
                monto = a.getRenta() + "";
                temporal = "CODIGO: " + id + " – TIPO: " + tipo + " - TITULO:" + title + " – ESTADO: " + estado + " –MONTO: " + monto + "\n";
                creados += temporal;
            }
            return creados;

        } else if (MAIN.loggeado instanceof Contenidos) {
            Contenidos temp = (Contenidos) MAIN.loggeado;
            AREA.setText("Contenidos");
            if (temp.getEventosCreados().isEmpty()) {
                return "NO DISPONIBLE";
            }
            for (Evento a : temp.getEventosCreados()) {
                id = a.getCodigo() + "";
                tipo = a.eventoTipo.toString();
                title = a.getTitulo();
                estado = a.getEstado();
                monto = a.getRenta() + "";
                temporal = "CODIGO: " + id + " – TIPO: " + tipo + " - TITULO:" + title + " – ESTADO: " + estado + " –MONTO: " + monto + "\n";
                creados += temporal;
            }
            return creados;

        } else if (MAIN.loggeado instanceof Limitado) {
            AREA.setText("Limitado");
        }
        return "NO DISPONIBLE";
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}

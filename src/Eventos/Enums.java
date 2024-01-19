/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Eventos;

/**
 *
 * @author Josue Gavidia
 */
public class Enums {

    public enum tipoEvento {
        DEPORTIVO("DEPORTIVO"), MUSICAL("MUSICAL"), RELIGIOSO("RELIGIOSO");

        private final String evento;

        tipoEvento(String ev) {
            this.evento = ev;
        }
    }
    
    public enum tipoDeporte{
         BASEBALL("BASEBALL"), RUGBY("RUGBY"), TENIS("TENIS"),FUTBOL("FUTBOL");

        private final String deporte;

        tipoDeporte(String sport) {
            this.deporte = sport;
        }
    }
}

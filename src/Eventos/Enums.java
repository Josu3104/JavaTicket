/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Eventos;

import javax.swing.JComboBox;

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
        
         public tipoDeporte getSportType_from_Combo(JComboBox box) {
        String item = box.getSelectedItem().toString();
        for (Enums.tipoDeporte scout : Enums.tipoDeporte.values()) {
            if (item.equals(scout.toString())) {
                return scout;
            }
        }
       
        return null;
    }
    }
    
        public enum tipoMusica {
           POP("DEPORTIVO"), ROCK("MUSICAL"), RAP("RELIGIOSO"),CLASICA("CLASICA"),
           REGGEATON("REGGEATON"),OTRO("OTRO");
           
            private final String musica;

        tipoMusica(String genre) {
            this.musica = genre;
        }
    }
}

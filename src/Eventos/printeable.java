/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Eventos;

import javax.swing.JLabel;
import javax.swing.JList;

/**
 *
 * @author Josue Gavidia
 */
public interface printeable {
    void print(int code,JLabel tipo,JLabel cant,JLabel codigo,JLabel title,JLabel desc,JLabel fecha,JLabel equipo1,JLabel equipo2,
             JList playersT1,JList playersT2,JLabel tipoMusica,JLabel tipoDeporte, JList musicos, JLabel personasConvertidas);
    
    
}

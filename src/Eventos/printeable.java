/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Eventos;

import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Josue Gavidia
 */
public interface printeable {
    void printEvent(int code,JTextField renta,JLabel tipo,JTextField cant,JTextField codigo,JTextField title,JTextArea desc,JLabel fecha,JTextField equipo1,JTextField equipo2,
             JList playersT1,JList playersT2,JLabel tipoMusica,JLabel tipoDeporte, JList musicos, JTextField personasConvertidas);
    
    
}

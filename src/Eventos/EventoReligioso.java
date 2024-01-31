/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Eventos;

import static GUI.Sistema.fechaNeitor;
import java.util.Calendar;
import javax.swing.JLabel;
import javax.swing.JList;

/**
 *
 * @author Josue Gavidia
 */
public class EventoReligioso extends Evento implements printeable {
    
    protected int convertidos;
    
    public EventoReligioso(int cantPersonas, int codigo, String titulo, String descripcion, Calendar fechaRealizacion, double renta) {
        super(cantPersonas, codigo, titulo, descripcion, fechaRealizacion, renta);
        
    }
    
    public int getConvertidos() {
        return convertidos;
    }
    
    public void setConvertidos(int convertidos) {
        this.convertidos = convertidos;
    }
    
    @Override
    public void print(int code, JLabel tipo, JLabel cant, JLabel codigo, JLabel title, JLabel desc, JLabel fecha, JLabel equipo1, JLabel equipo2, JList playersT1, JList playersT2,
            JLabel tipoMusica, JLabel tipoDeporte, JList musicos, JLabel personasConvertidas) {
        EventoReligioso temp = (EventoReligioso) super.searchEvent(code);
        tipo.setText(temp.tipoEvento);
        cant.setText(temp.cantPersonas + "");
        codigo.setText(temp.codigo + "");
        title.setText(temp.titulo);
        desc.setText(temp.descripcion);
        fecha.setText(fechaNeitor.format(temp.fechaRealizacion.getTime()));
        personasConvertidas.setText(temp.convertidos + "");
        
    }
    
}

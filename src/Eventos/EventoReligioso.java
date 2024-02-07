/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Eventos;

import static GUI.Sistema.fechaNeitor;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Josue Gavidia
 */
public class EventoReligioso extends Evento implements printeable {

    protected int convertidos;

    public EventoReligioso(int cantPersonas, int codigo, String titulo, String descripcion, double renta) {
        super(cantPersonas, codigo, titulo, descripcion, renta);
        this.eventoTipo = Enums.tipoEvento.RELIGIOSO;
    }

    @Override
    public void printEvent(int code,JTextField renta,JTextField tipo,JTextField cant,JTextField codigo,JTextField title,JTextArea desc,JLabel fecha,JTextField equipo1,JTextField equipo2,
             JList playersT1,JList playersT2,JLabel tipoMusica,JLabel tipoDeporte, JList musicos, JTextField personasConvertidas) {
        EventoReligioso temp = (EventoReligioso) super.searchEvent(code);
        tipo.setText(temp.eventoTipo.toString());
        cant.setText(temp.cantPersonas + "");
        codigo.setText(temp.codigo + "");
        title.setText(temp.titulo);
        desc.setText(temp.descripcion);
        fecha.setText(fechaNeitor.format(temp.fechaRealizacion.getTime()));
        personasConvertidas.setText(temp.convertidos + "");

    }

    public int getConvertidos() {
        return convertidos;
    }

    public void setConvertidos(int convertidos) {
        this.convertidos = convertidos;
    }

}

package Eventos;

import static GUI.Sistema.fechaNeitor;
import java.util.Calendar;
import javax.swing.JLabel;
import javax.swing.JList;

/**
 *
 * @author Josue Gavidia
 */
public class EventoMusical extends Evento {

    protected Musicos musicians[];
    protected String musicType;

    public EventoMusical(int cantPersonas, int codigo, String titulo, String descripcion, Calendar fechaRealizacion, double renta) {
        super(cantPersonas, codigo, titulo, descripcion, fechaRealizacion, renta);

    }

    public class Musicos {

        private String cargo;
        private String nombre;

        public Musicos(String cargo, String nombre) {
            this.cargo = cargo;
            this.nombre = nombre;
        }

    }
    
     public void printMusic(int code,JLabel tipo,JLabel cant,JLabel codigo,JLabel title,JLabel desc,JLabel fecha,JLabel tipoMusica,JList musicos){
        EventoMusical temp = (EventoMusical) super.searchEvent(code);
        if(temp!=null){
           tipo.setText(temp.tipoEvento);
           cant.setText(temp.cantPersonas+"");
           codigo.setText(temp.codigo+"");
           title.setText(temp.titulo);
           desc.setText(temp.descripcion);
           fecha.setText(fechaNeitor.format(temp.fechaRealizacion.getTime()));
           tipoMusica.setText(temp.musicType);
           //Falta listado de musicooooooooooooooooos
         
           
        }
    }

}

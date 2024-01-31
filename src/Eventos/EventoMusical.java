package Eventos;

import static GUI.Sistema.fechaNeitor;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JLabel;
import javax.swing.JList;

/**
 *
 * @author Josue Gavidia
 */
public class EventoMusical extends Evento {

    protected ArrayList<String> musicians;
    protected String musicType;

    public EventoMusical(int cantPersonas, int codigo, String titulo, String descripcion, Calendar fechaRealizacion, double renta) {
        super(cantPersonas, codigo, titulo, descripcion, fechaRealizacion, renta);
        musicians = new ArrayList<>();

    }

    
     public void print(int code,JLabel tipo,JLabel cant,JLabel codigo,JLabel title,JLabel desc,JLabel fecha,JLabel equipo1,JLabel equipo2,
             JList playersT1,JList playersT2,JLabel tipoMusica,JLabel tipoDeporte, JList musicos, JLabel personasConvertidas){
        EventoMusical temp = (EventoMusical) super.searchEvent(code);
        
          
           tipo.setText(temp.tipoEvento);
           cant.setText(temp.cantPersonas+"");
           codigo.setText(temp.codigo+"");
           title.setText(temp.titulo);
           desc.setText(temp.descripcion);
           fecha.setText(fechaNeitor.format(temp.fechaRealizacion.getTime()));
           tipoMusica.setText(temp.musicType);
           musicos.setListData(musicians.toArray());
           
           

         
           
        
    }

}

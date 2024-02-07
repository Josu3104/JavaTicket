package Eventos;

import Eventos.Enums.tipoMusica;
import static GUI.Sistema.fechaNeitor;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Josue Gavidia
 */
public class EventoMusical extends Evento implements printeable {

    protected tipoMusica musicType;
    protected ArrayList musicians;

    public EventoMusical(int cantPersonas, int codigo, String titulo, String descripcion, double renta) {
        super(cantPersonas, codigo, titulo, descripcion, renta);
        this.eventoTipo = Enums.tipoEvento.MUSICAL;
        musicians = new ArrayList();
    }
    
  
        

    @Override
    public void printEvent(int code,JTextField renta,JTextField tipo,JTextField cant,JTextField codigo,JTextField title,JTextArea desc,JLabel fecha,JTextField equipo1,JTextField equipo2,
             JList playersT1,JList playersT2,JLabel tipoMusica,JLabel tipoDeporte, JList musicos, JTextField personasConvertidas) {
        EventoMusical temp = (EventoMusical) super.searchEvent(code);
        String improv2[] = {"Faltante"};

        if (temp.musicians.isEmpty()) {
            musicos.setListData(improv2);

        } else {
            musicos.setListData(temp.musicians.toArray());
            

        }

        tipo.setText(temp.eventoTipo.toString());
        cant.setText(temp.cantPersonas + "");
        codigo.setText(temp.codigo + "");
        title.setText(temp.titulo);
        desc.setText(temp.descripcion);
        fecha.setText(fechaNeitor.format(temp.fechaRealizacion.getTime()));
        tipoMusica.setText(temp.musicType.toString());
        musicos.setListData(musicians.toArray());

    }

    public tipoMusica getMusicType() {
        return musicType;
    }

    public void setMusicType(tipoMusica musicType) {
        this.musicType = musicType;
    }

    public ArrayList<String> getMusicians() {
        return musicians;
    }

    public void setMusicians(ArrayList<String> musicians) {
        this.musicians = musicians;
    }
    
    

}



package Eventos;

import java.util.Calendar;

/**
 *
 * @author Josue Gavidia
 */
public class EventoMusical extends EventoBase {
    protected Musicos musicians;
    protected tipoMusica musicType;
    
    
    private final class Musicos {

        private String cargo;
        private String nombre;

        public Musicos(String cargo, String nombre) {
            this.cargo = cargo;
            this.nombre = nombre;
        }
        
        
        public String getCargo() {
            return cargo;
        }

        public void setCargo(String cargo) {
            this.cargo = cargo;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
    }

    public EventoMusical(int codigo, String titulo, String descripcion, Calendar fechaRealizacion, double renta) {
        super(codigo, titulo, descripcion, fechaRealizacion, renta);
    
    }

    public enum tipoMusica {
        POP,
        ROCK,
        RAP,
        CLASICA,
        REGGEATON
    }

  

    public tipoMusica getMusicType() {
        return musicType;
    }

    public void setMusicType(tipoMusica musicType) {
        this.musicType = musicType;
    }

   
}

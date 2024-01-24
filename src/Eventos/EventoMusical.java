package Eventos;

import java.util.Calendar;

/**
 *
 * @author Josue Gavidia
 */
public class EventoMusical extends Evento {

    protected Musicos musicians[];
    protected String musicType;

    public class Musicos {

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

    public EventoMusical(int cantPersonas,int codigo, String titulo, String descripcion, Calendar fechaRealizacion, double renta) {
        super( cantPersonas,codigo, titulo, descripcion, fechaRealizacion, renta);
       
   
    }
    
    

}

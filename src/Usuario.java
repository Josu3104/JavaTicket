/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Josue Gavidia
 */
public class Usuario {
//    public static String Ncompleto;
//    public static String ID;
//    public static String PASS;
//    public static int Edad;
 
    String Ncompleto;
    String ID;
    String PASS;
    String acceso;
    int Edad;
    
    public Usuario(String id,String contra,String acces) {
        ID=id;
        PASS=contra;
        acceso=acces;
    }

    public  String getNcompleto() {
        return Ncompleto;
    }
        
    public String getAcceso(){
        return acceso;
    }
    public void setNcompleto(String Ncompleto) {
        this.Ncompleto = Ncompleto;
    }

    public  String getID() {
        return ID;
    }

    public  void setID(String ID) {
        this.ID = ID;
    }

    public  String getPASS() {
        return PASS;
    }

    public  void setPASS(String PASS) {
        this.PASS = PASS;
    }

    public  int getEdad() {
        return Edad;
    }

    public  void setEdad(int Edad) {
        this.Edad = Edad;
    }
  
    
    
    
    
    
}

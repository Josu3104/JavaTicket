/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Josue Gavidia
 */
public final  class UsuarioDefault {
    public static final String UsuarioDefault = "admin";
    public static final String ContraDefault = "supersecreto";

  
    public static final boolean ValidarUserDefault(String id, String contra) {
        if (Heaven.fetchAcc(id, contra) || (id.equals(UsuarioDefault) && contra.equals(ContraDefault))) {
            return true;
        }
        return false;
    }
    
    
    
    
    
    
}

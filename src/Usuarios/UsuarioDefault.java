/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Usuarios;

import Eventos.Evento;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Josue Gavidia
 */
public class UsuarioDefault {

    protected String rango;
    protected String fullName;
    protected String username;
    protected String password;
    protected int age;

    private ArrayList<Evento> eventosCreadosPor;

    public UsuarioDefault(String fullName, String username, String password, String rango, int age) {
        this.rango = rango;
        this.fullName = fullName;
        this.username = username;
        this.password = password;
        this.age = age;
        eventosCreadosPor = new ArrayList<>();
    }

    /*Funcion buscar usuario de uso general, retorna el indice del arreglo en el que se encuentra el usuario,
     de lo contrario, retorna -1
     */
    private int searchLogin(String username, String password, UsuarioDefault[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null && (array[i].getUsername().equals(username) && array[i].getPassword().equals(password))) {
                return i;
            }
        }
        return -1;
    }

    public final boolean Login(String user, String pass, UsuarioDefault[] array) {
        int index = searchLogin(user, pass, array);
        String name = "";
        if (index >= 0) {
            name = array[index].getFullName();
        } else {
            JOptionPane.showMessageDialog(null, "Usuario o contraseña invalidos");

        }

        if (searchLogin(user, pass, array) != -1) {
            JOptionPane.showMessageDialog(null, "Bienvenido al Sistema\n" + name + "");
            
            return true;

        } else {
            JOptionPane.showMessageDialog(null, "Usuario o contraseña invalidos");
            return false;

        }

    }

    public void setLogged(String user, UsuarioDefault logged, UsuarioDefault[] array) {
        int temp = getIndex(user, array);
        if (temp != -1) {
            logged = array[temp];
        } else {
            System.out.println("HEEEEEEEEEEEEEEEEEEEEEEEEEELP MEEEEEEEEEEEEEEEEEEEA");
        }

    }

    private int getIndex(String username, UsuarioDefault[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null && array[i].getUsername().equals(username)) {
                return i;
            }
        }
        return -1;
    }

    public final void crear(String fullname, String username, String pass, String rango, int age, UsuarioDefault[] array) {
        if (getIndex(username, array) == -1) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == null) {
                    array[i] = new Usuario(fullname, username, pass, rango, age);
                    JOptionPane.showMessageDialog(null, "Usuario Creado con exito");
                    System.out.println(array[1].getFullName());
                    System.out.println(array[1].getRango());
                    System.out.println(array[1].getAge());
                    return;
                }
            }

        } else {
            JOptionPane.showMessageDialog(null, "Nombre de usuario ya en uso");
        }
    }

    public ArrayList<Evento> getEventosCreadosPor() {
        return eventosCreadosPor;
    }



    
    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}

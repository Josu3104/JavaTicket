/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Usuarios;

import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author Josue Gavidia
 */
public class ManagerUsuarios {

    public ArrayList<Usuario> users = new ArrayList();

    public Usuario search(String username, String password) {

        for (Usuario us : users) {
            if (us.getUsername().equals(username) && us.getPassword().equals(password)) {
                return us;
            }
        }
        return null;
    }

    public void crearUsuario(String fullname, String username, String password, int age, JComboBox rango) {
        Usuario temp = null;
        for (Usuario us : users) {
            if (us.getUsername().equals(username)) {
                temp = us;
                 break;
            } 
        }

            if (temp == null) {

                switch (rango.getSelectedItem().toString()) {
                    case "Administrador":
                        users.add(new Administrador(fullname, username, password, age));
                        break;
                    case "Limitado":
                        users.add(new Limitado(fullname, username, password, age));

                        break;
                    case "Contenidos":
                        users.add(new Contenidos(fullname, username, password, age));
                        break;
                }
            } else {
                JOptionPane.showMessageDialog(null, "NOMBRE DE USUARIO YA EN USO");
         
            }
        }

    
}

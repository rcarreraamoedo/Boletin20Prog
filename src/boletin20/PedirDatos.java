
package boletin20;

import javax.swing.JOptionPane;

public class PedirDatos {
    
    
    public static int pedirInt(){
        return Integer.parseInt(JOptionPane.showInputDialog("Teclea Int:"));
    }
    public static int pedirInt(String mensaxe){
        return Integer.parseInt(JOptionPane.showInputDialog(mensaxe));
    }
    
    public static String pedirString(){
        return JOptionPane.showInputDialog("Teclea String: ");
    }
     
    public static String pedirString(String mensaxe){
        return JOptionPane.showInputDialog(mensaxe);
    }
}

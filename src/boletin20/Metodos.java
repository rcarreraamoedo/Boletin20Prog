package boletin20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import javax.swing.JOptionPane;




public class Metodos {
    
    public Librerias crearLibreria() {
        Librerias x = new Librerias(PedirDatos.pedirString("Titulo: "), PedirDatos.pedirString(" Autor: "), PedirDatos.pedirString(" ISBN: "), PedirDatos.pedirInt(" Prezo: "), PedirDatos.pedirInt(" Unidades: "));
        return x;
    }
    public void amosar(ArrayList<Librerias> lista) {
        Iterator it = lista.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        
    }
    public void venderLibros (ArrayList<Librerias> lista) {
        int num = Integer.parseInt(JOptionPane.showInputDialog(" Prezo: "));
        for (int i = 0; i < lista.size(); i++) {
            if (num == lista.get(i).getPrezo());
                lista.remove(lista.get(i));
        }
        
}
    public void buscarElemento(ArrayList<Librerias> lista) {
        String nome = JOptionPane.showInputDialog("Titulo libro ");
        for (Librerias x:lista) {
            if (nome.equals(x.getTitulo())) {
                System.out.println(nome+ " ten como autor " + x.getAutor()+ ", ISBN " +x.getISBN()+ " ,Prezo "+x.getPrezo()+" e Unidades "+x.getNunidades());
            }
        }
        
}
    public void unidadLibros (ArrayList<Librerias> lista) {
        int num = Integer.parseInt(JOptionPane.showInputDialog(" Unidades: "));
        for (int i = 0; i < lista.size(); i++) {
            if (num == lista.get(i).getNunidades());
                lista.remove(lista.get(i));
        }
}
}
package boletin20;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Boletin20 {

    public static void main(String[] args) {
        ArrayList<Librerias> listaLibrerias = new ArrayList();
        int opcion;
        Metodos obx = new Metodos();
        do {
        opcion = Integer.parseInt(JOptionPane.showInputDialog("****MENU****\n 1 --> Engadir Libros\n 2 --> Amosar Libros\n 3 --> Vender Libros\n 4 --> Consultar Libro\n 5 --> Baixa Libros"));
        switch (opcion) {
            case 1:
                listaLibrerias.add(obx.crearLibreria());
                break;
            case 2 :
                obx.amosar(listaLibrerias);
                break;
            case 3:
                obx.venderLibros(listaLibrerias);
                break;
            case 4:
                obx.buscarElemento(listaLibrerias);
            case 5:
                obx.unidadLibros(listaLibrerias);
                break;
        }
        } while (opcion != 6);
    }
    
}

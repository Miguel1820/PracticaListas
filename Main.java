import java.util.LinkedList;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args){
        int opt = 0;
        boolean bandera = true;
        Metodos m = new Metodos();
        LinkedList<Metodos> lista = new LinkedList<>();
        String mensaje = "Ingrese la opcion que desea ejecutar \n" +
                "1: Estudiante de Ingenieria \n" +
                "2: Estudiante de diseño \n" +
                "3: Inventario total \n" +
                "4: Salir \n";
        while (bandera) {
            opt = (Integer.parseInt(JOptionPane.showInputDialog(mensaje)));
            switch (opt) {
                case 1:
                    //aqui va los de ingenieria
                    break;
                case 2:
                    //aqui va los de diseño
                    break;
                case 3:
                    //aqui va la lista general de todos los prestamos (inventario total)
                    break;
                case 4:
                    //salir
                    break;

                default:
                    // nose que hacer ahi
                    break;        
            }
        }
    }

}
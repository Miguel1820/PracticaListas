import java.util.LinkedList;

import javax.swing.JOptionPane;

public class Main {
    LinkedList<Metodos> Metodos = new LinkedList<>();
    
    public static void main(String[] args){
        int opt = 0;
        boolean bandera = true;
        Metodos m = new Metodos();
        //LinkedList<Metodos> lista = new LinkedList<>();
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
                    menuIngenieria(m);
                    break;
                case 2:
                    //aqui va los de diseño
                    menuDiseño(m);
                    break;
                case 3:
                    //aqui va la lista general de todos los prestamos (inventario total)
                    //mostrar lista
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Saliendo...", "Salida",
                        JOptionPane.OK_CANCEL_OPTION);
                    return;

                default:
                    bandera = false;
                    JOptionPane.showMessageDialog(null, "Ha ingresado una opcion no valida.", "Dato Incorrecto",
                        JOptionPane.ERROR_MESSAGE);
                    break;        
            }
        }
    }


    public static void menuIngenieria(Metodos m){
        int opt = 0;
        boolean bandera = true;
        String mensaje = "Ingrese la opcion que desea ejecutar \n" +
                "1 Registrar préstamo de equipo \n" +
                "2 Modificar préstamo de equipo \n" +
                "3 Devolución de equipo \n" +
                "4 Buscar equipo \n" +
                "5 Volver al menú principal ";
        while (bandera) {
            opt = (Integer.parseInt(JOptionPane.showInputDialog(mensaje)));
            switch (opt) {
                case 1:
                    //aqui va los registros con los datos del estudiante (prestamos)
                    m.RegistroEstudiantesIng();
                    break;
                case 2:
                    //aqui va las modificaciones de algun registro ya hecho
                    break;
                case 3:
                    //aqui va la devolucion del equipo (eliminar registro)
                    break;
                case 4:
                    //aqui va la lista general de todos los prestamos (inventario ingenieros)
                    break;
                case 5:
                    //volver al menu principal
                    JOptionPane.showMessageDialog(null, "Volviendo a Menú Pricipal...", "Salida",
                        JOptionPane.OK_CANCEL_OPTION);
                    return;

                default:
                    bandera = false;
                    JOptionPane.showMessageDialog(null, "Ha ingresado una opcion no valida.", "Dato Incorrecto",
                        JOptionPane.ERROR_MESSAGE);
                    break;        
            }
        }
    }


    public static void menuDiseño(Metodos m){
        int opt = 0;
        boolean bandera = true;
        String mensaje = "Ingrese la opcion que desea ejecutar \n" +
                "1 Registrar préstamo de equipo \n" +
                "2 Modificar préstamo de equipo \n" +
                "3 Devolución de equipo \n" +
                "4 Buscar equipo \n" +
                "5 Volver al menú principal ";
        while (bandera) {
            opt = (Integer.parseInt(JOptionPane.showInputDialog(mensaje)));
            switch (opt) {
                case 1:
                    //aqui va 
                    m.RegistroEstudiantesDis();
                    break;
                case 2:
                    //aqui va 
                    break;
                case 3:
                    //aqui va 
                    break;
                case 4:
                    //aqui va la lista general de todos los prestamos (inventario diseño)
                    break;
                case 5:
                    //volver al menu principal
                    JOptionPane.showMessageDialog(null, "Volviendo a Menú Pricipal...", "Salida",
                        JOptionPane.OK_CANCEL_OPTION);
                    return;

                default:
                    bandera = false;
                    JOptionPane.showMessageDialog(null, "Ha ingresado una opcion no valida.", "Dato Incorrecto",
                        JOptionPane.ERROR_MESSAGE);
                    break;        
            }
        }
    }

}
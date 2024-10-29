import java.util.LinkedList;

import javax.swing.JOptionPane;

public class Metodos {
    public LinkedList<EstIngenieria> LlenarLista(LinkedList<EstIngenieria> lista) {
        boolean bandera = true;
        int op = 0;
//corregir todo esto (sirve de base)
        while (bandera) {
            op = (Integer.parseInt(JOptionPane.showInputDialog("A que facultad pertenece 1: Ingenieria 2: Diseño")));
            
            while (op < 1 && op > 3) {
                JOptionPane.showMessageDialog(null, "Ha ingresado una opcion no valida.", "Dato Incorrecto", JOptionPane.ERROR_MESSAGE);
                op = (Integer.parseInt(JOptionPane.showInputDialog("A que facultad pertenece 1: Ingenieria 2: Diseño")));          
                }

                if (op == 3) {
                    bandera = false;
                    break;
                }

                if (op == 1) {
                
                }
            
        }
        return lista;
    }

    //modificar prestamo del equipo (Por serial o cedula)
    //Devolución de equipo (se elimina el registro). (Por serial o cedula)
    //Buscar equipo (Por serial o cedula).
}

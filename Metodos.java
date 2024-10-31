import java.util.ArrayList;
import java.util.LinkedList;

import javax.swing.JOptionPane;

public class Metodos {
    public LinkedList<EstIngenieria> Ingenieros = new LinkedList<>();
    public LinkedList<EstDiseño> Diseñadores = new LinkedList<>();
    public LinkedList<Portatil> PC = new LinkedList<>();
    public LinkedList<TabGrafica> TAB = new LinkedList<>();

    public void RegistroEstudiantesIng() {
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del estudiante:");
        String apellido = JOptionPane.showInputDialog("Ingrese el apellido del estudiante:");
        double cedula = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cédula del estudiante (Ingenieria):"));
        double telefono = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el teléfono del estudiante:"));
        double serial = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el serial del portátil:"));
        int SemAct = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de semestre actual cursando:"));
        float promedioAcumulado = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el promedio acumulado:"));

        // Aquí asumimos que EstudianteIngenieria y ComputadorPortatil ya están definidos correctamente
        EstIngenieria estudiante = new EstIngenieria(nombre, apellido, cedula, telefono, serial, SemAct, promedioAcumulado);
        Ingenieros.add(estudiante);

    }
/*   PUEDE SERVIR MAS ADELANTE (ES SIMPLEMENTE UN BORRADOR)
    // Pide más información necesaria para el computador portátil
    String marca = JOptionPane.showInputDialog("Ingrese la marca del computador portátil:");
    float tamano = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el tamaño del computador portátil en pulgadas:"));
    float precio = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el precio del computador portátil:"));
    ComputadorPortatil portatil = new ComputadorPortatil(serial, marca, tamano, precio, "", "");

    portatil.seleccionarSistemaOperativo();
    portatil.seleccionarProcesador();
    vectorPortatil.add(portatil);

    JOptionPane.showMessageDialog(null, "Préstamo para estudiante de ingeniería registrado exitosamente.");
*/


    //modificar prestamo del equipo (Por serial o cedula)
    //Devolución de equipo (se elimina el registro). (Por serial o cedula)
    //Buscar equipo (Por serial o cedula).
}

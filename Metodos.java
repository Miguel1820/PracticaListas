
import java.util.LinkedList;

import javax.swing.JOptionPane;

public class Metodos {
    LinkedList<EstIngenieria> Ingenieros = new LinkedList<>();
    LinkedList<EstDiseño> Diseñadores = new LinkedList<>();
    LinkedList<Portatil> PC = new LinkedList<>();
    LinkedList<TabGrafica> TAB = new LinkedList<>();

    public void RegistroEstudiantesIng() {
    //Datos del estudiante
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del estudiante:");
        String apellido = JOptionPane.showInputDialog("Ingrese el apellido del estudiante:");
        double cedula = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cédula del estudiante (Ingenieria):"));
        double telefono = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el teléfono del estudiante:"));
        double serial = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el serial del portátil:"));
        int SemAct = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de semestre actual cursando:"));
        float promedioAcumulado = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el promedio acumulado:"));

        //lo agregamos a la lista, los datos del estudiante (constructor)
        EstIngenieria estudiante = new EstIngenieria(nombre, apellido, cedula, telefono, serial, SemAct, promedioAcumulado);
        Ingenieros.add(estudiante);

    //Gestion o datos del prestamo
        String marca = JOptionPane.showInputDialog("Ingrese la marca del portátil:");
        float tamaño = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el tamaño del portátil (pulgadas):"));
        float precio = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el precio del portátil:"));
        
        //lo agregamos a la lista, los datos del portatil (constructor)
        Portatil portatil = new Portatil(marca, SemAct, tamaño, precio);
        portatil.seleccionarSistemaOperativo();
        portatil.seleccionarProcesador();
        PC.add(portatil);

    JOptionPane.showMessageDialog(null, "Préstamo para el estudiante de ingeniería registrado exitosamente.");
    }


    public void RegistroEstudiantesDis() {
    //Datos del estudiante    
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del estudiante:");
        String apellido = JOptionPane.showInputDialog("Ingrese el apellido del estudiante:");
        double cedula = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cédula del estudiante (Diseño):"));
        double telefono = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el teléfono del estudiante:"));
        int serial = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el serial de la tableta:"));
        int CantAsig = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el cantidad de asignaturas cursando:"));
        boolean EstVirtual = Boolean.parseBoolean(JOptionPane.showInputDialog("Ingrese la modalidad de estudio (Virtual/Presencial):"));

        //lo agregamos a la lista, los datos del estudiante (constructor)
        EstDiseño estudiante = new EstDiseño(nombre, apellido, cedula, telefono, serial, CantAsig, EstVirtual);
        Diseñadores.add(estudiante);

    //Gestion o datos del prestamo
        String marca = JOptionPane.showInputDialog("Ingrese la marca de la tableta grafica:");
        float tamaño = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el tamaño de la tableta grafica (pulgadas):"));
        float precio = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el precio de la tableta grafica:"));
        float peso = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el peso de la tableta grafica (kg):"));

        //lo agregamos a la lista, los datos de la tableta grafica (constructor)
        TabGrafica tableta = new TabGrafica(marca, marca, serial, tamaño, precio, peso);
        tableta.seleccionarAlmacenamiento();
        TAB.add(tableta);

    JOptionPane.showMessageDialog(null, "Préstamo para el estudiante de diseño registrado exitosamente.");
    }

//Buscar prestamo por cedula
    private EstIngenieria buscarPrestamoPorCedulaIngenieria(double cedula) {
        for (EstIngenieria estudiante : Ingenieros) {
            if (estudiante.getCedula().equals(cedula)) {
                return estudiante;
            }
        }
        return null;
    }
//corregir prestamo a datos del pc NO del estudiante
    public void modificarPrestamoIngenieria() {
        String cedula = JOptionPane.showInputDialog("Ingrese la cédula del estudiante para modificar el préstamo:");
        EstIngenieria estudiante = buscarPrestamoPorCedulaIngenieria(cedula);

        if (estudiante != null) {
            String nuevoTelefono = JOptionPane.showInputDialog("Ingrese el nuevo teléfono:");
            int nuevoSemestre = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nuevo número de semestre cursado:"));
            float nuevoPromedio = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el nuevo promedio acumulado:"));

            estudiante.setTelefono(nuevoTelefono);
            estudiante.setnumeroSemestre(nuevoSemestre);
            estudiante.setpromedioAcumulado(nuevoPromedio);

            JOptionPane.showMessageDialog(null, "Préstamo del estudiante de ingeniería modificado exitosamente.");
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró un préstamo registrado para la cédula ingresada.");
        }
    }

}

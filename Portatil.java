import javax.swing.JOptionPane;

public class Portatil {
    String marca;
    int serial;
    float tamaño, precio;

    
    public Portatil(String marca, int serial, float tamaño, float precio) {
        this.marca = marca;
        this.serial = serial;
        this.tamaño = tamaño;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public int getSerial() {
        return serial;
    }
    public void setSerial(int serial) {
        this.serial = serial;
    }
    public float getTamaño() {
        return tamaño;
    }
    public void setTamaño(float tamaño) {
        this.tamaño = tamaño;
    }
    public float getPrecio() {
        return precio;
    }
    public void setPrecio(float precio) {
        this.precio = precio;
    }
    

    //Datos del Portatil que nesecita el estudiante de ingenieria    
    public String DatosPort() {
        String mensaje = "Marca: " + marca + "\n" +
                "Serial: " + serial + "\n" +
                "Tamaño: " + tamaño + "\n" +
                "Precio: " + precio + "\n";
        return mensaje;
    }

    
    // Método para seleccionar el sistema operativo
    public void seleccionarSistemaOperativo() {
        int opcSele = 0;
        boolean bandera = true;
        String mensaje = "Seleccione el sistema operativo:\n" +
                "1. Windows 7\n" +
                "2. Windows 10\n" +
                "3. Windows 11\n";
        while (bandera) {
            opcSele = (Integer.parseInt(JOptionPane.showInputDialog(mensaje)));
            while (opcSele < 1 || opcSele > 3) {
                JOptionPane.showMessageDialog(null, "Ha ingresado una opcion no valida.", "Dato Incorrecto",
                        JOptionPane.ERROR_MESSAGE);
                opcSele = (Integer.parseInt(JOptionPane.showInputDialog(mensaje)));
            }
            switch (opcSele) {
                case 1:
                    JOptionPane.showMessageDialog(null, "Has seleccionado el sistema operativo: Windows 7");
                    bandera = true;
                    return;
                case 2:
                    JOptionPane.showMessageDialog(null, "Has seleccionado el sistema operativo: Windows 10");
                    bandera = true;
                    return;
                case 3:
                    JOptionPane.showMessageDialog(null, "Has seleccionado el sistema operativo: Windows 11");
                    bandera = true;
                    return;

                default:
                    JOptionPane.showMessageDialog(null, "Ha  ingresado una opcion no valida.", "Dato Incorrecto",
                        JOptionPane.ERROR_MESSAGE);
                    bandera = false;
                    break;
            }
        }
    }


    // Método para seleccionar el procesador
     public void seleccionarProcesador() {
        int opcSele = 0;
        boolean bandera = true;
        String mensaje = "Seleccione el procesador:\n" +
                "1. AMD Ryzen\n" +
                "2. Intel® Core™ i5\n";
        while (bandera) {
            opcSele = (Integer.parseInt(JOptionPane.showInputDialog(mensaje)));
            while (opcSele < 1 || opcSele > 2) {
                JOptionPane.showMessageDialog(null, "Ha ingresado una opcion no valida.", "Dato Incorrecto",
                        JOptionPane.ERROR_MESSAGE);
                opcSele = (Integer.parseInt(JOptionPane.showInputDialog(mensaje)));
            }
            switch (opcSele) {
                case 1:
                    JOptionPane.showMessageDialog(null, "Has seleccionado el procesador: AMD Ryzen");
                    bandera = true;
                    return;
                case 2:
                    JOptionPane.showMessageDialog(null, "Has seleccionado el procesador: Intel® Core™ i5");
                    bandera = true;
                    return;

                default:
                    JOptionPane.showMessageDialog(null, "Ha  ingresado una opcion no valida.", "Dato Incorrecto",
                        JOptionPane.ERROR_MESSAGE);
                    bandera = false;
                    break;
            }
        }
    }

}


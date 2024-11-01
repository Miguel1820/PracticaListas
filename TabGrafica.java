import javax.swing.JOptionPane;

public class TabGrafica {
    String marca, almacenamiento;
    int serial;
    float tamaño, precio, peso;


    public TabGrafica(String marca, String almacenamiento, int serial, float tamaño, float precio, float peso) {
        this.marca = marca;
        this.almacenamiento = almacenamiento;
        this.serial = serial;
        this.tamaño = tamaño;
        this.precio = precio;
        this.peso = peso;
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
    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }


    //Datos de la tableta grafica que nesecita el estudiante de diseño
    public String DatosPort() {
        String mensaje = "Marca: " + marca + "\n" +
                "Serial: " + serial + "\n" +
                "Tamaño: " + tamaño + "\n" +
                "Precio: " + precio + "\n" +
                "Peso: " + peso + "\n";
        return mensaje;
    }
    
    
    // Método para seleccionar el almacenamiento de la tablet
    public void seleccionarAlmacenamiento() {
        int opcSele = 0;
        boolean bandera = true;
        String mensaje = "Seleccione el almacenamiento de la tableta:\n" +
                "1. 256 GB\n" +
                "2. 512 GB\n" +
                "3. 1 TB\n";
        while (bandera) {
            opcSele = (Integer.parseInt(JOptionPane.showInputDialog(mensaje)));
            while (opcSele < 1 || opcSele > 3) {
                JOptionPane.showMessageDialog(null, "Ha ingresado una opcion no valida.", "Dato Incorrecto",
                        JOptionPane.ERROR_MESSAGE);
                opcSele = (Integer.parseInt(JOptionPane.showInputDialog(mensaje)));
            }
            switch (opcSele) {
                case 1:
                    JOptionPane.showMessageDialog(null, "Has seleccionado el almacenamiento de la tableta: 256 GB");
                    bandera = true;
                    return;
                case 2:
                    JOptionPane.showMessageDialog(null, "Has seleccionado el almacenamiento de la tableta: 512 GB");
                    bandera = true;
                    return;
                case 3:
                    JOptionPane.showMessageDialog(null, "Has seleccionado el almacenamiento de la tableta: 1 TB");
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

import javax.swing.JOptionPane;

public class Portatil {
    String marca;
    int serial;
    float tamaño, precio;


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

//menu de que desea hacer
    public static void main(String[] args) {
    int opt = 0;
    boolean bandera = true;
    String mensaje = "Ingrese la opcion que desea ejecutar \n" +
                "1: Registrar un Equipo \n" +
                "2: Modificar registro \n" +
                "3: Devolucion de Equipo \n" +
                "4: Buscar Equipo \n" +
                "5: Salir a menu pricipal \n";
    while (bandera) {
            opt = (Integer.parseInt(JOptionPane.showInputDialog(mensaje)));
            switch (opt) {
                case 1:
                    
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                case 5:
                
                    break;
                default:
                    bandera = false;
                    JOptionPane.showMessageDialog(null, "Ha ingresado una opcion no valida.", "Dato Incorrecto",
                        JOptionPane.ERROR_MESSAGE);
                    break;        
            }
        } 
    }    

}


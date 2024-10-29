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

}

public class EstDiseño {
    String nombre, apellido;
    double cedula, telefono;
    int CantAsig, serial;
    boolean EstVirtual;


    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public double getCedula() {
        return cedula;
    }
    public void setCedula(double cedula) {
        this.cedula = cedula;
    }
    public double getTelefono() {
        return telefono;
    }
    public void setTelefono(double telefono) {
        this.telefono = telefono;
    }
    public int getCantAsig() {
        return CantAsig;
    }
    public void setCantAsig(int cantAsig) {
        CantAsig = cantAsig;
    }
    public int getSerial() {
        return serial;
    }
    public void setSerial(int serial) {
        this.serial = serial;
    }
    public boolean isEstVirtual() {
        return EstVirtual;
    }
    public void setEstVirtual(boolean estVirtual) {
        EstVirtual = estVirtual;
    }
    

    public String MostrarDis() {
        String mensaje = "Nombre: " + nombre + "\n" +
                "Apellido: " + apellido + "\n" +
                "Cedula: " + cedula + "\n" +
                "Telefono: " + telefono + "\n" +
                "Serial: " + serial + "\n" +
                "Cantidad Asignaturas: " + CantAsig + "\n" +
                "Modalidad (Virtual/Presencial): " + EstVirtual + "\n";
        return mensaje;
    }

    //tambien hacer los case
}

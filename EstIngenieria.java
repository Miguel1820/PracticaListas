public class EstIngenieria {
    String nombre, apellido;
    double cedula, telefono, serial;
    int SemAct;
    float PromAcum;


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
    public double getSerial() {
        return serial;
    }
    public void setSerial(double serial) {
        this.serial = serial;
    }
    public int getSemAct() {
        return SemAct;
    }
    public void setSemAct(int semAct) {
        SemAct = semAct;
    }
    public float getPromAcum() {
        return PromAcum;
    }
    public void setPromAcum(float promAcum) {
        PromAcum = promAcum;
    }

//Datos del Estudiante de Ingenieria
    public String DatosIng() {
        String mensaje = "Nombre: " + nombre + "\n" +
                "Apellido: " + apellido + "\n" +
                "Cedula: " + cedula + "\n" +
                "Telefono: " + telefono + "\n" +
                "Serial: " + serial + "\n" +
                "Semestre cursando: " + SemAct + "\n" +
                "Promedio: " + PromAcum + "\n";
        return mensaje;

    }
    
    //tambien hacer los case
}
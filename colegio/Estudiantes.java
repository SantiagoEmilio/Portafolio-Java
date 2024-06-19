package colegio;

public class Estudiantes {

    private String nombre;
    private String correo;
    private String Grado;
    private int edad;
    private boolean solvencia;

    public Estudiantes (String nombre, String correo,String Grado, int edad, boolean solvencia){
        this.nombre =nombre;
        this.correo =correo;
        this.Grado=Grado;
        this.edad=edad;
        this.solvencia=solvencia;
    }

    //METODOS DE TIPO GET (OBTENER)

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public String getGrado() {
        return Grado;
    }
    public int getedad() {
        return edad;
    }

    public boolean getsolvencia() {
        return solvencia;
    }

    //METODOS DE TIPO SET (ESTRABLECER)

    public void setNombre( String Nombre) {
        this.nombre = nombre;
    }

    public void setCorreo( String correo) {
        this.correo = correo;
    }

    public void setGrado( String Grado) {
        this.Grado = Grado;
    }

    public void setEdad( int edad) {
        this.edad = edad;
    }

    public void setSolvencia( boolean solvencia) {
        this.solvencia = solvencia;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre+ " ,Correo: " + correo ;
    }
}

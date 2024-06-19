package colegio;

public class Cursos {
    private String nombre;
    private String categoria;
    private String periodo;

    //metodo Constructor

    public Cursos (String nombre, String categoria, String periodo){
        this.nombre= nombre;
        this.categoria = categoria;
        this.periodo= periodo;

    }

    //METODOS DE TIPO GET (OBTENER)

    public String getNombre() {
        return nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getPeriodo() {
        return periodo;
    }

//METODOS DE TIPO SET (ESTRABLECER)

    public void setNombre( String nombre) {
        this.nombre=nombre;
    }

    public void setCategoria( String categoria) {
        this.categoria = categoria;
    }

    public void setPeriodo( String periodo) {
        this.periodo = periodo;
    }



    @Override
    public String toString() {
        return "Nombre:" + nombre + ",Categoria: " + categoria + "Periodo" + periodo;
    }
}

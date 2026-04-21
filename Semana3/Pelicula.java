package Semana3;

public class Pelicula {

    private String nombre;
    private int edadMin;

    public Pelicula(String nombre, int edadMin) {
        this.nombre = nombre;
        this.edadMin = edadMin;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdadMin() {
        return edadMin;
    }
}

package EjBasicos3T.Semana3.EyL.YO;

public class Estudiante {

    private String nombre;
    private String apellido1;
    private int id;

    public Estudiante(String nombre, String apellido1, int id) {

        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.id = id;

    }

    public String getNombre() {

        return nombre;

    }

    public String getApellido1() {

        return apellido1;

    }

    public int getId() {

        return id;

    }

    public String toFormato() {

         return "Nombre: " + nombre + "\n" +
                 "Apellido1: " + apellido1 + "\n" +
                 "Id: " + id;

    }

    public static Estudiante fromFormato(String contenido) {
        String[] lineas = contenido.split("\n");

        String nombre = lineas[0].split(": ")[1];
        String apellido1 = lineas[1].split(": ")[1];
        int id = Integer.parseInt(lineas[2].split(": ")[1]);

        return new Estudiante(nombre, apellido1, id);
    }
}

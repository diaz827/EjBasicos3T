package EjBasicos3T.Semana3.EyL.YO;

public class Estudiante {

    private String nombre = "";
    private String apellido1 = "";
    private int id = 0;

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
}

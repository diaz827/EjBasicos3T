package EjBasicos3T.EJ2YO;

public class Usuario {

    private String nombre;
    private static int totalUsuarios;

    public Usuario(String nombre) {

        this.nombre = nombre;
        totalUsuarios++;

    }

    public String getNombre() {

        return nombre;

    }

    public static int getTotalUsuarios() {

        return totalUsuarios;

    }
}

package EjBasicos3T.Semana5;

public abstract class Animal {

    private String nombre;
    public abstract Animal(String nombre) {

        this.nombre = nombre;

    }
    public void hacerSonido(){

        System.out.println("");

    }

    public String getNombre() {

        return nombre;

    }
}

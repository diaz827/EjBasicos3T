package EjBasicos3T.Semana4.Ej1;

public class Gato extends Animal {

    public Gato(String nombre) {

        super(nombre);

    }

    @Override
    public void hacerSonido(){

        System.out.println(getNombre() + " dice: miau");

    }
}

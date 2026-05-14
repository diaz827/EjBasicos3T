package EjBasicos3T.Semana4.Ej3;

public class Circulo extends Figura{

    public Circulo(String nombre) {

        super(nombre);

    }

    double radio;

    public Circulo(String nombre, double radio) {
        super(nombre);
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI*radio*radio;
    }
}

package EjBasicos3T.Semana4.Ej3;

public class Cuadrado extends Figura{

    public Cuadrado(String nombre) {

        super(nombre);

    }

    double lado ;

    public Cuadrado(String nombre, double lado) {
        super(nombre);
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado*lado;
    }
}

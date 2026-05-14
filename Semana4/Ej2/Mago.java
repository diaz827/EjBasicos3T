package EjBasicos3T.Semana4.Ej2;

import java.util.Random;

public class Mago extends Personaje{

    Random random = new Random();

    public Mago(String nombre, int ataque) {
        super(nombre, ataque);
    }

    @Override
    public int atacar() {
        // Daño aleatorio entre -20% y +20% del ataque base
        double variacion = 0.8 + (random.nextDouble() * 0.4); // [0.8, 1.2)
        return (int) (getAtaque() * variacion);
    }
}

package EjBasicos3T.Semana4.Ej2;

import java.util.Random;

public class Guerrero extends Personaje {

    Random random = new Random();

    public Guerrero(String nombre, int ataque) {
        super(nombre, ataque);
    }
    @Override
    public int atacar() {
        boolean golpeCritico = random.nextInt(10) == 0; // 10% de probabilidad
        return golpeCritico ? getAtaque() * 2 : getAtaque();
    }
}

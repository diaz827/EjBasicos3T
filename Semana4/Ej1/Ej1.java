package EjBasicos3T.Semana4.Ej1;

/*
Ejercicio 1:

Crea una clase Animal con atributo nombre y métod hacerSonido().
Este métod devuelve un String vacío.

Después crea dos clases:
- Perro
- Gato

Ambas deben de heedar de Animal, y ambas deben sobreescribir hacerSonido()
para devolver el valor adecuado (guau o miau).

Crea un main donde crees varias mascotas, e imprime el sonido que
hace cada una.

 */

public class Ej1 {
    public static void main(String[] args) {

        Gato gato1 = new Gato("erik");
        Perro perro1 = new Perro("raul");
        Animal ninguno = new Animal("");

        gato1.hacerSonido();
        perro1.hacerSonido();
        ninguno.hacerSonido();

    }
}

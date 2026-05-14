package EjBasicos3T.Semana5;

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

/*
Ejercicio 1:
La semana pasada habíamos hecho una clase Animal que tenía un métod hacerSonido() que sobreescribían sus hijos.

Cambia dicho métod en Animal a abstracto (y la clase animal también), y crea un nuevo animal que herede de esta clase.

 */

public class Ej1 {

    public static void main(String[] args) {

        Gato gato1 = new Gato("erik");
        Perro perro1 = new Perro("raul");
        /*Animal ninguno = new Animal("") {
            @Override
            public void hacerSonido() {

            }

         */
        };

        gato1.hacerSonido();
        perro1.hacerSonido();
        ninguno.hacerSonido();

    }
}

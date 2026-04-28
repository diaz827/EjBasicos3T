package EjBasicos3T.Semana3.Excepciones.Ej2;

/*
Ejercicio 2:

Crea una clase Película, que tiene un nombre y una edad mínima para verla. Hazle getters.
Crea una excepción personalizada "TooYoungException".

En la clase Main, crea un métod"verPelicula(Pelicula pelicula, int edadEspectador)". Tiene que devolver el nombre de la película,
pero si la edad no es adecuada, tiene que lanzar (throw) tu excepción.

En la clase Main, crea la función main (la de entrada del programa), crea 2 películas (una para 13 y otra para 7),
y trata de ver ambas como si tuvieses 10 años; imprime cuando sí puedes verla, y cuando no puedes verla.
 */
public class Ej2 {

    public static void main(String[] args) {

        Pelicula peli1 = new Pelicula("Acción Total", 13);
        Pelicula peli2 = new Pelicula("Dibujos Divertidos", 7);

        int edadEspectador = 10;

        System.out.println("--Intentamos entrar en la sesión del cine (Edad " + edadEspectador + " años)--");

        try {

            String titulo = verPelicula(peli1, edadEspectador);
            System.out.println("Pasa, puedes ver " + titulo);

        } catch (TooYoungException tye) {

            System.out.println("Error, no puedes ver la pelicula pq: " + tye.getMessage());

        }

        try {

            String titulo = verPelicula(peli2, edadEspectador);
            System.out.println("Pasa, puedes ver " + titulo);

        } catch (TooYoungException tye) {

            System.out.println("Error, no puedes ver la pelicula pq: " + tye.getMessage());

        }

    }

    public static String verPelicula(Pelicula pelicula, int edadEspectador) throws TooYoungException {

        if (edadEspectador < pelicula.getEdadMin()) {

             throw new TooYoungException("No alcanzas la edad minima para la pelicula " + pelicula.getNombre());

        }

        return pelicula.getNombre();

    }
}




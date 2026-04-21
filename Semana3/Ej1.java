package Semana3;

/*
Ejercicio 1:

Crea un programa que pida un número al usuario con Scanner - nextInt(). Investiga qué excepciones puede lanzar este métod.
Captura la excepción si el usuario introduce algo que no es un número, y sigue pidiendo el número.
La estructura sería:

// declaramos el scanner, por ejemplo, le llamamos SC
// Declaramos un booleano "lecturaCorrecta" inicializado a "false"; lo utilizaremos para saber cuando hemos leído un valor correcto
y podemos salir del bucle de lectura
// le pedimos al usuario que introduzca un entero y comenzamos el bucle, que estará leyendo tod el rato hasta que el usuario ponga
un valor correcto.
// while ( ! lecturaCorrecta) {
// Hacemos un try-catch; en el try leemos nextInt(), y en la siguiente línea ya seteamos lecturaCorrecta a true (en caso de que
lance una excepción, ya no pasaría por esa siguiente línea). En el catch imprimimos "Valor incorrecto. Prueba otra vez".
// }
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero = 0;
        boolean lecturaCorrecta = false;
        System.out.println("Introduce un numero por teclado:");

        // El bucle se repetirá MIENTRAS lecturaCorrecta sea false
        while (!lecturaCorrecta) {

            try {

                numero = sc.nextInt();
                lecturaCorrecta = true;

            } catch (Exception e) {
                // Si el usuario mete algo que no es un entero (ej: "hola" o "10.5"),
                // el programa salta directamente aquí.

                System.out.println("Valor incorrecto. Prueba otra vez:");
                sc.nextLine();
            }
        }
        System.out.println("El valor introducido es: " + numero);
        sc.close();
    }
}

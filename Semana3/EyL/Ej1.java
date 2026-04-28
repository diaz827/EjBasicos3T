package EjBasicos3T.Semana3.EyL;

/*Ejercicio 1: escribir en un fichero
- Crea un programa que lea por teclado 3 frases.
- Después, tiene que escribirlas en un fichero.
- Finalmente, tiene que leer el mismo fichero, línea a línea, e imprimir "Línea X: " + el contenido. ".

IMPORTANTE:
- Aunque leamos 3 frases sólo, no las almacenes en 3 variables. Utiliza una LISTA para almacenarlas.
- Aunque leamos 3 frases sólo, no imprimas 3 veces. Leer el fichero en un bucle, línea a línea, hasta acabar.
- Tendrás que capturar (catch) las excepciones que lanzan las clases de lectura/escritura de ficheros.
 */

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;
import java.util.Scanner;

public class Ej1 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe una frase");
        String Frase1 = sc.nextLine();

        System.out.println("Escribe otra frase");
        String Frase2 = sc.nextLine();

        System.out.println("Escribe otra frase");
        String Frase3 = sc.nextLine();

        BufferedWriter teclado = new BufferedWriter(new FileWriter("frases.txt"));

        teclado.write(Frase1);
        teclado.newLine();

        teclado.write(Frase2);
        teclado.newLine();

        teclado.write(Frase3);
        teclado.newLine();

        teclado.close();
    }

}
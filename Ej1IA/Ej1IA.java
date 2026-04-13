import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

// Clase Ej1IA: Solución al ejercicio de leer 3 palabras y almacenarlas sin duplicados.
public class Ej1IA {
    public static void main(String[] args) {
        // Usamos Scanner para leer la entrada del teclado.
        Scanner scanner = new Scanner(System.in);
        
        // Usamos HashSet para almacenar las palabras.
        // El HashSet garantiza automáticamente que NO haya elementos duplicados.
        Set<String> palabras = new HashSet<>();

        System.out.println("Introduce 3 palabras:");

        // Bucle for que se ejecuta 3 veces para pedir 3 palabras.
        for (int i = 0; i < 3; i++) {
            System.out.print("Palabra " + (i + 1) + ": ");
            String palabra = scanner.nextLine();
            
            // Añadimos la palabra al conjunto.
            // Si la palabra ya existe, el HashSet la ignorará (no la duplica).
            palabras.add(palabra);
        }

        System.out.println("\nLas palabras únicas introducidas son:");
        
        // Imprimimos el conjunto resultante utilizando un bucle for-each.
        for (String p : palabras) {
            System.out.println(p);
        }

        // Cerramos el scanner para liberar recursos.
        scanner.close();
    }
}

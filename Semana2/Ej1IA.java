package EjBasicos3T.Semana2;

import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

// Clase Semana2.Ej1IA: Solución al ejercicio de leer 3 palabras y almacenarlas sin duplicados.
public class Ej1IA {
    public static void main(String[] args) {
        // Usamos Scanner para leer la entrada del teclado.
        Scanner scanner = new Scanner(System.in);
        
        // Usamos HashSet para almacenar las palabras.
        // El HashSet garantiza automáticamente que NO haya elementos duplicados.
        /*
         * EXPLICACIÓN DE HASHSET:
         * 1. Unicidad: HashSet no permite duplicados; si añades un duplicado, lo ignora.
         * 2. Sin orden: No garantiza que los elementos se mantengan en el orden de inserción.
         * 3. Eficiencia: Es muy rápido para añadir, eliminar o verificar si un elemento existe
         *    gracias al uso de "Hash Table" (tablas de dispersión).
         * 4. Cuándo usarlo: Cuando necesites una colección de elementos únicos donde
         *    el orden no sea lo prioritario.
         */
        /*
         * CÓMO SE DECLARA/INSTANCIA UN HASHSET:
         * 1. Set<String> palabras: Declaramos la variable 'palabras' como tipo 'Set' (interfaz)
         *    que contendrá objetos de tipo 'String'.
         * 2. = new HashSet<>(): Instanciamos la clase 'HashSet' (implementación concreta).
         * 3. <> (Diamond Operator): Java infiere automáticamente que el HashSet será de tipo <String>
         *    basándose en la declaración inicial.
         */
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

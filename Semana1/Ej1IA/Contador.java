package EjBasicos3T.Semana1.Ej1IA;

// Clase Ej1.Contador: define cómo funcionará nuestro contador estático.
public class Contador {

    // Atributo estático: al ser "static", pertenece a la clase "Ej1.Contador"
    // y no a cada objeto que pudiéramos crear.
    // Al ser "private", solo puede ser accedido directamente desde esta clase.
    // Esto asegura que el valor se mantenga compartido para toda la ejecución del programa.
    private static int contador = 0;

    // Métod0 estático: permite aumentar la variable sin crear objetos.
    // Se invoca usando el nombre de la clase: Ej1.Contador.incrementar().
    public static void incrementar() {
        // Incrementamos el valor actual del contador en 1.
        contador++; 
    }

    // Métod0 estático: permite consultar el valor actual del contador desde fuera de esta clase.
    public static int getContador() {
        // Devolvemos el valor actual del contador.
        return contador; 
    }
}

package EjBasicos3T.Semana1.Ej1IA;

// Clase Ej1.Principal1: donde ejecutaremos nuestro programa.
public class Principal1 {

    /*
    Ejercicio 1:
    Crea una clase Contador con:

    - un atributo static int contador
    - un métod0 static void incrementar() que aumente el contador en 1
    - un métod0 static int getContador()

    Desde una clase Principal1, llama varias veces a incrementar() y muestra el valor final.
    Recuerda que es tod0 static, NO tienes que crear una variable de tipo Contador,
    sino usar Contador.incrementar()
     */

    // El métod0 main es el punto de entrada de cualquier programa Java.
    public static void main(String[] args) {

        // Llamamos a los métodos estáticos directamente desde el nombre de la clase,
        // sin necesidad de crear ninguna instancia (objeto) con "new Ej1.Contador()".
        // Esto es posible porque los métodos son 'static'.
        
        // Primera llamada: el contador pasa de 0 a 1.
        Contador.incrementar();
        
        // Segunda llamada: el contador pasa de 1 a 2.
        Contador.incrementar(); 
        
        // Tercera llamada: el contador pasa de 2 a 3.
        Contador.incrementar(); 

        // Mostramos el valor final llamando al métod0 estático getContador() de la clase Ej1.Contador.
        System.out.println("El valor final del contador es: " + Contador.getContador());
    }
}

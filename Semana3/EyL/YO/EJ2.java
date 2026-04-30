package EjBasicos3T.Semana3.EyL.YO;

/*
Ejercicio 2: guardar y recuperar datos estructurados.

- Crea una clase Estudiante que tenga nombre, apellido1 e id (numérico).
- En un Main, crea un estudiante y guarda la información en disco, en formato "Nombre: Ismael\n Apellido1: Hasan\n Id: 111".
- Después, leer la información de disco, y construye un objeto Estudiante con esa información que has leído.

HINTS:
- La clase String tiene un métod "split" que te permite convertir un String en un array de Strings usando un separador.
Por ejemplo, ante el String "valor1,valor2,valor3", su "split(",")" nos devolverá un array: ["valor1", "valor2", "valor3"]
- Cuando leemos de disco, leeremos Strings. Por tanto, ese "111" del ID será un String,
no un número. Para convertir un String a entero puedes usar "int numero = Integer.parseInt(variableString);"

EXTRA:
- Puedes plantear crear una clase con métodos para serializar / deserializar (Estudiante -> String, Strint -> Estudiante).
 */

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EJ2 {

    public static void main(String[] args) throws IOException {

        Estudiante Carles = new Estudiante("Carles\n","Sanchez\n",123);




    }

    private static void guardarEstudiante (Estudiante est) throws IOException {

        BufferedWriter datos = new BufferedWriter(new FileWriter("estudiante.txt"));

        datos.write("Nombre: " + est.getNombre());
        datos.newLine();

        datos.write("Apellido: " + est.getApellido1());
        datos.newLine();

        datos.write("ID: " + est.getId());
        datos.newLine();

        datos.close();

    }
}

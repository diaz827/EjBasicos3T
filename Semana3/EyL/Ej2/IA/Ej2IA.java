package EjBasicos3T.Semana3.EyL.Ej2.IA;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
Ejercicio 2: guardar y recuperar datos estructurados.

- Crea una clase Estudiante que tenga nombre, apellido1 e id (numérico).
- En un Main, crea un estudiante y guarda la información en disco, en formato "Nombre: Ismael\n Apellido1: Hasan\n Id: 111".
- Después, leer la información de disco, y construye un objeto Estudiante con esa información que has leído.

HINTS:
- La clase String tiene un métod "split" que te permite convertir un String en un array de Strings usando un separador. Por ejemplo, ante el String "valor1,valor2,valor3", su "split(",")" nos devolverá un array: ["valor1", "valor2", "valor3"]
- Cuando leemos de disco, leeremos Strings. Por tanto, ese "111" del ID será un String, no un número. Para convertir un String a entero puedes usar "int numero = Integer.parseInt(variableString);"

EXTRA:
- Puedes plantear crear una clase con métodos para serializar / deserializar (Estudiante -> String, Strint -> Estudiante).
 */
public class Ej2IA {

    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Ismael", "Hasan", 111);
        String nombreFichero = "estudiante.txt";

        try {
            guardarEstudiante(estudiante, nombreFichero);

            Estudiante estudianteLeido = leerEstudiante(nombreFichero);

            System.out.println("Estudiante recuperado:");
            System.out.println("Nombre: " + estudianteLeido.getNombre());
            System.out.println("Apellido1: " + estudianteLeido.getApellido1());
            System.out.println("Id: " + estudianteLeido.getId());
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error leyendo o escribiendo el fichero.");
            e.printStackTrace();
        }
    }

    private static void guardarEstudiante(Estudiante estudiante, String nombreFichero) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(nombreFichero))) {
            bw.write("Nombre: " + estudiante.getNombre());
            bw.newLine();
            bw.write("Apellido1: " + estudiante.getApellido1());
            bw.newLine();
            bw.write("Id: " + estudiante.getId());
        }
    }

    private static Estudiante leerEstudiante(String nombreFichero) throws IOException {
        String nombre = "";
        String apellido1 = "";
        int id = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(nombreFichero))) {
            String linea;

            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(": ");

                if (partes[0].equals("Nombre")) {
                    nombre = partes[1];
                } else if (partes[0].equals("Apellido1")) {
                    apellido1 = partes[1];
                } else if (partes[0].equals("Id")) {
                    id = Integer.parseInt(partes[1]);
                }
            }
        }

        return new Estudiante(nombre, apellido1, id);
    }
}

class Estudiante {

    private String nombre;
    private String apellido1;
    private int id;

    public Estudiante(String nombre, String apellido1, int id) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public int getId() {
        return id;
    }

}

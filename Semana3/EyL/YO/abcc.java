import java.io.*;

public class EJ2 {

    public static void main(String[] args) throws IOException {

        Estudiante carles = new Estudiante("Carles", "Sanchez", 123);

        guardarEstudiante(carles);

        Estudiante recuperado = leerEstudiante();

        System.out.println("Estudiante recuperado:");
        System.out.println(recuperado.getNombre());
        System.out.println(recuperado.getApellido1());
        System.out.println(recuperado.getId());
    }

    private static void guardarEstudiante(Estudiante est) throws IOException {

        BufferedWriter datos = new BufferedWriter(new FileWriter("estudiante.txt"));

        datos.write(est.toFileFormat());

        datos.close();
    }

    private static Estudiante leerEstudiante() throws IOException {

        BufferedReader lector = new BufferedReader(new FileReader("estudiante.txt"));

        String linea;
        String contenido = "";

        while ((linea = lector.readLine()) != null) {
            contenido += linea + "\n";
        }

        lector.close();

        return Estudiante.fromFileFormat(contenido);
    }
}
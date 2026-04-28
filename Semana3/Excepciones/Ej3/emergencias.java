package EjBasicos3T.Semana3.Excepciones.Ej3;

public class emergencias extends Exception {

    public emergencias(String message) {

        super(message);
        // 'super' envía el mensaje a la clase padre Exception para que
        // podamos recuperarlo luego con e.getMessage()
    }
}

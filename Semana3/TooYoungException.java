package Semana3;

public class TooYoungException extends Exception {

    public TooYoungException(String message) {

        super(message);
        // 'super' envía el mensaje a la clase padre Exception para que
        // podamos recuperarlo luego con e.getMessage()

    }
}

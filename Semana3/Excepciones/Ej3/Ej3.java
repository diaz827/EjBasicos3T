package EjBasicos3T.Semana3.Excepciones.Ej3;

public class Ej3 {
            /*
            Queremos implementar un cruce de semáforo entre 2 calles.
            El semáforo está en rojo para la calle 1 y verde para la 2 o viceversa.
            Nunca está en rojo y verde para ambas a la vez.
            Tienes que indicar en cada interacción, durante 10 interacciones
            (cambio de semáforo)
             */
    public static void main(String[] args) {

        boolean semaforoRojoCalle1 = true;
        boolean emergencia = true;

        System.out.println("--Aparece una Ambulancia en el cruce-- ");

        try {

            hayEmergencia(true);

        } catch (emergencias e) {

            throw new RuntimeException(e);

        }

        for (int i = 1; i <= 10; i++) {

            if (semaforoRojoCalle1) {

                System.out.println("Rojo para calle 1");
                System.out.println("Cruzan en la calle 2");

            } else { //si NO está rojo en la calle 1

                System.out.println("Rojo para calle 2");
                System.out.println("Cruzan en la calle 1");

            }

            System.out.println("Cambiamos el estado del semáforo...\n\n");
            semaforoRojoCalle1 = !semaforoRojoCalle1;

        }
    }

    public static void hayEmergencia(boolean emergencia) throws emergencias {

        if (emergencia == true) {

            throw new emergencias("QUE SE APARTE TODO EL MUNDO");

        }
    }
}

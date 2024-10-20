import java.util.Scanner;

public class CTiempo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int horasEstudio = 0;
        int horasEjercicios = 0;
        int horasLectura = 0;
        int horasTiempoLibre = 0;


        boolean continuar = true;

        while (continuar) {
            System.out.println("Ingrese las horas dedicadas a estudiar:");
            horasEstudio = scanner.nextInt();

            System.out.println("Ingrese las horas dedicadas a hacer ejercicios:");
            horasEjercicios = scanner.nextInt();

            System.out.println("Ingrese las horas dedicadas a leer:");
            horasLectura = scanner.nextInt();

            System.out.println("Ingrese las horas dedicadas a tiempo libre:");
            horasTiempoLibre = scanner.nextInt();

            // Calcular el tiempo total dedicado
            int tiempoTotal = horasEstudio + horasEjercicios + horasLectura + horasTiempoLibre;

            System.out.println("Tiempo total dedicado a todas las actividades: " + tiempoTotal + " horas");

            // Preguntar si desea continuar
            System.out.println("¿Desea ingresar nuevamente las horas dedicadas a las actividades? (si/no)");
            String respuesta = scanner.next();

            if (respuesta.equalsIgnoreCase("no")) {
                continuar = false;
            }
        }

        scanner.close();
    }
}


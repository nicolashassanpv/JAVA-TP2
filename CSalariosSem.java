import java.util.Scanner;

public class CSalariosSem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        final double TARIFA_POR_HORA = 15.0;


        System.out.println("Ingrese la cantidad de empleados:");
        int cantidadEmpleados = scanner.nextInt();

        int contadorEmpleados = 1;

        while (contadorEmpleados <= cantidadEmpleados) {
            System.out.println("Ingrese las horas trabajadas por el empleado " + contadorEmpleados + ":");
            int horasTrabajadas = scanner.nextInt();


            double salario = horasTrabajadas * TARIFA_POR_HORA;

            System.out.println("El salario del empleado " + contadorEmpleados + " es: $" + salario);

            contadorEmpleados++;
        }

        scanner.close();
    }
}

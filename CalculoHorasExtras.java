import java.util.Scanner;

public class CalculoHorasExtras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Ingrese el número de empleados:");
        int numeroEmpleados = scanner.nextInt();

        for (int i = 1; i <= numeroEmpleados; i++) {
            System.out.println("Ingrese las horas trabajadas por el empleado " + i + ":");
            int horasTrabajadas = scanner.nextInt();

            if (horasTrabajadas > 40) {
                int horasExtras = horasTrabajadas - 40;
                System.out.println("El empleado " + i + " tiene " + horasExtras + " horas extras.");
            } else {
                System.out.println("El empleado " + i + " no tiene horas extras.");
            }
        }

        scanner.close();
    }
}
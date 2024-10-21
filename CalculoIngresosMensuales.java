import java.util.Scanner;

public class CalculoIngresosMensuales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] ventas = new int[30];

        for (int i = 0; i < 30; i++) {
            System.out.println("Ingrese las ventas del día " + (i + 1) + ":");
            ventas[i] = scanner.nextInt();
        }

        int totalIngresos = calcularIngresosMensuales(ventas);

        System.out.println("El total de ingresos mensuales es: $" + totalIngresos);

        scanner.close();
    }

    public static int calcularIngresosMensuales(int[] ventas) {
        int totalIngresos = 0;

        for (int venta : ventas) {
            totalIngresos += venta;
        }

        return totalIngresos;
    }
}
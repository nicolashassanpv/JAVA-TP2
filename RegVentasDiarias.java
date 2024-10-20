import java.util.Scanner;

public class RegVentasDiarias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalVentas = 0;

        for (int dia = 1; dia <= 7; dia++) {
            System.out.println("Ingrese las ventas del día " + dia + ":");
            int ventasDiarias = scanner.nextInt();
            totalVentas += ventasDiarias;
        }

        System.out.println("El total de ventas de la semana es: $" + totalVentas);

        scanner.close();
    }
}
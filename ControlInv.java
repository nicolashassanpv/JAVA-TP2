import java.util.Scanner;

public class ControlInv {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el número de productos:");
        int numeroProductos = scanner.nextInt();

        int contadorProductos = 1;

        do {
            System.out.println("Ingrese la cantidad disponible del producto " + contadorProductos + ":");
            int cantidadDisponible = scanner.nextInt();

            if (cantidadDisponible < 5) {
                System.out.println("Es necesario realizar un pedido para el producto " + contadorProductos);
            }

            contadorProductos++;
        } while (contadorProductos <= numeroProductos);

        scanner.close();
    }
}

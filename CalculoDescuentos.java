public class CalculoDescuentos {
    public static void main(String[] args) {
        String[] clientes = {
                "Cliente A", "Cliente B", "Cliente C", "Cliente D", "Cliente E"
        };

        int[] compras = {
                5, 12, 8, 15, 3
        };

        calcularDescuentos(clientes, compras);
    }

    public static void calcularDescuentos(String[] clientes, int[] compras) {
        System.out.println("Clientes que reciben un descuento del 10%:");

        for (int i = 0; i < clientes.length; i++) {
            if (compras[i] > 10) {
                System.out.println(clientes[i]);
            }
        }
    }
}

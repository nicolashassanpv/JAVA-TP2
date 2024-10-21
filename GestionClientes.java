public class GestionClientes {
    public static void main(String[] args) {
        String[] clientes = {
                "Cliente A", "Cliente B", "Cliente C", "Cliente D", "Cliente E"
        };

        double[] facturasPendientes = {
                450.0, 600.0, 300.0, 750.0, 550.0
        };

        enviarFacturas(clientes, facturasPendientes);
    }

    public static void enviarFacturas(String[] clientes, double[] facturasPendientes) {
        System.out.println("Clientes con facturas pendientes mayores a $500:");

        for (int i = 0; i < clientes.length; i++) {
            if (facturasPendientes[i] > 500.0) {
                System.out.println(clientes[i]);
            }
        }
    }
}

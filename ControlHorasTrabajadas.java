public class ControlHorasTrabajadas {
    public static void main(String[] args) {
        String[] empleados = {
                "Empleado A", "Empleado B", "Empleado C", "Empleado D", "Empleado E"
        };

        int[] horasTrabajadas = {
                40, 35, 45, 30, 50
        };

        double[] pagosSemanales = calcularPagoSemanal(empleados, horasTrabajadas);

        System.out.println("Pagos semanales de los empleados:");
        for (int i = 0; i < empleados.length; i++) {
            System.out.println(empleados[i] + ": $" + pagosSemanales[i]);
        }
    }

    public static double[] calcularPagoSemanal(String[] empleados, int[] horasTrabajadas) {
        double[] pagosSemanales = new double[empleados.length];
        final double TARIFA_POR_HORA = 15.0;

        for (int i = 0; i < empleados.length; i++) {
            pagosSemanales[i] = horasTrabajadas[i] * TARIFA_POR_HORA;
        }

        return pagosSemanales;
    }
}
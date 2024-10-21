public class PrecioFinalDesc {
    public static void main(String[] args) {
        double[] preciosOriginales = {
                100.0, 200.0, 300.0, 400.0, 500.0,
                600.0, 700.0, 800.0, 900.0, 1000.0
        };

        double[] preciosFinales = calcularPrecioFinal(preciosOriginales);

        System.out.println("Precios finales de los productos:");
        for (int i = 0; i < preciosFinales.length; i++) {
            System.out.println("Producto " + (i + 1) + ": $" + preciosFinales[i]);
        }
    }

    public static double[] calcularPrecioFinal(double[] preciosOriginales) {
        double[] preciosFinales = new double[preciosOriginales.length];

        for (int i = 0; i < preciosOriginales.length; i++) {
            preciosFinales[i] = preciosOriginales[i] * 0.90;
        }

        return preciosFinales;
    }
}

public class Impuestos {
    public static void main(String[] args) {
        double[] facturas = {
                100.0, 200.0, 300.0, 400.0, 500.0,
                600.0, 700.0, 800.0, 900.0, 1000.0
        };

        double[] facturasConImpuesto = calcularImpuesto(facturas);

        System.out.println("Facturas con impuesto:");
        for (int i = 0; i < facturasConImpuesto.length; i++) {
            System.out.println("Factura " + (i + 1) + ": $" + facturasConImpuesto[i]);
        }
    }

    public static double[] calcularImpuesto(double[] facturas) {
        double[] facturasConImpuesto = new double[facturas.length];

        for (int i = 0; i < facturas.length; i++) {
            facturasConImpuesto[i] = facturas[i] * 1.21;
        }

        return facturasConImpuesto;
    }
}
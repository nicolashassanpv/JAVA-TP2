public class DescComprasGrandes {
    public static void main(String[] args) {
        double[] compras = {
                450.0, 600.0, 300.0, 750.0, 550.0,
                200.0, 800.0, 400.0, 900.0, 500.0
        };

        double[] comprasConDescuento = aplicarDescuento(compras);

        System.out.println("Compras con descuento:");
        for (int i = 0; i < comprasConDescuento.length; i++) {
            System.out.println("Compra " + (i + 1) + ": $" + comprasConDescuento[i]);
        }
    }

    public static double[] aplicarDescuento(double[] compras) {
        double[] comprasConDescuento = new double[compras.length];

        for (int i = 0; i < compras.length; i++) {
            if (compras[i] > 500.0) {
                comprasConDescuento[i] = compras[i] * 0.85;
            } else {
                comprasConDescuento[i] = compras[i];
            }
        }

        return comprasConDescuento;
    }
}
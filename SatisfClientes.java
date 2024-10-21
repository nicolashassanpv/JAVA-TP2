public class SatisfClientes {
    public static void main(String[] args) {
        int[] calificaciones = {
                4, 5, 3, 4, 5,
                2, 3, 4, 5, 1,
                4, 3, 2, 5, 4,
                3, 2, 1, 4, 5,
                3, 4, 5, 2, 3
        };

        double promedioSatisfaccion = calcularPromedioSatisfaccion(calificaciones);

        System.out.println("El promedio de satisfacción del cliente es: " + promedioSatisfaccion);
    }

    public static double calcularPromedioSatisfaccion(int[] calificaciones) {
        int sumaCalificaciones = 0;

        for (int calificacion : calificaciones) {
            sumaCalificaciones += calificacion;
        }

        double promedio = (double) sumaCalificaciones / calificaciones.length;

        return promedio;
    }
}
import java.util.Scanner;

public class PromocionLlantas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar la cantidad de llantas
        System.out.print("Ingrese la cantidad de llantas que desea comprar: ");
        int cantidad = scanner.nextInt();

        // Determinar el precio unitario según la cantidad
        double precioUnitario;
        if (cantidad < 5) {
            precioUnitario = 100; // Precio por llanta si se compran menos de 5
        } else if (cantidad >= 5 && cantidad <= 10) {
            precioUnitario = 75; // Precio por llanta si se compran de 5 a 10
        } else {
            precioUnitario = 50; // Precio por llanta si se compran más de 10
        }

        // Calcular el costo total
        double costoTotal = cantidad * precioUnitario;

        // Mostrar los resultados
        System.out.println("\nResumen de la compra:");
        System.out.println("Cantidad de llantas: " + cantidad);
        System.out.println("Precio por llanta: U$" + precioUnitario);
        System.out.println("Costo total: U$" + costoTotal);

        scanner.close();
    }
}
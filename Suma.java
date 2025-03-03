import java.util.Scanner;
public class Suma {
    public static void main(String[] args) {5
     
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el primer número: ");
        int numero1 = scanner.nextInt();  
        System.out.print("Ingresa el segundo número: ");
        int numero2 = scanner.nextInt(); 
        int resultado = numero1 + numero2;
        System.out.println("La suma de " + numero1 + " y " + numero2 + " es: " + resultado);
        scanner.close();
    }
}
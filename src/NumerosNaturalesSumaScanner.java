
import java.util.Scanner;

public class NumerosNaturalesSumaScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Por favor, ingrese un número entero positivo: ");

            // Verifica que el input sea un número entero
            while (!scanner.hasNextInt()) {
                System.out.println("Error: Debe ingresar un número entero válido.");
                scanner.next(); // Limpia la entrada incorrecta
                System.out.print("Por favor, ingrese un número entero positivo: ");
            }

            numero = scanner.nextInt();

            if (numero < 1) {
                System.out.println("Error: El número debe ser positivo.");
            }

        } while (numero < 1);

        // Calculamos la suma con la fórmula matemática
        int suma = numero * (numero + 1) / 2;
        System.out.println("La suma de los números naturales desde 1 hasta " + numero + " es: " + suma);

        scanner.close(); // Cerramos el Scanner correctamente
    }
}
import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        while (true) {
            System.out.println("Por favor ingrese un número entero positivo mayor que cero: ");

            try {
                numero = scanner.nextInt();
                if (numero > 0) {
                    System.out.println("El número ingresado es: " + numero);
                    break;
                } else {
                    System.out.println("El numero ingresado no es un numero positivo.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Error: Ingreso de número no válido.");
                scanner.next();
            }

        }

        boolean isPrime = true;

        if (numero == 1) {
            System.out.println("El número ingresado " + numero + " no es un número primo");
            scanner.close();
            return;
        } else {
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    isPrime = false;
                    break;
                }
            }


            if (!isPrime) {
                System.out.println("El número ingresado " + numero + " no es un número primo");
            } else {
                System.out.println("El número ingresado " + numero + " es un número primo");
            }
        }
        scanner.close();
    }
}
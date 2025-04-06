import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Por favor ingrese un número entero positivo mayor que cero: ");

            try {
                int numero = scanner.nextInt();
                if (numero >0) {
                    System.out.println("El número ingresado es: " + numero);
                    break;
                } else{
                    System.out.println("El numero ingresado no es un numero positivo.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Error: Ingreso de número no válido.");
                scanner.next();
            }

        }
        scanner.close();

    }
}
import java.util.Scanner;

public class NumerosNaturales {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor ingrese un número entero para poder realizar el cálculo: ");

        int numero = scanner.nextInt();

        int suma = 0;
        for (int i = 0; i <= numero; i++) {
            suma += i;
        }

        System.out.print("La suma de los números naturales desde 0 hasta el número ingresado es: " + suma);

    scanner.close();
    }
}

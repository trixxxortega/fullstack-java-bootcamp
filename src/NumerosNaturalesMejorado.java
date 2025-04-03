import java.util.Scanner;

public class NumerosNaturalesMejorado {
    public static void main(String[] args) {
        int numero;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Por favor ingrese un número entero positivo: ");

                numero = scanner.nextInt();
                if (numero < 1) {
                    System.out.println("Por favor ingrese un número positivo");
                }
            } while (numero < 1);

            int suma = numero * (numero + 1) / 2;
            System.out.print("La suma de los numeros enteros es: " + suma);
            scanner.close();

    }
}

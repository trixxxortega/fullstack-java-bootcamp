import java.util.Scanner;

/*
Escribe un programa en Java que solicite al usuario un número entero positivo
𝑛
n y calcule su factorial.
 */
public class FactorialDeUnNumero {
    public static void main(String[] args) {

        long numero;
        long factorial = 1;
        Scanner scanner = new Scanner(System.in);


        do{
            System.out.println("Por favor ingrese un número entero positivo para calcular su factorial:  ");
            numero = scanner.nextLong();
            if (numero < 0){
                System.out.println("Error: El número ingresado es negativo! ");
            }else {
                break;
            }

        }while (numero < 0);

        for(long i = numero; i>0; i --){
             factorial *= i;
        }

        System.out.println("El factorial de " + numero + " es: " + factorial);
        scanner.close();
    }
}

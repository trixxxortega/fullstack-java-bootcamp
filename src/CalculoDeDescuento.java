
/*
Escribe un programa en Java que haga lo siguiente:

Solicite al usuario el precio original de un producto.

Solicite el porcentaje de descuento a aplicar.

Calcule el precio final con el descuento aplicado.

Muestre el resultado en consola.
 */

import java.util.Scanner;

public class CaluloDeDescuento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor ingrese el precio original del producto a calcular: ");

        var precio_original = scanner.nextDouble();

        System.out.println("Por favor ingrese el porcentaje de descuento aplicar: ");

        var porcentaje = scanner.nextDouble();

        var precio_con_descuento = precio_original * porcentaje / 100;
        var precio_final = precio_original - precio_con_descuento;

        System.out.println("El precio final del producto ingresado es: " + precio_final);

    }
}

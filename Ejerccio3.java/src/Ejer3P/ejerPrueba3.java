package Ejer3P;

import java.util.Scanner;

public class ejerPrueba3 {
    public static void main(String[] args) {
        /* Has hecho una compra y sabes el precio del producto y su iva.
          Haz un script que te calcule el precio total que vas a pagar por tu
          compra.
        Te recuerdo que para calcular el total debes sumar al precio el resultado
        de multiplicasr precio por el iva y dividir por 100.
        Precio 200€

        Iva: 21%

                El total son 242 €.  //200 + 21*200/100 */
        Scanner precio = new Scanner(System.in);
        System.out.println("Pon precio con dos decimales: ");
        double precioProducto =  precio.nextDouble();
        double precioFinal = (precioProducto *21/100) + precioProducto;
        System.out.println("El precio final es " + precioFinal);

    }
}

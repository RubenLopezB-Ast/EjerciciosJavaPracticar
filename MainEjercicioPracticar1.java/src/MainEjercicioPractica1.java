import java.util.Scanner;

public class MainEjercicioPractica1 {
    //Ejercicio1: Calcula el área de un círculo, pidiendo el radio de este.
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double A;
        double r;
        System.out.println("Cual es el radio del círculo en cm: ");
        r = sc.nextDouble(); // Se recoge el valor que nos dán.
        A = 3.1416*(r*r); // Calculo el area = Pixr2
        System.out.println("El area de tu cículo es:  "+ A + "centímetros cuadradros");

    }
}
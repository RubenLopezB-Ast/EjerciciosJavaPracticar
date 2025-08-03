import java.util.Scanner;
public class ejercicioUnoG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número del uno al diez");
        int numero = sc.nextInt();

        if (numero >= 1 && numero <= 10){
            for (int i = 1; i<= 10; i++){
                System.out.println(numero + "x"+i+"="+(numero*i));
            }
        }else{
            System.out.println("Error: el número debe estar entre 1 y 10");
        }
        sc.close();
    }
}
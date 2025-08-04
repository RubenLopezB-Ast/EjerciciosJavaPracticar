import java.util.Scanner;

public class ejerciciosDosG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int numero = sc.nextInt();

        if (numero > 0){
            System.out.println("Es positivo");
            for (int i = 1; i<= numero; i++){
                System.out.println(i);
            }
        }else if (numero <0){
            System.out.println("Es negativo");
        }else{
            System.out.println("Es cero");
        }
        sc.close();
    }
}
import java.util.Scanner;
public class ejercicioTresG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuál es tu nombre?");
        String name = sc.nextLine();

        System.out.println("¿Cuál es tu edad?");
        int age = sc.nextInt();
        if (age >= 18){
            System.out.println("Hola "+name+", tienes "+age+" años, y eres mayor de edad.");
        }else {
            System.out.println("Hola "+name+", tiens "+age+" años, y eres menor de edad.");
        }

    }
}

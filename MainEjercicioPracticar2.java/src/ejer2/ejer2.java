package ejer2;
//En el segundo ejercicio vamos a realizar un programa que te realice el promedio de las notas de un alumno, para ello el programa te va a tener que solicitar el nombre del alumno y las notas de las 3 evaluaciones.
//
//Requisitos: Las notas pueden tener decimales
import java.util.Scanner;

public class ejer2 {

 public static void main(String[] args) {

  Scanner entrada = new Scanner (System.in);

  String nombre_alumno;
  double evaluacion1;
  double evaluacion2;
  double evaluacion3;
  double evaluacion_final;

  System.out.println("Nombre alumno: ");
  nombre_alumno = entrada.nextLine();

  System.out.println("Nota primera evaluación: ");
  evaluacion1 = entrada.nextDouble();

  System.out.println("Nota segunda evaluación: ");
  evaluacion2 = entrada.nextDouble();

  System.out.println("Nota tercera evaluación: ");
  evaluacion3 = entrada.nextDouble();

  evaluacion_final = (evaluacion1 + evaluacion2 + evaluacion3)/3;

  System.out.println("La nota media de " + nombre_alumno + " es " + evaluacion_final);
 }
}
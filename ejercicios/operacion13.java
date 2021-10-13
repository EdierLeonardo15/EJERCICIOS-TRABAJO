import java.util.Scanner;
public class ejercicio {
  static Scanner sc = new Scanner(System.in);
  
  static void viajeEstudiantes(){
   
    int alumnos=0;
    double pasaje=0;
    
    
    System.out.println("Ingresar numero de estudiantes:");
    alumnos=sc.nextInt();
   
    if (alumnos>0 && alumnos<20){
      pasaje=70*alumnos;
    }
    else if (alumnos>=20 && alumnos<50){
      pasaje=40;
    }
    else if (alumnos>=50 && alumnos<=100){
      pasaje=35;
    }
    else {
      pasaje=20;
    }
   
    if (alumnos<=0) {
      System.out.println("No hay alumnos");
    }
    else {
      System.out.println("El pasaje cuesta: $"+pasaje);
    }
  }
  
  public static void main(String[] args) {
    viajeEstudiantes();
  }
}
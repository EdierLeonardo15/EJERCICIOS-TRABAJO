import java.util.Scanner;
<<<<<<< HEAD
public class ejercicio {
=======
public class Ejercicio_3_6 {
>>>>>>> 49e2217574fec7596356edefd1476c6dc97d5e26
  static Scanner sc = new Scanner(System.in);
 
  static void descuentoCosto(){
   
    int costo=0;
    double descuento=0;
  
<<<<<<< HEAD
=======
    System.out.println("***** Ejercicio 3.6 ******");
>>>>>>> 49e2217574fec7596356edefd1476c6dc97d5e26
    System.out.println("Ingrese el costo:");
    costo=sc.nextInt();
 
    if (costo>0 && costo<100) {
      descuento=costo-(costo*0.10);
    }
    else if (costo>=100 && costo<200){
      descuento=costo-(costo*0.12);
    }
    else if (costo>=200) {
      descuento=costo-(costo*0.15);
    }

    if (costo<0) {
      System.out.println("Ingrese bien los datos");
    }
    else {
    System.out.println("El descuento es: "+descuento);
    }
  }
  
  public static void main(String[] args) {
    descuentoCosto();
  }
}
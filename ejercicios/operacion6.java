import java.util.Scanner;
public class ejercicio {
  static Scanner sc = new Scanner(System.in);
 
  static void descuentoCosto(){
   
    int costo=0;
    double descuento=0;
  
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
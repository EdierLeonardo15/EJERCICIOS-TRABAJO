import java.util.Scanner;
public class Ejercicio09 {
  static Scanner sc=new Scanner(System.in);

  static void deposito() {
   
    double cantidad=0;
    int cantaños=0, contador=1;
    
    
    System.out.println("Ingrese los años que puso dinero:");
    cantaños=sc.nextInt();
    
    while (contador<=cantaños) {
      System.out.println("Indique la cantidad de dinero que ingreso el año "+contador+":");
      cantidad=sc.nextInt();
      cantidad=(cantidad*0.1)+cantidad;
      contador++;
    }
    System.out.println("Para el año "+cantaños+" ahorro: "+cantidad);
  }
  
  public static void main(String[] args) {
    deposito();
  }
}
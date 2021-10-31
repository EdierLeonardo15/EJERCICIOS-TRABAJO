import java.util.Scanner;
public class Ejercicio05 {
  static Scanner sc = new Scanner(System.in);

  static void ahorroPesos() {
    
    double ahorroDias, ahorroInicial=3;
    
    System.out.println("Ingrese:");
    
    for (int dia=1; dia<=365; dia++) {
      ahorroDias=Math.pow(ahorroInicial, dia);
      System.out.println("Lo ahorrado en el dia "+dia+" es "+ahorroDias+ " pesos");
    }
  }

  public static void main(String[] args) {
    ahorroPesos();
  }
}
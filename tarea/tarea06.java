import java.util.Scanner;
public class Ejercicio06 {
  static Scanner sc = new Scanner(System.in);

  static void salarioMenu() {
    
    int i;
    double salario_inicial, salario_recibido;
   
    System.out.println("ingrese cantidad:");
    double salarioFin=1500.00;
    
    
    for (int años=1;años<=6; años++) {
        salarioFin=(salarioFin*0.1)+salarioFin;
        System.out.println("Su salario anual "+años+ " es: "+Math.round(salarioFin));
    }
  }

  public static void main(String[] args) {
    salarioMenu();
  }
}
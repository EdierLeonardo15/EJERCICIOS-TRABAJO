import java.util.Scanner;
public class ejercicios {
  static Scanner sc = new Scanner(System.in);
  
  static void algoritmoRegalos(){

    double monto=0;
    String regalo="";

    
    System.out.println("Ingrese el monto que dispone:");
    monto=sc.nextDouble();

    if (monto>=1 && monto<=10.00) {
      regalo="\n-Targeta";
    }
    else if (monto>=11.00 && monto<=100.00) {
      regalo="\n-Chocolates\n-Targeta";
    }
    else if (monto>=101.00 && monto<=250.00) {
      regalo="\n-Flores\n-Chocolates\n-Targeta";
    }
    else if (monto>250){
      regalo="\n-Anillo\n-Flores\n-Chocolates\n-Targeta";
    }
    else {
      regalo="\nNinguno";
    }

    System.out.println("Ud. puede elegir los siguientes: "+regalo);
  }
  
  public static void main(String[] args) {
    algoritmoRegalos();
  }
}
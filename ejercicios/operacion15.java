import java.util.Scanner;
public class ejercicio {
  static Scanner sc = new Scanner(System.in);
  
  static void mostrarDiaLetras(){
    
    int dia=0;
    String nombredia="";
    
    System.out.println("Ingrese un dia de la semana entre (1-7):");
    dia=sc.nextInt();
    
    switch(dia) {
      case 1: nombredia="Domingo";break;
      case 2: nombredia="Lunes";break;
      case 3: nombredia="Martes";break;
      case 4: nombredia="Miercoles";break;
      case 5: nombredia="Jueves";break;
      case 6: nombredia="Viernes";break;
      case 7: nombredia="Sabado";break;
      default:
        nombredia="No existe";
    }
    
    System.out.println("El dia es: "+nombredia);
  }
  
  public static void main(String[] args) {
    mostrarDiaLetras();
  }
}
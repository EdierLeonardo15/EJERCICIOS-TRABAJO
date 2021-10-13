import java.util.Scanner;
public class ejercicio {
  static Scanner sc = new Scanner(System.in);
  
  static void calificacionLetra(){
    
    int puntaje=0;
    String calificacion="";
    
    System.out.println("Ingrese la calificación (0/10):");
    puntaje=sc.nextInt();
    
    switch(puntaje) {
      case 0: calificacion="F";break;
      case 1: calificacion="F";break;
      case 2: calificacion="F";break;
      case 3: calificacion="F";break;
      case 4: calificacion="F";break;
      case 5: calificacion="F";break;
      case 6: calificacion="D";break;
      case 7: calificacion="D";break;
      case 8: calificacion="C";break;
      case 9: calificacion="B";break;
      case 10: calificacion="A";break;
      default:
        calificacion="No existe";
    }
   
    System.out.println("La calificación es: "+calificacion);
  }
  
  public static void main(String[] args) {
    calificacionLetra();
  }
}
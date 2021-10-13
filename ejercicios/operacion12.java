import java.util.Scanner;
public class ejercicio {
  static Scanner sc = new Scanner(System.in);
  
  static void sueldoSemanal(){
    
    int horaTrabajo=0, pagoHora=0;
    double sueldoSemanal=0;
    
    
    System.out.println("Ingrese las horas de trabajo en la semana:");
    horaTrabajo=sc.nextInt();
    System.out.println("Ingrese el pago por hora:");
    pagoHora=sc.nextInt();
    
    if (horaTrabajo>0 && horaTrabajo<=40 && pagoHora>0){
      sueldoSemanal=(pagoHora*horaTrabajo);
    }
    else if (horaTrabajo>=41 && horaTrabajo<=45 && pagoHora>0) {
      sueldoSemanal=(pagoHora*horaTrabajo)*2;
    }
    else if (horaTrabajo>=46 && horaTrabajo<=50 && pagoHora>0) {
      sueldoSemanal=(pagoHora*horaTrabajo)*3;
    }
    
    if (horaTrabajo==50 && pagoHora>0) {
      System.out.println("Ya no puede trabajar mas");
    }
    if (horaTrabajo>50 && pagoHora>0) {
      System.out.println("No puede trabajar mas de 50 horas solo se contara las 50 horas");
      sueldoSemanal=(pagoHora*50)*3;
      System.out.println("Su sueldo semanal es de: "+sueldoSemanal);
    }
    else if (horaTrabajo<=0 && pagoHora<=0) {
      System.out.println("No cuenta con pago ni con horas!");
    }
    else if (horaTrabajo<=0) {
      System.out.println("No tiene horas de trabajo!");
    }
    else if (pagoHora<=0) {
      System.out.println("No tiene pago por hora!");
    }
    else {
      System.out.println("Su sueldo semanal es de: "+sueldoSemanal);
    }
  }
  
  public static void main(String[] args) {
    sueldoSemanal();
  }
}
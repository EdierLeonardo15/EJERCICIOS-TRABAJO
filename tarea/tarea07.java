import java.util.Scanner;
public class Ejercicio07 {
  static Scanner sc=new Scanner(System.in);

  static void hamburguesasMenu() {
   
   int opciones=1;
   String tarjeta;
   double montoT=0;
   
   System.out.print("Escoja su hamburguesa");
   String hams="\n1=Hambuguesa sencilla\n2=Hamburguesa doble\n3=Hamburguesa triple\n0=Salir";
   System.out.println(hams);
   int opciones=sc.nextInt(); 
           
   do {
     switch (opciones) {
       case 1:montoT=montoT+(20); break;
       case 2:montoT=montoT+(25); break;
       case 3:montoT=montoT+(28); break;
       default:System.out.println("Opcion no existe"); break;
   }
   if (opciones!=0){
     System.out.println("¿Desea otra haburguesa? "+hams);
     opciones=sc.nextInt();
   }
   
   }
   while (opciones!=0);
   System.out.println("¿Desea pagar con tarjeta (S/N)?");
   tarjeta=sc.next();
   if (tarjeta.equals("S")) {
     montoT=montoT+(montoT*0.05);
   }
   
   System.out.println("El costo final es: "+montoT);
  }
  
  public static void main(String[] args) {
   hamburguesasMenu();
  }
}
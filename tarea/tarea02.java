import java.util.Scanner;
public class Ejercicio02 {
  static Scanner sc = new Scanner(System.in);

  static void hamburguesas() {
    
    int cantidadHam; 
    double costoFinal=0;
    String pagoTarjeta;
    
    System.out.println("***** Pedido ******");
    //Proceso
    for(int tipoHam=1; tipoHam<=3; tipoHam++){
      if(tipoHam==1){
        System.out.println("Cantidad de Hamburguesas de Tipo Simple:"); 
        cantidadHam=sc.nextInt();
        costoFinal=costoFinal+cantidadHam*20;
      }
      else if(tipoHam==2){
        System.out.println("Cantidad de Hamburguesas de Tipo Doble:");
        cantidadHam=sc.nextInt();
        costoFinal=costoFinal+cantidadHam*25;
      }
      else{
        System.out.println("Cantidad de Hamburguesas de Tipo Triple:"); 
        cantidadHam=sc.nextInt();
        costoFinal=costoFinal+cantidadHam*28;                
      }
    }
    
    System.out.println("El costo de las Hamburguesas es: "+costoFinal);  
    System.out.println("¿Desea Pagar con Tarjeta(S/N)?");
    pagoTarjeta=sc.next();
    if(pagoTarjeta.equals("S")){
      costoFinal=costoFinal+costoFinal*0.05; 
    }
    System.out.println("El costo total de la Hamburguesa es:"+costoFinal);
  }

  public static void main(String[] args) {
    hamburguesas();
  }
}
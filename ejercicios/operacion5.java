import java.util.Scanner;
public class ejercicio {
  static Scanner sc = new Scanner(System.in);
  
  static void personaMenor(){
  
    String nomA, nomB, nomC, nomM="";
    int edadA, edadB, edadC, edadM=0;

    System.out.println("***** Ejercicio 3.5 ******");
    System.out.println("Ingrese nombre 1ra Persona:");
    nomA=sc.next();
    System.out.println("Ingrese edad 1ra Persona:");
    edadA=sc.nextInt();  
    System.out.println("Ingrese nombre 2da Persona:");
    nomB=sc.next();
    System.out.println("Ingrese edad 2da Persona:");
    edadB=sc.nextInt();  
    System.out.println("Ingrese nombre 3ra Persona:");
    nomC=sc.next();
    System.out.println("Ingrese edad 3ra Persona:");
    edadC=sc.nextInt();      

    if(edadA<edadB && edadA<edadC){
      edadM=edadA;
      nomM=nomA;
    }
    if(edadB<edadA && edadB<edadC){
      edadM=edadB;
      nomM=nomB;
    }
    if(edadC<edadA && edadC<edadB){
      edadM=edadC;
      nomM=nomC;
    }    

    System.out.println("La persona menor es: "+ nomM +" y su edad es:"+edadM);
  }
  
  public static void main(String[] args) {
    personaMenor();
  }
}
import java.util.Scanner;
public class ejercicios{
public static void main(String[] args) {
        int edad;
        Scanner entrada= new Scanner(System.in);
        
        System.out.println("Ingrese edad:");
        edad=entrada.nextInt();
        
        if(edad<=17){
         System.out.println("Ud no puede votar en las proximas elecciones");  
        }else{
            System.out.println("Ud si puede votar en las proximas elecciones"); 
        }
    }
    

    }
import java.util.Scanner;
public class ejercicio {
  static Scanner sc = new Scanner(System.in);
  
  static void bonoTrabajador(){
    
    int anhoAnt=0;
    double sueldo, bonoAnt=0, bonoSueld=0, bonoReal=0;
    
    System.out.println("Ingrese años de antiguedad:");
    anhoAnt=sc.nextInt();
    System.out.println("Ingrese el sueldo del trabajador:");
    sueldo=sc.nextDouble();
    
    if(anhoAnt>2 && anhoAnt<5){
      bonoAnt=sueldo*0.20;
    }else if (anhoAnt>=5){
      bonoAnt=sueldo*0.30;
    }
    if(sueldo<1000){
      bonoSueld=sueldo*0.25;
    }else if(sueldo>=1000 && sueldo<=3500){
    bonoSueld=sueldo*0.15;
    }else{
    bonoSueld=sueldo*0.10;
    }
    if(bonoAnt>=bonoSueld){
      bonoReal=bonoAnt;
    }else{
      bonoReal=bonoSueld;
    }
    
    System.out.println("El trabajador tendra un bono de:"+bonoReal+ "\nSin embargo su bono por antiguedad es:  "+bonoAnt+" y el bono por sueldo es:"+bonoSueld);
  }
  
  public static void main(String[] args) {
    bonoTrabajador();
  }
}

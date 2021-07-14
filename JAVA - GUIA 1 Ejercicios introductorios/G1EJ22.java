package Guia1;
/*
22.Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y
los muestre por pantalla en orden descendente.
*/
import java.util.Scanner;

public class G1EJ22 {

    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in).useDelimiter("\n");
      
      int [] vector = new int [100];
      
      for (int i=100; i>=1; i--){
          System.out.println(i);
      }
              
     }
    
}
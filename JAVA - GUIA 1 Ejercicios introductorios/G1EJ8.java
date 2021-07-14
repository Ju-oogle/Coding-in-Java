package Guia1;
/*
8. Crear un programa que dado un numero determine si es par o impar.
*/
import java.util.Scanner;

public class G1EJ8 {

    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in).useDelimiter("\n");
      int num;
        System.out.println("Ingrese el numero a evaluar: ");
        num = leer.nextInt();
 
        if (num % 2 == 0) {
            System.out.println("El número " + num + " es par.");  
            
        } else {
            System.out.println("El número " + num + " es impar.");  
        }
        
    }
    
}

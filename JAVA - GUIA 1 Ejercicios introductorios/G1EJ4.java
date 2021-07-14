package Guia1;
/*
4. Escribir un programa que pida una frase y la muestre toda en mayúsculas y
después toda en minúsculas. Nota: investigar la función toUpperCase() y
toLowerCase() en Java.
*/
import java.util.Scanner;

public class G1EJ4 {

    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in).useDelimiter("\n");
      String cadena;
      
      System.out.println("Ingrese la frase que quiere editar: ");
      cadena = leer.next();
      
      System.out.println("La frase en mayusculas es: " + cadena.toUpperCase());
      System.out.println("La frase en minusculas es: " + cadena.toLowerCase());
    }
    
}

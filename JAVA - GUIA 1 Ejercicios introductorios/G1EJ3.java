package Guia1;
/*
3. Escribir un programa que pida tu nombre, lo guarde en una variable y lo 
muestre por pantalla.
*/
import java.util.Scanner;

public class G1EJ3 {

    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in).useDelimiter("\n");
      String nombre;
      
        System.out.println("Ingresa tu nombre completo: ");
        nombre = leer.next();
        System.out.println("Bienvenida: " + nombre);
    }
    
}

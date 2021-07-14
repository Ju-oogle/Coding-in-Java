package Guia1;
/*
6. Escribir un programa que lea un número entero por teclado y muestre por pantalla
el doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función
Math.sqrt().
*/
import java.util.Scanner;

public class G1EJ6 {

    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in).useDelimiter("\n");
      int num, doble, triple;
      float raiz;
      
     System.out.println("Ingresa el numero para efectuar las operaciones: ");
     num = leer.nextInt();
     
     doble = (num * 2);
     triple = (num * 3);
     raiz = (float) Math.sqrt(num);
     
    System.out.println("El doble de " + num + " es: " + doble);
    System.out.println("El triple de " + num + " es: " + triple);
    System.out.println("La raíz cuadrada de " + num + " es: " + raiz);
    }
    
}

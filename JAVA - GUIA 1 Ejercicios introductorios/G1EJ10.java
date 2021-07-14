package Guia1;
/*
10. Realizar un programa que solo permita introducir solo frases o palabras de 8 de
largo. Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir
un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se deberá
imprimir “INCORRECTO”. Nota: investigar la función Lenght() en Java.
*/
import java.util.Scanner;

public class G1EJ10 {

    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in).useDelimiter("\n");
       String palabra;
       int size;

        System.out.println("Ingrese una palabra o frase de largo 8: ");
        palabra = leer.next();
        size = palabra.length();
        
        if (size == 8) {
            System.out.println("Correcto!.");
        } else {
            System.out.println("Incorrecto.");
        }
    }
    
}

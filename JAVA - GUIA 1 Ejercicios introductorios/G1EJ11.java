package Guia1;
/*
11. Escriba un programa que pida una frase o palabra y valide si la primera letra de esa
frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por
pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir
“INCORRECTO”. Nota: investigar la función Substring y equals() de Java.
1
*/
import java.util.Scanner;

public class G1EJ11 {

     public static void main(String[] args) {
      Scanner leer = new Scanner(System.in).useDelimiter("\n");
       String palabra, letra;

        System.out.println("Ingrese una palabra o frase: ");
        palabra = leer.next();
        letra = palabra.substring(0, 1);
        System.out.println("La primera letra de " + palabra + " es: " + letra);
        
        if (letra.equals("A")) {
            System.out.println("Correcto!.");
        } else {
            System.out.println("Incorrecto.");
        }
  }  
}
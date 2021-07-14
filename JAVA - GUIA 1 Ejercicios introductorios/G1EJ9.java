package Guia1;

/*
9. Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota:
investigar la función equals() en Java.
 */
import java.util.Scanner;

public class G1EJ9 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String palabra, adivina, minuscula;

        palabra = "eureka";
        System.out.println("Adivine la palabra: ");
        adivina = leer.next();
        minuscula = adivina.toLowerCase();
        if (palabra.equals(minuscula)) {
            System.out.println("Has acertado!.");
        } else {
            System.out.println("Incorrecto.");
        }

    }

}

package Guia1;

/*
3. Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una
vocal. Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la
clase String.
 */
import java.util.Scanner;

public class G1ME3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese una letra");
        Character letra = leer.next().toLowerCase().charAt(0);
        if (letra.equals('a') || letra.equals('e') || letra.equals('i') || letra.equals('o') || letra.equals('u')) {
            System.out.println(letra + "Es una vocal");
        } else {
            System.out.println(letra + "No es una vocal");
        }
        leer.close();

    }

}

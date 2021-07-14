package Guia1;

/*
13. Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10
la nota se pedirá de nuevo hasta que la nota sea correcta.
 */
import java.util.Scanner;

public class G1EJ13 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int num;

        do {
            System.out.println("Ingrese el numero a evaluar: ");
            num = leer.nextInt();
            if (num > 0 & num <= 10) {
                System.out.println("El número " + num + " esta en el intervalo especificado.");
            } else {
                System.out.println("Incorrecto");
            }
        } while (num > 0 || num <= 10);

    }
}

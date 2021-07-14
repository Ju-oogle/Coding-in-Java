package Guia1;

/*
15. Diseñe una función que pida el nombre y la edad de N personas e imprima los
datos de las personas ingresadas por teclado e indique si son mayores o menores
de edad. Después de cada persona, el programa debe preguntarle al usuario si
quiere seguir mostrando personas y frenar cuando el usuario ingrese la palabra
“No”.
 */
import java.util.Scanner;

public class G1ME15 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String rta, nombre;
        int edad, out = 1;

        while (out != 0) {
            System.out.println("Ingrese el nombre: ");
            nombre = leer.next();

            System.out.println("Ingrese la edad: ");
            edad = leer.nextInt();

            if (edad >= 18) {
                System.out.println("Ud. es mayor de edad");
            } else {
                System.out.println("No es mayor de edad");
            }

            System.out.println("Para continuar presione 'SI', para salir escriba 'N0' ");
            rta = leer.next().toUpperCase();

            if (rta.equals("SI")) {
                System.out.println("Continuamos!");
            } else {
                System.out.println("Hemos finalizado");
                out = 0;

            }
        }

    }

}

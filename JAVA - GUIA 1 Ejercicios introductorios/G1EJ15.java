package Guia1;

/*
15. Realizar un programa que pida dos números enteros positivos por teclado y
muestre por pantalla el siguiente menú:
MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:
El usuario deberá elegir una opción y el programa deberá mostrar el resultado por
pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir
del programa directamente, se debe mostrar el siguiente mensaje de confirmación:
¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona el
carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.
30
 */
import java.util.Scanner;

public class G1EJ15 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int num1, num2, rta, suma, resta, multip, division;
        String out;
        boolean validacion;

        System.out.println("Ingrese dos numeros enteros para comparar: ");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        validacion = true;

        while (validacion == true) {
            System.out.println("MENU\n"
                    + "1. Sumar\n"
                    + "2. Restar\n"
                    + "3. Multiplicar\n"
                    + "4. Dividir\n"
                    + "5. Salir\n"
                    + "Elija opción:");
            rta = leer.nextInt();
            switch (rta) {
                case 1:
                    suma = num1 + num2;
                    System.out.println("La suma es " + suma);
                    continue;
                case 2:
                    resta = num1 - num2;
                    System.out.println("La resta es " + resta);
                    continue;
                case 3:
                    multip = num1 * num2;
                    System.out.println("La multip es " + multip);
                    continue;
                case 4:
                    division = num1 / num2;
                    System.out.println("La division es " + division);
                    continue;
                case 5:
                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                    out = leer.next();
                    out = out.toUpperCase();
                    if (out.equals("S")) {
                        validacion = false;
                        System.out.println("Hasta la próxima");
                    } 
                    break;
                default:
                    System.out.println("Ha ingresado una opción no valida");
            }
        }
    }
}

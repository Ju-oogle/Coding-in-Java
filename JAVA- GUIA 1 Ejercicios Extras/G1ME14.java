package Guia1;

/*
14. Crea una aplicación que le pida dos números al usuario y este pueda elegir entre
sumar, restar, multiplicar y dividir. La aplicación debe tener una función para cada
operación matemática y deben devolver sus resultados para imprimirlos en el main.
 */
import java.util.Scanner;

public class G1ME14 {

    public static double sumar(double a, double b) {
        return a + b;
    }

    public static double restar(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        if (b == 0) {
            return 0;
        } else {
            return a / b;
        }
    }

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        double numero1, numero2;
        int operacion;
        System.out.println("Ingrese el primer numero");
        numero1 = leer.nextDouble();
        System.out.println("Ingrese el segundo numero");
        numero2 = leer.nextDouble();
        System.out.println("Ingrese la operacion que desea realizar: "
                + "1. Suma "
                + "2. Resta "
                + "3. Multiplicacion "
                + "4. Division");
        operacion = leer.nextInt();

        switch (operacion) {
            case 1:
                System.out.println("La suma de los numeros es de " + sumar(numero1, numero2));
                break;
            case 2:
                System.out.println("La resta de los numeros es de " + restar(numero1, numero2));
                break;
            case 3:
                System.out.println("La multiplicacion de los numeros es de " + multiplicar(numero1, numero2));
                break;
            case 4:
                System.out.println("La division de los numeros es de " + dividir(numero1, numero2));
                break;
            default:
                System.out.println("Ha ingresado una opcion invalida");
        }
        leer.close();
    }

}

package Guia1;

/*
7. Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el
promedio de n números (n>0). El valor de n se solicitará al principio del programa y
los números serán introducidos por el usuario. Realice dos versiones del programa,
una usando el bucle “while” y otra con el bucle “do - while”.
 */
import java.util.Scanner;

public class G1ME7 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese el tamaño de la muestra: ");
        int n = leer.nextInt();
        
        int contador = 0, numero, maximo = 0, minimo = 0, positivos = 0, suma = 0;
        
        // Version While
        while (contador < n) {
            System.out.println("Ingrese un numero");
            numero = leer.nextInt();
            
            if (maximo == 0 && minimo == 0) {
                maximo = numero;
                minimo = numero;
            }
            if (numero > maximo) {
                maximo = numero;
            }
            if (numero < minimo) {
                minimo = numero;
            }
            if (numero > 0) {
                suma += numero;
                positivos += 1;
            }
            contador += 1;
        }
        System.out.println("El numero maximo fue: " + maximo);
        System.out.println("El numero minimo fue: " + minimo);
        System.out.println("El promedio fue: " + suma / positivos);
        
        // Version Do - While
        maximo = 0;
        minimo = 0;
        suma = 0;
        positivos = 0;
        contador = 0;
        do {
            System.out.println("Ingrese un numero");
            numero = leer.nextInt();
            if (maximo == 0 && minimo == 0) {
                maximo = numero;
                minimo = numero;
            }
            if (numero > maximo) {
                maximo = numero;
            }
            if (numero < minimo) {
                minimo = numero;
            }
            if (numero > 0) {
                suma += numero;
                positivos += 1;
            }
            contador += 1;

        } while (contador < n);
        System.out.println("El numero maximo fue: " + maximo);
        System.out.println("El numero minimo fue: " + minimo);
        System.out.println("El promedio fue: " + suma / positivos);
        
        leer.close();
    }
}

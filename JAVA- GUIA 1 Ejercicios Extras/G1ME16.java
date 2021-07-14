package Guia1;

/*
16. Crea una aplicación que nos pida un número por teclado y con una función se lo
pasamos por parámetro para que nos indique si es o no un número primo, debe
devolver true si es primo, sino false.
Un número primo es aquel solo puede dividirse entre 1 y si mismo. Por ejemplo: 25
no es primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo.
¿Qué son los números primos?

 */
import java.util.Scanner;

public class G1ME16 {

    public static boolean primoONo(int num) {
        boolean valor = true;
        int contador = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                contador += 1;
            }
            valor = contador == 2;
        }
        System.out.println("contador = " + contador);    
        return valor;
    }
    

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int num;

        System.out.println("Ingresa el numero a verificar: ");
        num = leer.nextInt();

        System.out.println("El numero ingresado es primo?: " + primoONo(num));

    }
}


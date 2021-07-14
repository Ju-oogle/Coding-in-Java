package Guia1;
/*
23. Realizar un programa que complete un vector con los N primeros números de la
sucesión de Fibonacci. Recordar que la sucesión de Fibonacci es la sucesión de
los siguientes números:
1, 1, 2, 3, 5, 8, 13, 21, 34, ...
Donde cada uno de los números se calcula sumando los dos anteriores a él. Por
ejemplo:
La sucesión del número 2 se calcula sumando (1+1)
Análogamente, la sucesión del número 3 es (1+2),
Y la del 5 es (2+3),
Y así sucesivamente…
La sucesión de Fibonacci se puede formalizar de acuerdo a la siguiente fórmula:
Fibonaccin = Fibonaccin-1 + Fibonaccin-2 para todo n>1
Fibonaccin = 1 para todo n<=1
Por lo tanto, si queremos calcular el término “n” debemos escribir una función que
reciba como parámetro el valor de “n” y que calcule la serie hasta llegar a ese valor.
Para conocer más acerca de la serie de Fibonacci consultar el siguiente link:
https://quantdare.com/numeros-de-fibonacci/
*/
import java.util.Scanner;

public class G1ME23 {

    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in).useDelimiter("\n");
      
      int n, m, numero, fibonacci;
        String fibo = "";
        // n - 1 = n
        // n - 2 = m
        Scanner scan = new Scanner(System.in);
        n = 1;
        m = 1;
        System.out.println("Ingrese hasta donde quiere imprimir");
        numero = scan.nextInt();
        for (int i = 0; i < numero; i++) {
            if (i == 0) {
                n = 1;
                m = 0;
                fibonacci = n + m;
                m = n;
                n = fibonacci;
            } else {
                fibonacci = n + m;
                m = n;
                n = fibonacci;
            }
            if (i < (numero - 1)) {
                fibo += Integer.toString(fibonacci) + " + ";
            } else {
                fibo += Integer.toString(fibonacci);
            }
        }
        System.out.println("Fibonacci:");
        System.out.println(fibo);
        scan.close();
    }
}

  

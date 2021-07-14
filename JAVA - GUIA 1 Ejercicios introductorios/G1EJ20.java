package Guia1;

/*
Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el
número ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
5 *****
3 ***
11 ***********
2 **
 */
import java.util.Scanner;

public class G1EJ20 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int contador, num;

        contador = 0;

        while (contador < 4) {
            System.out.println("");
            System.out.println("Ingrese 1 numero: ");
            num = leer.nextInt();
            
            if (num >= 1 && num <= 20) {
                contador += 1; 
                for (int i = 0; i < num; i++) {
                    System.out.println(num);
                    System.out.print("*");}
            } else {
                System.out.print("El numero ingresado en invalido");} 
        }
        System.out.println(); 
    }
}

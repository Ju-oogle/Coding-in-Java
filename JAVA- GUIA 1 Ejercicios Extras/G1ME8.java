package Guia1;

/*
8. Escriba un programa que lea números enteros. Si el número es múltiplo de cinco
debe detener la lectura y mostrar la cantidad de números leídos, la cantidad de
números pares y la cantidad de números impares. Al igual que en el ejercicio
anterior los números negativos no deben sumarse. Nota: recordar el uso de la
sentencia break.
 */
import java.util.Scanner;

public class G1ME8 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        int numero, par = 0, impar = 0, numeros = 0;

        do {
            System.out.println("Ingresa un num, para finalizar ingresa 00: ");
            numero = leer.nextInt();

            if (numero % 5 == 0) {
                break;
            }
            if (numero > 0) {
                numeros += 1;
                if (numero % 2 == 0) {
                    par += 1;
                } else {
                    impar += 1;
                }
            }

        } while (numero != 00 && numero % 5 != 0);
        System.out.println("La cantidad de numeros leidos es de " + numeros);
        System.out.println("La cantidad de numeros pares es de " + par);
        System.out.println("La cantidad de numeros impares es de " + impar);
        leer.close();
    }
    
}

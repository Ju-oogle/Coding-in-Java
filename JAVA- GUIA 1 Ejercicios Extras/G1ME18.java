package Guia1;

/*
18. Escriba un programa que averigüe si dos vectores de N enteros son iguales (la
comparación deberá detenerse en cuanto se detecte alguna diferencia entre los
elementos).
 */
import java.util.Scanner;

public class G1ME18 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        int[] vectorA = {1, 2, 3, 7, 6};
        int[] vectorB = {1, 2, 3, 4, 5};
        int contador = 0;

        for (int i = 0; i < 5; i++) {
            if (vectorA[i] != vectorB[i]) {
                System.out.println("[" + vectorA[i] + "]" + " != " + "[" + vectorB[i] + "]");
                System.out.println("Los vectores no son iguales");
                break;
            } else {
                System.out.println("[" + vectorA[i] + "]" + " = " + "[" + vectorB[i] + "]");
                contador += 1;
            }
        }
        if (contador == 5) {
            System.out.println("Los vectores son iguales");
        }
    }

}

package Guia1;

/*
Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y
muestre traspuesta.
 */
import java.util.Scanner;

public class G1EJ25 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        int n = 4, diag, transp;

        int[][] matriz = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
            }
            System.out.println();
        }

        int aux = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                aux = matriz[i][j];
                matriz[i][j] = matriz[j][i];
                matriz[j][i] = aux;
            }
        }

        System.out.println("La matriz transpuesta es:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("[" + matriz[i][j] + "]" + "");
            }
        System.out.println();
        }
        
        System.out.println("La matriz original es:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("[" + matriz[j][i] + "]" + "");
            }
        System.out.println();
        }

    }
}

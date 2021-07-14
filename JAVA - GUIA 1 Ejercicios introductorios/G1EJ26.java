package Guia1;

/*
Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice
que una matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero
cambiada de signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de
una matriz A se denota por AT y se obtiene cambiando sus filas por columnas (o
viceversa).
 */
import java.util.Scanner;
import static java.lang.Math.pow;

public class G1EJ26 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        //        int[] numeros = {0, -2, 4, 2, 0, 2, -4, -2, 0};
        System.out.println("Ingrese el orden de la matriz");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[][] matriz = new int[n][n];
        int[][] matrizT = new int[n][n];
        int contador = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Ingrese la posicion: " + contador);
                matriz[i][j] = scan.nextInt();
                contador += 1;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrizT[i][j] = matriz[j][i];
            }
        }
        contador = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matriz[i][j] == -matrizT[i][j]) {
                    contador += 1;
                }

            }
        }

        System.out.println("La matriz:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("La matriz traspuesta:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrizT[i][j] + " ");
            }
            System.out.println("");
        }
        if (contador == pow(n, 2)) {
            System.out.println("Son matrices antisimetricas");
        } else {
            System.out.println("No son matrices antisimetricas");
        }
    }
}

package Guia1;

/*
21. Realizar un programa que rellene una matriz de tamaño NxM con valores aleatorios
y muestre la suma de sus elementos.
 */
import java.util.Scanner;

public class G1ME21 {

    public static void rellenar(int n, int m, int[][] matriz) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
            }
        }
    }

    public static double sumar(int[][] matriz, int n, int m) {
        double suma = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                suma += matriz[i][j];
                System.out.println(suma);
            }
        }
        return suma;
    }

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int n, m;
        double suma;
        System.out.println("Ingrese el tamaño de N: ");
        n = leer.nextInt();
        System.out.println("Ingrese el tamaño de M: ");
        m = leer.nextInt();
        int[][] matriz = new int[n][m];
        rellenar(n, m, matriz);
        suma = sumar(matriz, n, m);
        System.out.println("La suma de sus elementos es " + suma);
    }
}

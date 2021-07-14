package Guia1;

/*
21. Crea una aplicación que a través de una función nos convierta una cantidad de
euros introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o
libras. La función tendrá como parámetros, la cantidad de euros y la moneda a
converir que será una cadena, este no devolverá ningún valor y mostrará un
mensaje indicando el cambio (void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
 */

public class G1EJ21 {

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

    public static void G1EJ21() {
        int n, m;
        double suma;
        n = 3;
        m = 4;
        int[][] matriz = new int[n][m];
        rellenar(n, m, matriz);
        suma = sumar(matriz, n, m);
        System.out.println("La suma de sus elementos es " + suma);
    }

}
package Guia1;

/*
23.Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le
pida al usuario un numero a buscar en el vector. El programa mostrará donde se
encuentra el numero y si se encuentra repetido
 */
import java.util.Scanner;

public class G1EJ23 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int n, find, count_finds = 0;
        
        System.out.println("Ingrese el tamaño del vector: ");
        n = leer.nextInt();

        int[] vector = new int[n];

        for (int i = 0; i < n; i++) {
            vector[i] = (int)(Math.random() * 10);
        }
        System.out.println("Ingrese el numero que quiere buscar: ");
        find = leer.nextInt();

        for (int i = 0; i < n; i++) {
            if (vector[i] == find) {
                count_finds++;
            }
        }

        if (count_finds == 0) {
            System.out.println("El numero buscado: " + find + " no se ha encontrado");
        } else {
            System.out.println("El numero buscado: " + find + " ha sido encontrado,"
                    + count_finds + "veces");
        }
        for (int i = 0; i < n; i++) {
            System.out.print("[" + vector[i] + "]" + "");
        }
        for (int i = 0; i < n; i++) {
            vector[i] = (int)(Math.random() * 10);
        }
        System.out.println("Ingrese el numero que quiere buscar: ");
        find = leer.nextInt();

        for (int i = 0; i < n; i++) {
            if (vector[i] == find) {
                count_finds++;
            }
        }

        if (count_finds == 0) {
            System.out.println("El numero buscado: " + find + " no se ha encontrado");
        } else {
            System.out.println("El numero buscado: " + find + " ha sido encontrado,"
                    + count_finds + "veces");
        }
        for (int i = 0; i < n; i++) {
            System.out.print("[" + vector[i] + "]" + "");
        }
        for (int i = 0; i < n; i++) {
            vector[i] = (int)(Math.random() * 10);
        }
        System.out.println("Ingrese el numero que quiere buscar: ");
        find = leer.nextInt();

        for (int i = 0; i < n; i++) {
            if (vector[i] == find) {
                count_finds++;
            }
        }

        if (count_finds == 0) {
            System.out.println("El numero buscado: " + find + " no se ha encontrado");
        } else {
            System.out.println("El numero buscado: " + find + " ha sido encontrado,"
                    + count_finds + "veces");
        }
        for (int i = 0; i < n; i++) {
            System.out.print("[" + vector[i] + "]" + "");
        }
    }

}

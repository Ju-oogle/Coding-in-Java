package Guia1;

/*
19. Crear una función rellene un vector con números aleatorios, pasándole un arreglo
por parámetro. Después haremos otra función o procedimiento que imprima el
vector.
 */
import java.util.Scanner;

public class G1ME19 {

    public static void rellenarAleatorio(int[] vector) {
        for (int i = 0; i < 9; i++) {
            vector[i] = (int) (Math.random() * 10);
        }
    }

    public static void rellenar(int[] vectorARellenar, int[] valores) {
        for (int i = 0; i < 9; i++) {
            vectorARellenar[i] = valores[i];
        }
    }

    public static void imprimir(int[] vector) {
        for (int i = 0; i < 9; i++) {
            if (i < (int) (9 - 1)) {
                System.out.print("[" + vector[i] + "]" + " ");
            } else {
                System.out.print("[" + vector[i] + "]" + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int[] vectorParametro = new int[9];
        int[] vector = new int[9];
        rellenarAleatorio(vectorParametro);
        rellenar(vector, vectorParametro);
        imprimir(vector);

    }

}

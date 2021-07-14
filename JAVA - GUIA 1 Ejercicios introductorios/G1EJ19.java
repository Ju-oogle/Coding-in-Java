package Guia1;

/*

 */
import java.util.Scanner;

public class G1EJ19 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int n;
        
        System.out.println("Ingrese el tamaño del cuadrado");
        n = leer.nextInt();
        
        //linea inicial
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println("");

        //central
        for (int i = 0; i < n-2; i++) {
            System.out.print("*");
            for (int j = 0; j < n-2; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
            }
        //linea final
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        }
    }

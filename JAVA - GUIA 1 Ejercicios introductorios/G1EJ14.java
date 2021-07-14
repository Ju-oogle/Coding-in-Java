package Guia1;

/*
14. Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
solicite números al usuario hasta que la suma de los números introducidos supere
el límite inicial.

 */
import java.util.Scanner;

public class G1EJ14 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int num, suma = 0, limit;

        System.out.println("Ingrese el límite: ");
        limit = leer.nextInt();

        while (limit >= suma) {
            System.out.println("Ingrese el numero a evaluar: ");
            num = leer.nextInt();
            suma += num;
            System.out.println("suma parcial:" + suma);
        }
        
        System.out.println("suma total:" + suma);
    }

}

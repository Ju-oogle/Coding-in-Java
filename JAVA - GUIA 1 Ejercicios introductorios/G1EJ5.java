package Guia1;
/*
5. Dada una cantidad de grados centígrados se debe mostrar su equivalente en
grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
*/
import java.util.Scanner;

public class G1EJ5 {

    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in).useDelimiter("\n");
        float grados_c, grados_f;
        
        System.out.println("Ingrese la cant de grados C que quiere convertir: ");
        grados_c = leer.nextFloat();
        grados_f = 32 + (9 * grados_c / 5);
        System.out.println("La conversion de grados: " + grados_c + " C equivale a: " + grados_f + " F.");
    }
    
}

package Guia1;
/*
25.Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito,
cuántos de 2 dígitos, etcétera (hasta 5 dígitos)
*/
import java.util.Scanner;

public class G1EJ24 {

    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in).useDelimiter("\n");
      
      int n, digitos1=0, digitos2=0, digitos3=0, digitos4=0, digitos5=0;
        
        System.out.println("Ingrese el tamaño del vector: ");
        n = leer.nextInt();

        int[] vector = new int[n];

        for (int i = 0; i < n; i++) {
            vector[i] = (int)(Math.random() * 99999);
        }

        /*
        for (int i = 0; i < n; i++) {
            if (vector[i] == find) {
                digitos1++;
            } else if () {
                digitos2++;
            } else if () {
                digitos3++;
            } else if () {
                digitos4++;
            }
             else{
            digitos5++;}
            
        }
*/
    }
    
}

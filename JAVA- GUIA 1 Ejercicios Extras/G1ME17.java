package Guia1;
/*
17. Realizar un algoritmo que calcule la suma de todos los elementos de un vector de
tamaño N, con los valores ingresados por el usuario.
*/
import java.util.Scanner;

public class G1ME17{

    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in).useDelimiter("\n");
      
      int suma = 0, n, valores;
      
      System.out.println("Ingresa el tamaño del vector:");
      n = leer.nextInt();
      
      int [] vector = new int[n];
      
      for (int i = 0; i < n; i++) {
          System.out.println("Ingresar los valores: ");
          valores = leer.nextInt();
          vector[i] = valores;
          suma += valores;
      }
      
        System.out.print("La sumatoria de: ");
        for (int i = 0; i < n; i++) {
            System.out.print("[" + vector[i] +"]" + "");
        }
      System.out.print(" es = " + suma);
        System.out.println("");
    }
    
}

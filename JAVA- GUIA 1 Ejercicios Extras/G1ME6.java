package Guia1;
/*
Leer la altura de N personas y determinar el promedio de estaturas que se
encuentran por debajo de 1.60 mts. y el promedio de estaturas en general.
*/
import java.util.Scanner;

public class G1ME6 {

    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in).useDelimiter("\n");
      
        double valores, suma = 0, promedio;
        int n, contador = 0;
        
        System.out.println("Ingrese el tamaño de la muestra: ");
        n = leer.nextInt();
        
        double[] alturas = new double[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("Ingresar la altura de la persona");
            valores = leer.nextDouble();
            alturas[i]= valores;
            
            if (alturas[i] < 1.6) {
                contador += 1;
                suma += alturas[i];
            }
        }
        
        for (int i = 0; i < 10; i++) {
            System.out.println("["+ alturas[i]+ "]" + "");
        }
        promedio = suma / contador;
        System.out.println("El promedio de alturas menores a 1.59 es de " + promedio);
    }
    
}

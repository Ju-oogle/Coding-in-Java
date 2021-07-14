package Guia1;
/*
12. Crear un programa que dibuje una escalera de números, donde cada línea de
números comience en uno y termine en el número de la línea. Solicitar la altura de
la escalera al usuario al comenzar. Ejemplo: si se ingresa el número 3:
1
12
123
*/
import java.util.Scanner;

public class G1ME12 {

    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in).useDelimiter("\n");
      
      int escalones;
        System.out.println("Ingrese el numero de pisos de la escalera");
        escalones = leer.nextInt();
        for (int i = 0; i < escalones; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j + 1 + " ");
            }
            System.out.println("");
        }
        leer.close();
      
    }
    
}

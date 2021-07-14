package Guia1;
/*

*/
import java.util.Scanner;

public class G1ME10 {

    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in).useDelimiter("\n");
      int numeroAleatorio, numeroAdivinado;
        do {
            numeroAleatorio = (int) Math.floor(Math.random() * 10) * (int) Math.floor(Math.random() * 10);
            System.out.println("Adivina el numero generado");
            numeroAdivinado = leer.nextInt();
            if (numeroAdivinado == numeroAleatorio) {
                System.out.println("Adivinaste el número!");
                break;
            } else {
                System.out.println("No adivinaste! vuelve a intentarlo: ");
            }
        } while (numeroAleatorio != numeroAdivinado);
        leer.close();
    }
    
}

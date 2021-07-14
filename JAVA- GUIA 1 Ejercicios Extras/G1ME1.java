package Guia1;
/*
1. Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si
el usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2
horas.
*/
import java.util.Scanner;

public class G1ME1 {

    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in).useDelimiter("\n");
      int cant_dias = 0;
      System.out.println("Ingrese el tiempo en minutos");
        int minutos = leer.nextInt();
        int horas = (int) Math.ceil(minutos / 60);
        int dias = horas / 24;
        if (horas >= 24) {
            horas -= 24;
            cant_dias += 1;
        }
        System.out.println("El tiempo ingresado de " + minutos + " minutos en "
                + "dias y horas es: " + dias + " dias y " + horas + " horas.");
        leer.close();
    }
    
}

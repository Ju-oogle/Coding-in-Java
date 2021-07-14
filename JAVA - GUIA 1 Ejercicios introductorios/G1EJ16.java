package Guia1;

/*
16. Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe
salir del bucle y mostrar el mensaje "Se capturó el numero cero". El programa
deberá calcular y mostrar el resultado de la suma de los números leídos, pero si el
número es negativo no debe sumarse. Nota: recordar el uso de la sentencia break.
 */
import java.util.Scanner;

public class G1EJ16 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int num, suma = 0, limit = 20, contador;
      
        contador = 0;
        
        while (contador < limit) {
            contador += 1;
            System.out.println("Ingrese el numero a evaluar: ");
            num = leer.nextInt();
            
            if (num > 0) {
                System.out.println("Sumandolo!");
                suma += num;
            } else if (num < 0) {
                
            } else {
                System.out.println("Se capturó el numero cero");
            }
            
            System.out.println("suma parcial:" + suma);
        }

        System.out.println("suma total:" + suma);
    }

}

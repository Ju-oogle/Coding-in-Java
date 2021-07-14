package Guia1;

/*
7. Implementar un programa que dado dos números enteros determine cuál es el
mayor y lo muestre por pantalla.

 */
import java.util.Scanner;
public class G1EJ7 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int num1, num2, mayor;
        System.out.println("Ingrese dos numeros enteros para comparar: ");
        num1 = leer.nextInt();
        num2 = leer.nextInt();

        if (num1 > num2) {
            mayor = num1;
        } else {
            mayor = num2;
        }
        System.out.println("De los numeros " + num1 + " y " + num2 + " el mayor es " + mayor);  
    }
}    
    

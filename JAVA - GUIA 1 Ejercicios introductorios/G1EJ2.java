package Guia1;

import java.util.Scanner;
/*
2. Escribir un programa que pida dos números enteros por teclado y calcule la suma
de los dos. El programa deberá después mostrar el resultado de la suma
*/

public class G1EJ2 {

    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in).useDelimiter("\n");
      int num1, num2, suma;
          
      System.out.println("Ingrese dos numeros enteros: ");
      num1 = leer.nextInt();
      num2 = leer.nextInt();
      suma = num1 + num2;
      System.out.println("El resultado de la suma de los numeros ingresados es:" + suma);
    }
    
}

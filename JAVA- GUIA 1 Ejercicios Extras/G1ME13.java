package Guia1;
/*
13. Se dispone de un conjunto de N familias, cada una de las cuales tiene una M
cantidad de hijos. Escriba un programa que pida la cantidad de familias y para
cada familia la cantidad de hijos para averiguar la media de edad de los hijos de
todas las familias.
*/
import java.util.Scanner;

public class G1ME13 {

    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in).useDelimiter("\n");
      
      int familias, hijos, cantidadHijosTotales = 0;
        double edad = 0 , edadMedia;
        
        System.out.println("Ingrese la cantidad de familias: ");
        familias = leer.nextInt();
        
        for (int i = 0; i < familias; i++) {
            System.out.println("Ingrese la cantidad de hijos que tiene: ");
            hijos = leer.nextInt();
            for (int j = 0; j < hijos; j++) {
                System.out.println("Ingrese la edad de su hijo " + "(" +(j + 1)+ ".)");
                edad += leer.nextInt();
                cantidadHijosTotales += 1;
            }
        }
        edadMedia = Math.round(edad / cantidadHijosTotales);
        System.out.println("La edad media de todos los hijos es de: " + edadMedia);
        leer.close();
    }
    
}

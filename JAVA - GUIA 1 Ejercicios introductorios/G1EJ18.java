package Guia1;
/*
Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números
del 0-0-0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya
por una E. Ejemplo:
0-0-0
0-0-1
0-0-2
0-0-E
0-0-4
.
.
0-1-2
0-1-E
Nota: investigar función equals() y como convertir números a String.
*/
import java.util.Scanner;

public class G1EJ18 {

    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in).useDelimiter("\n");
   
        String cadena, unid, dec, cent;
        int unidad = 0, decena = 0, centena = 0;
        boolean seguir = true;
        
        while(seguir) {
            if(unidad == 3) {
                unid = "E";
            } else {
                unid = String.valueOf(unidad);
            }
            if(decena == 3) {
                dec = "E";
            } else {
                dec = String.valueOf(decena);
            }
            if(centena == 3) {
                cent = "E";
            } else {
                cent = String.valueOf(centena);
            }
            cadena = cent + " - " + dec + " - " + unid; 
            
            unidad += 1;
            if(unidad == 10) {
                unidad = 0;
                decena += 1;
            }
            if(decena == 10) {
                decena = 0;
                centena += 1;
            }
            if(centena == 9 && decena == 9 && unidad == 9 ) {
                seguir = false;
            }
            System.out.println(cadena);
     }
        System.out.println("9 - 9 - 9");
    }
   
}

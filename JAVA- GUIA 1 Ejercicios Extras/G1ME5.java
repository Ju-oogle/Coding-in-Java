package Guia1;
/*
5. Una obra social tiene tres clases de socios:
o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de
descuento en todos los tipos de tratamientos.
o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de
descuento para los mismos tratamientos que los socios del tipo A.
o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre
dichos tratamientos.
Solicite una letra (carácter) que representa la clase de un socio, y luego un valor real
que represente el costo del tratamiento (previo al descuento) y determine el importe
en efectivo a pagar por dicho socio.
*/
import java.util.Scanner;

public class G1ME5 {

    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Character obraSocial;
        double precioTratamiento;
        double precioTotal;
        System.out.println("Ingrese A, B, o C segun el tipo de obra social");
        obraSocial = leer.next().toUpperCase().charAt(0);
        if (obraSocial.equals('A') || obraSocial.equals('B') || obraSocial.equals('C')) {
            System.out.println("Ingrese el precio del tratamiento");
            precioTratamiento = leer.nextDouble();
          switch (obraSocial) {
              case 'A':
                  precioTotal = precioTratamiento * .5;
                  System.out.println("El precio del tratamiento sera: " + precioTotal);
                  break;
              case 'B':
                  precioTotal = precioTratamiento * .65;
                  System.out.println("El precio del tratamiento sera: " + precioTotal);
                  break;
              case 'C':
                  precioTotal = precioTratamiento;
                  System.out.println("El precio del tratamiento sera: " + precioTotal);
                  break;
              default:
                  break;
          }
        } else {
            System.out.println("Ingreso un tipo de obra social invalido");
        }
        leer.close();
    }
    
}

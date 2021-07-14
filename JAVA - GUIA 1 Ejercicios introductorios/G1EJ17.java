package Guia1;

/*
17. Realizar un programa que simule el funcionamiento de un dispositivo RS232, este
tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar
con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer
carácter tiene que ser X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la
secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda
secuencia distinta de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas
correctas e incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo
se utilizan las siguientes funciones de Java Substring(), Length(), equals().
 */
import java.util.Scanner;

public class G1EJ17 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String cadena, letra1, letra2, may1, may2, out = "&&&&&";
        int size, flag, correcta = 0, incorrecta = 0;

        System.out.println("Ingrese una palabra o frase de largo 5: ");
        cadena = leer.next();
        size = cadena.length();
           
        flag = 0;
        while (size == 5 && flag == 0)  {
            letra1 = cadena.substring(0, 1);
            may1 = letra1.toUpperCase();
            letra2 = cadena.substring(4, 5);
            may2 = letra2.toUpperCase();

            if (letra1.equals("X") && letra2.equals("O")) {
                correcta += 1;
                System.out.println("La muestra ingresada es correcta");
            } else if (cadena.equals(out)) {
                System.out.println("Ha elegido salir");
                flag = 1;
            } else {
                incorrecta += 1;
                System.out.println("La muestra ingresada es incorrecta");
            }

        }
    }
}

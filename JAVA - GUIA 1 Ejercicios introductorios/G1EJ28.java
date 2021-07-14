package Guia1;

/*
Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz
P de 3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está
contenida dentro de la matriz M. Para ello se debe verificar si entre todas las
submatrices de 3x3 que se pueden formar en la matriz M, desplazándose por filas o
columnas, existe al menos una que coincida con la matriz P. En ese caso, el
programa debe indicar la fila y la columna de la matriz M en la cual empieza el
primer elemento de la submatriz P.
 */
import java.util.Scanner;

public class G1EJ28 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int contador = 0;
        
        int[][] matrizGrande = new int[10][10];
//        int[] fila1 = {1, 26, 36, 47, 5, 6, 72, 81, 95, 10};
//        int[] fila2 = {11, 12, 13, 21, 41, 22, 67, 20, 10, 61};
//        int[] fila3 = {56, 78, 87, 90, 9, 90, 17, 12, 87, 67};
//        int[] fila4 = {41, 87, 24, 56, 97, 74, 87, 42, 64, 35};
//        int[] fila5 = {32, 76, 79, 1, 36, 5, 67, 96, 12, 11};
//        int[] fila6 = {99, 13, 54, 88, 89, 90, 75, 12, 41, 76};
//        int[] fila7 = {67, 78, 87, 45, 14, 22, 26, 42, 56, 78};
//        int[] fila8 = {98, 45, 34, 23, 32, 56, 74, 16, 19, 18};
//        int[] fila9 = {24, 67, 97, 46, 87, 13, 67, 89, 93, 24};
//        int[] fila10 = {21, 68, 78, 98, 90, 67, 12, 41, 65, 12};

//Vector para rellenar matriz grande
        int[] vectorGrande = {
            1, 26, 36, 47, 5, 6, 72, 81, 95, 10,
            11, 12, 13, 21, 41, 22, 67, 20, 10, 61,
            56, 78, 87, 90, 9, 90, 17, 12, 87, 67,
            41, 87, 24, 56, 97, 74, 87, 42, 64, 35,
            32, 76, 79, 1, 36, 5, 67, 96, 12, 11,
            99, 13, 54, 88, 89, 90, 75, 12, 41, 76,
            67, 78, 87, 45, 14, 22, 26, 42, 56, 78,
            98, 45, 34, 23, 32, 56, 74, 16, 19, 18,
            24, 67, 97, 46, 87, 13, 67, 89, 93, 24,
            21, 68, 78, 98, 90, 67, 12, 41, 65, 12
        };
        
//Rellenar matriz grande
    for(int i = 0; i < 10; i++){
        for(int j = 0; j < 10; j++) {
            matrizGrande[i][j] = vectorGrande[contador];
            contador += 1;
            }
        }
    
//Imprimir matriz grande
        System.out.println("Matriz Grande");
        for(int i = 0; i < 10; i++) {
            for(int j = 0; j < 10; j++) {
                System.out.print(matrizGrande[i][j] + " ");
            }
        System.out.println("");
        }      
//Vector para rellenar matriz chica
        int[] vectorChico = {36, 5, 67, 89, 90, 75, 14, 22, 26};

//Rellenar matriz chica
        int[][] matrizChica = new int[3][3];
        contador = 0;
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                matrizChica[i][j] = vectorChico[contador];
                contador += 1;
            }
        }        
//        Mostrar matriz chica
        System.out.println("Matriz Chica");
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.print(matrizChica[i][j] + " ");
                
            }
            System.out.println("");
        }        
        
 
//        Contar coordenadas para las cuales coincide el primer valor de la matriz chica
        contador = 0;
        for(int i = 0; i < 10; i++) {
            for(int j = 0; j < 10; j++) {
                if(matrizGrande[i][j] == matrizChica[0][0]) {
                    contador += 1;
                }
            }
        }
//        Vectores de posicion en los que las coordenadas son iguales al primer numero de la matriz chica
        int[] absc = new int[contador];
        int[] ord = new int[contador];
//        Obtengo los vectores de posicion
        contador = 0;
        for(int i = 0; i < 10; i++) {
            for(int j = 0; j < 10; j++) {
                if(matrizGrande[i][j] == matrizChica[0][0]) {
                    System.out.println("Coordenada " + contador );
                    System.out.println(i + "," + j);
                    absc[contador] = i;
                    ord[contador] = j;
                    contador += 1;
                    
                }
            }
        }
//        Uso x e y para recorrer la matriz chica mientras que j y k recorren la matriz grande; i es para iterar las distintas coordenadas validas para las cuales
//        el primer valor de la matriz chica coincide dentro de la grande
        int iguales;
        int x = 0;
        int y = 0;
        for(int i = 0; i < contador; i++) {
            iguales = 0;
//                System.out.println(absc[i] + ", " + ord[i]);
//                System.out.println(absc[i] + 3 + ", " + (int) (ord[i] + 3));
            System.out.println("Para la coordenada: " + i);
            x = 0;
//            Posicion desde la coordenada hasta la misma coordenada corrida 3 lugares (3 x 3) para verificar la matriz chica dentro de la grande
            for(int j = absc[i]; j < absc[i] + 3; j++) {
                y = 0;
                for(int k = ord[i]; k < ord[i] + 3; k++) {
//                    System.out.println("K:" + k);
//                    Cada vez que los valores sean iguales se suma un contador para luego verificar si es o no una matriz P contenida dentro de la matriz M
                    if(matrizGrande[j][k] == matrizChica[x][y]) {
                        iguales += 1;
                        System.out.println("Son iguales en: " + x + ", " + y);
                    }
//                    System.out.println("Y: " + y);
                    y += 1;
                }
//                System.out.println("J: " + j);
//                System.out.println("X: " + x);
                x += 1;
//                System.out.println("Iguales: " + iguales);
            }
//            Se verifica que la cantidad de valores iguales sea igual que el rango de la matriz chica, es decir, 3 * 3 = 9 
            if(iguales == 9) {
                System.out.println("La coordenada valida es: " + absc[i] + ", " + ord[i]);
            } else {
                System.out.println("No existe una matriz P dentro de la matriz M");
            }
        }           
        
    }

}

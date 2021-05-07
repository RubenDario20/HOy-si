/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrices_rubenmaldonado;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Ruben Dario Arias
 */
public class Matrices_RubenMaldonado {

    static Scanner leer = new Scanner(System.in);
    static Random m = new Random();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingrese cuantas columnas: ");
        int C = leer.nextInt();
        System.out.println("Ingrese cuantas filas: ");
        int F = leer.nextInt();
        int[][] matrix = new int[C][F];
        Metodos_Matrices mm = new Metodos_Matrices();
        Metodos_Caracteres m = new Metodos_Caracteres();
        matrix = mm.lectura(F, C);
        mm.imprimir(matrix);
        int op = 0;

        while (op != 8) {
            System.out.println("***MENU***\n"
                    + "1.Suma de filas\n"
                    + "2.Suma de columnas\n"
                    + "3.Arreglo Diagonal\n"
                    + "4.Arreglo Diagonal invertida\n"
                    + "5.Matriz Ordenada\n"
                    + "6.Matriz Caracteres\n"
                    + "7.Encontrar la palabra\n"
                    + "8.SALIR");
            op = leer.nextInt();

            switch (op) {
                case 1:
                    mm.imprimir(matrix);
                    System.out.println("");
                    imprimirarreglo(mm.sumafilas(matrix));
                    break;
                case 2:
                    mm.imprimir(matrix);
                    System.out.println("");
                    imprimirarreglo(mm.sumacolumnas(matrix));
                    break;
                case 3:
                    mm.imprimir(matrix);
                    System.out.println("La diagonal es");
                    imprimirarreglo(mm.arreglodiagonal(matrix));
                    break;
                case 4:
                    mm.imprimir(matrix);
                    System.out.println("La segunda diagonal es: ");
                    imprimirarreglo(mm.arregloSegunda(matrix));
                    break;
                case 5:
                    mm.imprimir(matrix);
                    System.out.println("La diagonal en orden es: ");
                    mm.imprimir(mm.matrizordenada(matrix));
                    break;
                case 6:
                    System.out.println("Ingrese las filas: ");
                    int fi = leer.nextInt();
                    System.out.println("Ingrese las columnas: ");
                    int col = leer.nextInt();
                    m.imprimir2(m.lectura2(fi, col));
                    break;
                case 7:
                    System.out.println("Ingrese las filas: ");
                    int fil = leer.nextInt();
                    System.out.println("Ingrese las columnas: ");
                    int co = leer.nextInt();
                    char matri[][] = m.lectura2(fil, co);
                    m.imprimir2(matri);
                    System.out.println("Ingrese la palabra: ");
                    String palabra = leer.next();
                    System.out.println(m.EncontrarPalabra(matri, palabra));
                    break;
                case 8: 
                    
            }
        }
    }

    public static void imprimirarreglo(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i] + " ");
        }
    }

}

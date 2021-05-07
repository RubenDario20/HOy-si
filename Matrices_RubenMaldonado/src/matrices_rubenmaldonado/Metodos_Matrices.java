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
public class Metodos_Matrices {

    static Random m = new Random();
    static Scanner leer = new Scanner(System.in);

    public int[][] lectura(int filas, int columns) {
        int[][] temporal = new int[filas][columns];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columns; j++) {
                temporal[i][j] = 1 + m.nextInt(50);
            }
        }
        return temporal;
    }

    public void imprimir(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%02d%s", matrix[i][j], " ");
            }
            System.out.println("");
        }
    }

    public int[] sumafilas(int[][] matrix) {
        int[] respuesta = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                respuesta[i] += matrix[i][j];
            }
        }
        return respuesta;
    }

    public int[] sumacolumnas(int[][] matrix) {
        int[] respuesta = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                respuesta[j] += matrix[i][j];
            }
        }
        return respuesta;
    }

    public int[] arreglodiagonal(int[][] matrix) {
        int[] respuesta = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j) {
                    respuesta[j] = matrix[i][j];
                }
            }
        }
        return respuesta;
    }

    public int[] arregloSegunda(int[][] matrix) {
        int[] respuesta = new int[matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i + j == matrix.length - 1) {
                    respuesta[i] = matrix[i][j];
                }
            }
        }
        return respuesta;
    }

    public int[][] matrizordenada(int[][] matriz) {
        int[][] temporal2 = new int[matriz.length][matriz.length];
        int[] temporal = new int[matriz.length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == j) {
                    temporal[i] = matriz[i][j];
                } else {
                    temporal2[i][j] = matriz[i][j];
                }
            }
        }
        temporal = ordenar(temporal);
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == j) {
                    temporal2[i][j] = temporal[i];
                } else {
                    temporal2[i][j] = matriz[i][j]; 
                }
            }
        }
        return temporal2;
    }

    public int[] ordenar(int[] arreglo) {
        for (int i = 0; i < arreglo.length-1; i++) {
            for (int j = 0; j < arreglo.length-1; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    int temp = arreglo[j + 1];
                    arreglo[j + 1] = arreglo[j];
                    arreglo[j] = temp;
                }
            }
        }
        return arreglo;
    }

}

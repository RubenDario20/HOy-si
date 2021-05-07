/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrices_rubenmaldonado;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Ruben Dario Arias
 */
public class Metodos_Caracteres {

    static Scanner leer = new Scanner(System.in);
    static Random r = new Random();

    public char[][] lectura2(int x, int y) {
        char[][] temporal = new char[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                int m = 97 + r.nextInt(26);
                char c = (char) m;
                temporal[i][j] = c;
            }
        }
        return temporal;
    }

    public void imprimir2(char[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public boolean EncontrarPalabra(char[][] matriz, String palabra) {
        boolean respuesta = true;
        int cont = 0, aux;
        for (int i = 0; i < palabra.length(); i++) {
            char c = palabra.charAt(i);
            aux = 0;
            for (int j = 0; j < matriz.length; j++) {
                for (int k = 0; k < matriz[j].length; k++) {
                    if (c == matriz[j][k]) {
                        cont++;
                        aux = 1;
                        break;
                    }
                }
                if (aux == 1) {
                    break;
                }
            }
        }
        if (cont >= palabra.length()) {
            return respuesta;
        } else {
            respuesta = false;
            return respuesta;
        }
    }
}

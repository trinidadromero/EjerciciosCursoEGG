
package Introjavaguia5;

/**
 *
 * @author lucca
 * 
 * Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz 
P de 3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está 
contenida dentro de la matriz M. Para ello se debe verificar si entre todas las 
submatrices de 3x3 que se pueden formar en la matriz M, desplazándose por filas o 
columnas, existe al menos una que coincida con la matriz P. En ese caso, el 
programa debe indicar la fila y la columna de la matriz M en la cual empieza el 
primer elemento de la submatriz P
 * 
 */
public class ej26matriz_dentro_de_matriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int it, it1;
        int[][] m = {{3, 4, 6, 0, 0, 0, 0, 1, 1, 1,},
                     {1, 1, 1, 0, 0, 0, 0, 1, 1, 1,},
                     {1, 1, 3, 0, 0, 0, 1, 1, 2, 1,},
                     {1, 1, 3, 2, 0, 0, 1, 1, 1, 0,},
                     {0, 0, 4, 1, 1, 1, 1, 1, 0, 0,},
                     {0, 0, 0, 1, 2, 6, 1, 2, 0, 0,},
                     {0, 0, 6, 5, 6, 7, 1, 1, 1, 1,},
                     {1, 2, 1, 1, 1, 1, 3, 1, 1, 1,},
                     {1, 3, 1, 1, 2, 1, 1, 1, 1, 1,},
                     {1, 1, 5, 1, 1, 1, 0, 5, 0, 4,},};

        int[][] p = {{1, 1, 1},
                    {1, 1, 1},
                    {1, 1, 1}};

        it = 0;
        it1 = 0;

        a:
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (p[0][0] == m[i][j]) {
                    for (int k = 0; k < 3; k++) {
                        for (int l = 0; l < 3; l++) {
                            if (p[k][l] == m[k+i][l+j]) {
                                it++;
                            }
                        }
                    }
                    if (it == 9) {
                        it1++;
                        System.out.println("La matriz p se encuentra en la fila " + i + " columna " + j + " de la matriz m");
                        break a;
                    } else {
                        it = 0;
                    }
                }
            }
        }
        if (it1 == 0) {
            System.out.println("No pudimos encontrar la matriz p dentro de la matriz m");
        }
   
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Introjavaguia5;

import java.util.Scanner;

/**
 *
 * @author lucca
 */
public class ej4guia5java {

    /**
     * Dada una cantidad de grados centígrados se debe mostrar su equivalente en 
grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
     * @param args
     */
    public static void main(String[] args) {
        
        int gradosc, gradosf;
       
        Scanner n = new Scanner(System.in);
        
        System.out.println("Ingrese grados centrigrados Centigrados");
        
        gradosc=n.nextInt();
        
        gradosf = 32 + (9 * gradosc / 5);
        
      System.out.println("Los grados centrigrados ingresados: " + gradosc + " pasados a grados Fahrenheit son: " + gradosf );
        
        
    }
    
}

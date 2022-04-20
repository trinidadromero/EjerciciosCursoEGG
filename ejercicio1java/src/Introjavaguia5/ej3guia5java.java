/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Introjavaguia5;

import java.util.Scanner;

/**
 *
 * Escribir un programa que pida una frase y la muestre toda en mayúsculas y 
después toda en minúsculas. Nota: investigar la función toUpperCase() y 
toLowerCase() en Java
 */
public class ej3guia5java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer= new Scanner ( System.in);
        
        String frase;
        
        System.out.println(" Ingrese una frase: ");
        
        frase= leer.next();
        
        frase= frase.toLowerCase();
        
        System.out.println("La frase pasada a minuscula: " + frase);
        
        frase= frase.toUpperCase();
        
        System.out.println("La frase pasada a mayuscula: " + frase);
    }

    private static String toLowerCase(String frase) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

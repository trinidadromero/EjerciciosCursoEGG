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
public class ej10guia5primerletra {

    /**
     * Escriba un programa que pida una frase o palabra y valide si la primera letra de esa 
frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por 
pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir 
“INCORRECTO”. Nota: investigar la función Substring y equals() de Java.
     * 
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        String frase;
        
       
        System.out.println("Ingrese una frase, que comience con la letra A");
        
        frase= leer.next();
        
       String primerletra = frase.substring(0,1);
        
        System.out.println(frase);
        
        System.out.println(frase.substring(0, 1));
        
        String A= "A";
        
        System.out.println(A);
        
        if(primerletra.equals(A)){
            
            System.out.println("CORRECTO");
            
        } else {
            
            System.out.println("INCORRECTO");
            
        }
        
    }
    
}

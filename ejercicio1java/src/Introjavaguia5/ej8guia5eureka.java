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
public class ej8guia5eureka {

    /**
     * Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa 
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: 
investigar la función equals() en Java.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        String frase;
        
        String eureka = "eureka";
        
        System.out.println("Ingrese la palabra eureka");
        
        frase= leer.next();
        
        if(frase.equals(eureka)){
            
            System.out.println("CORRECTO");
            
        }
        
        else { 
            
            System.out.println("INCORRECTO");
        }
        
        
        
    }
    
}

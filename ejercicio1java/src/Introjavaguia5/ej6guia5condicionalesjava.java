/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Introjavaguia5;

import java.util.Scanner;

/**
 *
 * Implementar un programa que dado dos números enteros determine cuál es el 
mayor y lo muestre por pantalla.
 */
public class ej6guia5condicionalesjava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int numerito1, numerito2;
        
        Scanner n= new Scanner(System.in);
        
        System.out.println("Ingrese el primer número: ");
        
        numerito1= n.nextInt();
        
        System.out.println("Ingrese el segundo número: ");
        
        numerito2=n.nextInt();
        
        if (numerito1> numerito2){
            
            System.out.println("El número más grande es: " + numerito1);
            
        }
        
        else { 
            System.out.println("El número más grande es: " + numerito2);
        }
    
             
    }
}

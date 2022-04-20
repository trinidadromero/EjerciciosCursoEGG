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
public class ej7guia5condicionales {

    /**
     * Crear un programa que dado un numero determine si es par o impar.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int numerito, par, impar ;
        
        Scanner n= new Scanner (System.in);
        
        System.out.println("Ingrese un número");
        
        numerito= n.nextInt();
        
        if(numerito%2==0){
            
            System.out.println(" El número ingrsado es par " + numerito );
            
        }
        
        else { 
            
            System.out.println(" El número ingrsado es impar " + numerito );
            
        }
        
    }
    
}

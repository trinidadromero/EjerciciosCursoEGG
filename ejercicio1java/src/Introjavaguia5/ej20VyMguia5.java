/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Introjavaguia5;

/**
 *
 * @author lucca
 */
public class ej20VyMguia5 {

    /**
     * @param args the command line arguments
     * 
     * Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y 
los muestre por pantalla en orden descendente
     */
    public static void main(String[] args) {
       
        int[] vector= new int [100];
        
        int i;
        
        for(i=0; i<100; i++){
            
            vector[i]= i+1;
            
        }
        
        
        for(i=99; i>=0; i--){
            
             System.out.println("Vector: " + vector[i]);
             
        }
       
        
        
    }
    
}

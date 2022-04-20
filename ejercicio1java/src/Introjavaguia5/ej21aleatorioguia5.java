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
public class ej21aleatorioguia5 {

    /**
     * @param args the command line arguments
     * 
     * Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le 
pida al usuario un numero a buscar en el vector. El programa mostrará donde se 
encuentra el numero y si se encuentra repetido
     * 
     */
    public static void main(String[] args) {
        
        int t;
        
        int i;
        
        int num;
        
        Scanner n= new Scanner(System.in);
        
        System.out.println("Ingrese el tamaño del vector: ");
        
        t= n.nextInt();
        
        int []vector = new int[t];
        
        for(i=0; i<t; i++){
            
            vector[i]=(int)(Math.random()*100);
         
            System.out.println( "Vector: " + "["+ vector[i]+ "]"+ " Posición: " +i );
            
        }
        
        System.out.println("Ingrese un número para buscar dentro del vector: ");
        
        num= n.nextInt();
        
        
         for(i=0; i<t; i++){
            
           if( vector[i]== num){
               
               System.out.println("El número ingresado se encuentra en la posición: "+ i);
               
           }
        }

        
    }
    
}

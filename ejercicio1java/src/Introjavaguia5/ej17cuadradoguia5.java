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
public class ej17cuadradoguia5 {

    /**
     * @param args the command line arguments
     * 
     * Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, 
si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * 
*   *
*   *
* * * 
     * 
     */
    public static void main(String[] args) {
      
        int num,i,j;
        
        Scanner n=new Scanner( System.in);
        
        System.out.println("Ingrese un número entero: ");
        
        num= n.nextInt();
        
        //Línea superior
        
        for(i=0; i< num; i++){
            
            System.out.print("*");
            
        }
        
        //Salto de línea
        
        System.out.println();
        
        //Centro del cuadrado
        
        for(i=0; i< num-2 ; i++){
            
            System.out.print("*");
            
            for(j=0; j< num-2; j++){
                
                System.out.print(" ");
            }
            
            System.out.println("*");
            
         }
        
        
        //Línea Inferior
        
         for(i=0; i< num; i++){
            
            System.out.print("*");
            
        }
        
        
    }
    
}

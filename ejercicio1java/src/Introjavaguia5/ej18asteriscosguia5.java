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
public class ej18asteriscosguia5 {

    /**
     * @param args the command line arguments
     * 
     * . Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el 
número ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
5 *****
3 ***
11 ***********
2 **
     */
    public static void main(String[] args) {
     
      int num;
      
      int contador;
        contador = 0;
        
        int i;
        
        Scanner n= new Scanner(System.in);
        
        do{
            
            System.out.println("");
            
            System.out.println("Ingrese un número entre 1 y 20 por favor: ");
            
            num= n.nextInt();
            
            if(num<0 && num>20){
                
                break;   
                
            }
            
            System.out.print( num);
            
            for(i=0; i<num; i++){
                
                System.out.print("*");
                
            }
            
            
            
            contador=contador+1;
            
        } while(contador!=4);
        
    }
    
}

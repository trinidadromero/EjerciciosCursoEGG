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
public class ej22digitosguia5 {

    /**
     * @param args the command line arguments
     * 
     * Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, 
cuántos de 2 dígitos, etcétera (hasta 5 dígitos)
     * 
     */
    public static void main(String[] args) {
        
        int t;
        
        int i;
        
        int num;
        
        int cont1=0;
        
        int cont2=0;
        
        Scanner n= new Scanner(System.in);
        
        System.out.println("Ingrese el tamaño del vector: ");
        
        t= n.nextInt();
        
        int []vector = new int[t];
        
          
        for(i=0; i<t; i++){
            
            vector[i]=(int)(Math.random()*100);
         
            System.out.println( "Vector: " + "["+ vector[i]+ "]"+ " Posición: " +i );
            
            
            if(vector[i]<10){
                
                cont1= cont1+1;
                
            } 
            
            if(vector[i]>10 && vector[i]<100){
                
                cont2=cont2+1;
                
            }
            
        }
        
        System.out.println("La cantidad de números de un dígito dentro del vector son: "+ cont1);
        
        System.out.println("La cantidad de números de 2 dígitos dentro del vector son: "+ cont2);
        
    }
    
}

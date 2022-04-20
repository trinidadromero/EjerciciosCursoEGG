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
public class ej13guia5java {

    /**
     * @param args the command line arguments
     * 
     * Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación 
solicite números al usuario hasta que la suma de los números introducidos supere el 
límite inicial
     */
    public static void main(String[] args) {
        
        int numerito, numerito2;
        
        int suma=0;
        
        Scanner n= new Scanner(System.in);
        
        do{
            
            System.out.println("Ingrese un número menor a 100 , por favor: ");
            
            numerito= n.nextInt();
            
            suma=(suma+ numerito);
            
            if ( suma>100){
                
                break;  
            }
            
        }while(suma<=100);
        
        System.out.println("El resultado de la suma de todos los números ingresado es: "+ suma );
        
    }     
    
}

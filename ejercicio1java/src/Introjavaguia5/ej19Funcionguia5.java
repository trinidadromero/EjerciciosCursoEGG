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
public class ej19Funcionguia5 {

    /**
     * @param args the command line arguments
     * 
     * Crea una aplicación que a través de una función nos convierta una cantidad de 
euros introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o 
libras. La función tendrá como parámetros, la cantidad de euros y la moneda a 
converir que será una cadena, este no devolverá ningún valor y mostrará un 
mensaje indicando el cambio (void).
El cambio de divisas es:
 * 0.86 libras es un 1 €
 * 1.28611 $ es un 1 €
 * 129.852 yenes es un 1 €
     * 
     */
    public static void main(String[] args) {
       
        int e;
        
        int resultadoD, resultadoL, resultadoY;
        
        Scanner n= new Scanner (System.in);
        
        System.out.println("Ingrese  la cantidad de euros: ");
        
        e= n.nextInt();
        
       resultadoL= Libras(e);
        
       resultadoD= Dolar(e);
       
       resultadoY= Yenes(e);
       
        System.out.println("El valor ingresado en euros pasados a Libras es: "+ resultadoL);
        
        System.out.println("El valor ingresado en euros pasados a Dólares es: $" + resultadoD);
        
        System.out.println("El valor ingresado en euros pasados a Yenes es: " + resultadoY);
           
    }

    private static int Dolar(int e) {
        int r = 0;
        return (int) (e* 1.28611);
          
    }  

    private static int Libras(int e) {
        
        int r=0;
        
        return (int) (e*0.86);
        
    }

    private static int Yenes(int e) {
        
        int r=0;
        
        return (int) (e*129.852);
        
    }
      
        
    
       
}
        
        
    


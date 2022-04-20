/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Introjavaguia5;

import java.util.Scanner;

/**
 * 
 * 
 *
 * @author lucca
 */
public class ej14guia5bucles {

    /**
     * @param args the command line arguments
     * 
     * Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe 
salir del bucle y mostrar el mensaje "Se capturó el numero cero". El programa 
deberá calcular y mostrar el resultado de la suma de los números leídos, pero si el 
número es negativo no debe sumarse. Nota: recordar el uso de la sentencia break
     */
    public static void main(String[] args) {
        
        int numeritos;
        
        int suma=0;
        
        int contador=0;
        
        Scanner n= new Scanner(System.in);
        
        do{ 
            System.out.println("Ingrese 20 números, por favor: ");
            
            numeritos=n.nextInt();
            
            suma=(suma + numeritos);
            
            contador=(contador+1);
            
            
            if(numeritos<0){
                 
                System.out.println("ERROR, no se aceptan números negativos");
                
                break;    
            }    
            
            if ( contador==20){
                
                break; 
            }   
        } while(numeritos!=0);
        
        // (!=) significa distinto, o sea que me lo va a pedir mientras que el número sea distinto a 0
        
        System.out.println("La suma de todos los números ingresados es: "+ suma);
        
       if ( numeritos== 0){
           
           System.out.println("Se capturó el numero cero");
           
       } 
        
        
    }
    
}

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
import java.util.*;

public class ej1javasumanum {

    /**
     * Escribir un programa que pida dos números enteros por teclado y calcule la suma 
de los dos. El programa deberá después mostrar el resultado de la suma
     * @param args
     */
    public static void main(String[] args) {
        
        int numerito1,numerito2, resultado;
        
        //Se declara el lector de datos o Scanner
        
        Scanner n= new Scanner(System.in);
        
        //Pido que ingrese un dato
        
        System.out.println("Ingrese el primer número: ");
        
        //Leo el dato
       
        numerito1=n.nextInt();
        
        System.out.println("Ingrese el segundo número: ");
        
        numerito2=n.nextInt();
        
        resultado= numerito1+numerito2;
        
        System.out.println("El resultado de la suma de los dos números ingresado es: " + resultado);
        
        
        
    }
    
}

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
public class ej5guia5java {

    /**
     * Escribir un programa que lea un número entero por teclado y muestre por pantalla 
el doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función 
Math.sqrt()
     * @param args
     */
    public static void main(String[] args) {
       
        int numerito, doble, triple, raizcuadrada; 
        
        Scanner n= new Scanner ( System.in);
        
        System.out.println("Ingrese un número entero: ");
        
        numerito=n.nextInt();
        
        doble= numerito*2;
        
        triple= numerito*3;
        
        raizcuadrada=(int) (Math.sqrt(numerito));
        
     System.out.println("El doble del número ingresado es: " + doble + " El triple es: " + triple + " y su raíz cuadrada es: " + raizcuadrada);
        
        
    }

 
    }
    


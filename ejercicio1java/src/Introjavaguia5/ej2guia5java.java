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
public class ej2guia5java {

    /**  Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre 
por pantalla.
     * @param args
     */
    public static void main(String[] args) {
        
        Scanner leer= new Scanner (System.in);
        
        //Se crea una variable String que es para leer el nombre
        
        String nombre;
        
        
        System.out.println("Ingrese su nombre: ");
        
        
        nombre= leer.next();
        
        
        System.out.println("Su nombre es: " + nombre);
        
        
        
    }
    }
    


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
public class ej15guia5menújavajava {

    /**
     * @param args the command line arguments
     * 
     * Realizar un programa que pida dos números enteros positivos por teclado y 
muestre por pantalla el siguiente menú:
MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:
 
27 
El usuario deberá elegir una opción y el programa deberá mostrar el resultado por 
pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la 
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir 
del programa directamente, se debe mostrar el siguiente mensaje de confirmación: 
¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona el 
carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú
     * 
     */
     public static void main(String[] args) {
        
        System.out.print("Ingrese un numero: ");
        
        Scanner leer = new Scanner(System.in);
        
        int num1 = leer.nextInt();
        
        System.out.print("Ingrese otro numero: ");
        
        int num2 = leer.nextInt();
        
        boolean salir= false;
        
        
        do{
            
            System.out.println("Ingrese una opcion: \n 1.Sumar numeros\n 2.Restar numeros\n 3.Multiplicar numeros\n 4.Dividir numeros\n 5.Salir");
            
            int option = leer.nextInt();
            
                switch(option){
            
                    case 1:
            
                    int suma = num1+num2;
                    
                    System.out.println("El resultado de la suma es: "+suma);
                    
                    break;
                    
                    case 2:
                    
                    int resta = num1-num2;
                    
                    System.out.println("El resultado de la resta es: "+ resta);
                    
                    break;
                    
                    case 3:
                
                    int multi = num1*num2;
                    
                    System.out.println("El resultado de la multiplicacion es: "+ multi);
                    
                    break;
                    
                    case 4:
                
                    int div = num1/num2;
                    
                    System.out.println("El resultado de la division es: "+div);
                    
                    break;
                    
                    case 5:
                    
                        System.out.println("¿Seguro que desea salir?");
                        
                        char exit= leer.next().charAt(0);
                        
                        if(exit=='s'){
                            
                            salir=true;
                            
                            break;
                            
                        } else{
                            
                            break;
                        }
                        
                    default:
                        
                            System.out.println("Elija una opción correcta ");
                            
                            break;
                    
                    }       
                        
        }while(!salir);
        
        
    }    
 
}
        
    



package Introjavaguia5;

import java.util.Scanner;

/**
 *
 * @author lucca
 */
public class ej25magicoguia5 {

    /**
     * @param args the command line arguments
     * 
     *  Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 
donde la suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un 
programa que permita introducir un cuadrado por teclado y determine si este 
cuadrado es mágico o no. El programa deberá comprobar que los números 
introducidos son correctos, es decir, están entre el 1 y el 9
     * 
     * 
     * 
     */
    public static void main(String[] args) {
        
       int t;
        
      int i;
        
      int j;
        
      int matriz [][]= new int [3][3];
      
      Scanner n= new Scanner(System.in);
       
        for(i=0; i<3; i++){
            
            for (j=0; j<3; j++){
                
                System.out.println("Ingrese un valor para la posición " + "["+ i + "]"+ "[" + j+ "]"+ " los valores deben estar emtre 1 y 9");
                
                matriz[i][j]= n.nextInt();
                
                if(matriz[i][j]>9 || matriz[i][j]<1){
                    
                    System.out.println(" Te dije que debe ser entre 1 y 9 marmota");
                    
                    j--;
                    
                }
                
            }
        }    
            
        for(i=0; i<3; i++){
            
            System.out.println(" ");
            
            for (j=0; j<3; j++){
                
                System.out.print("["+ matriz[i][j] +"]");
            
            } 
            
        }
        
        System.out.println(" ");
        
        int h1=0;
            
        for(j=0; j<3; j++){
            
            h1= h1+matriz[0][j];
                 
        }
        
        System.out.println("Resultado de la primer fila: " + h1);
        
        int h2=0;
        
        for(j=0; j<3; j++){
            
            h2= h2+matriz[1][j];
            
        }
        
        System.out.println( "Resultado de la seguna fila: " + h2);
        
        int h3=0;
        
        for(j=0; j<3; j++){
            
            h3= h3+matriz[2][j];
            
        }
        
        System.out.println("Resultado de la tercer fila: " + h3);
        
        int v1=0;
        
        for(i=0; i<3; i++){
            
            v1= v1+matriz[i][0];
            
        }
        
        System.out.println( "Resultado de la primer columa: " + v1);
        
        int v2=0;
        
        for(i=0; i<3; i++){
            
            v2= v2+matriz[i][1];
            
        }
        
        System.out.println( "Resultado de la segunda columna: " + v2);
        
        int v3=0;
        
        for(i=0; i<3; i++){
            
            v3= v3+matriz[i][2];
            
        }
        
        System.out.println( "Resultado de la ttercer columna: " + v3);
        
        int d1=0;
        
        for(i=0; i<3; i++){
            
            d1=d1+matriz[i][i];            
            
        }
        
        System.out.println( "Resultado de la diagonal: " + d1);
        
        int d2=0;
        
        int c=0;
        
        for(i=2; i>=0; i--){
            
            d2=d2+matriz[i][c];
            
            c++;
            
        }
        
        System.out.println("Resultado de la diagonal inversa: " + d2);
        
        if(h1==d1 && h1==v1 && h1==h3 && v1==v3 && v1==v2){
            
            System.out.println("Es magico");
            
        }else{
            
            System.out.println("No es magico");
            
        }
    }
    
}

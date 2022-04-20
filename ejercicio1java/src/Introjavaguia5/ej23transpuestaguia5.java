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
public class ej23transpuestaguia5 {

    /**
     * @param args the command line arguments
     * . Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre 
la traspuesta de la matriz
     * 
     */
    public static void main(String[] args) {
        
       int matriz [][]= new int [4][4];
       
       int matrizT [][]= new int [4][4];
        
        int i;
        
        int j;
        
        System.out.println("MATRIZ ORIGINAL: ");
        
        
        for(i=0; i<4; i++){
            
            for(j=0; j<4;j++){
                
                matriz[i][j]=(int)(Math.random()*100);
                
                
                 System.out.print("["+ matriz[i][j] +"]");    
           
            }  
            
            System.out.println(" ");
        }
        
        int aux;
                
        for(i=0; i<4; i++){
            
            for(j=0; j<4;j++){
                
                aux= matriz[i][j];
                
                matrizT[i][j]= matriz[j][i];
                
                matriz [j][i]= aux;
            }
        }   
       
         System.out.println("LA TRANSPUESTA ES: ");
        
        for(i=0; i<4; i++){
            
            for(j=0; j<4;j++){
                
                 System.out.print("["+matrizT[i][j]+"]" );   
            }
            
            System.out.println(" ");
        }   

        
        
    }    
}

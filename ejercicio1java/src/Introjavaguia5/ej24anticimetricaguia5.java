
package Introjavaguia5;

import java.util.Scanner;

/**
 *
 * @author lucca
 */
public class ej24anticimetricaguia5 {

    /**
     * @param args the command line arguments
     * 
     * . Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice 
que una matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero 
cambiada de signo. Es decir, A es anti simétrica si A = -AT
. La matriz traspuesta de 
una matriz A se denota por AT y se obtiene cambiando sus filas por columnas (o 
viceversa)
     */
    public static void main(String[] args) {
        
        int t;
        
        int i;
        
        int j;
        
       Scanner n = new Scanner(System.in);
       
        System.out.println("Ingrese el tamaño de la Matriz: ");
        
        t= n.nextInt();
        
       int matriz [][]= new int [t][t];
       
       int matrizT [][]= new int [t][t];
        
        while(t<1){
            
            System.out.println("ERROR, ingrese un tamaño positivo: ");
            
            t= n.nextInt();
        }
        
        
        for(i=0; i<t; i++){
            
            for (j=0; j<t; j++){
                
                System.out.println("Ingrese un valor para la posición " + "["+ i + "]"+ "[" + j+ "]");
                
                matriz[i][j]=n.nextInt();
            }
            
        }
      
        boolean log = false;
        
        for(i=0; i<t; i++){
            
            for (j=0; j<t; j++){
                
               if(matriz[i][j]== -matriz[j][i]){
                   
                   log=true;
               }
            }
            
        }
        
        if(log){
            
            System.out.println("La matriz es anti simétrica.");
        } else{
            
            System.out.println("La matriz no es anti simétrica");
            
        }
        
        
        System.out.println("MATRIZ CARGADA:");
        
        for(i=0; i<t; i++){
            
            for(j=0; j<t;j++){
                
                 System.out.print("["+ matriz[i][j] +"]");    
           
            }  
            
            System.out.println(" ");
        }
        
        
        
          int aux;
          
          
                
        for(i=0; i<t; i++){
            
            for(j=0; j<t;j++){
                
                aux= matriz[i][j];
                
                matrizT[i][j]= matriz[j][i];
                
                matriz [j][i]= aux;
            }
        }   
       
         System.out.println("LA TRANSPUESTA ES: ");
        
        for(i=0; i<t; i++){
            
            for(j=0; j<t;j++){
                
                 System.out.print("["+matrizT[i][j]+"]" );   
            }
            
            System.out.println(" ");
        }   

        
        
        
    }
   
    
}

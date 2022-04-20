
package ejercicio10.arreglos;

import java.util.Arrays;

/**
 *10. Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo
A de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por
pantalla. Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros
10 números ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos
elementos con el valor 0.5. Mostrar los dos arreglos resultantes: el ordenado de 50
elementos y el combinado de 20
 *
 */
public class Array {
    
 double arrayA[]=new double[50];  
 
 double arrayB[]=new double[20];
  
 
 public void inicializoA(){
     
     int i = 0;
     
     System.out.println("ArrayA inicializado: ");
     
     System.out.println("  ");
   
   for ( i=0; i<50; i++){
       
       //le sumo100y lo divido para que no me muestre un númro tan largo
       
      arrayA[i]=(int) ((Math.random() * 900) + 100) / 100.0;
       
       System.out.print("[" + arrayA[i] +"]");
       
   }
 
  }
 
 public void ordenar(){
     
     //ordeno de menor a mayor
     
     System.out.println("  ");
     
     System.out.println("arrayA ordenado de menor a mayor "); 
            
      System.out.println("  ");
   
      Arrays.sort(arrayA);
      
        for (int i = 0; i < arrayA.length; i++){   
   
        System.out.print( "["+  arrayA[i]+ "]" + "  /  ");   
        }  
        
        System.out.println("  ");
        
        int i=0;
        
        System.out.println(" arrayB: ");
        
        for(i=0; i<20; i++){
            if(i<10){
                arrayB[i]=arrayA[i];
            }else{
                arrayB[i]=0.5;
            }
            
             System.out.print( "["+arrayB[i]+"]"+ "  /  ");
        }
        
       
     
 }
   
}

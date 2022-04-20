
import java.util.Scanner;


/**
 *
 * @author lucca
 */
public class Ejextra4 {

    /**
     * @param args the command line arguments
     * 
     * Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su 
equivalente en romano.
     * 
     */
    public static void main(String[] args) {
       
        int num;
        
        Scanner n= new Scanner (System.in);
        
        System.out.println("Ingrese un número entre 1 y 10: ");
        
        num= n.nextInt();
        
        switch(num){
            
            case 1: 
               
                if(num<1 || num>10){
                    
                    System.out.println("ERROR, tiene que ser un número entre 1 y 10");
                    
                    break;
                    
                }
                
                
                if(num ==1){
                    
                    System.out.println("El número en romano es: I ");
                }
                
            case 2:
                
               if(num ==2){
                    
                    System.out.println("El número en romano es: II ");
                }
                
                
            case 3:
                
                if(num ==3){
                    
                    System.out.println("El número en romano es: III ");
                }
                
                
            case 4:
                
                if(num ==4){
                    
                    System.out.println("El número en romano es: IV ");
                }
                
                
            case 5:
                
                 if(num ==5){
                    
                    System.out.println("El número en romano es: V ");
                }
                
                
            case 6:
                
                if(num ==6){
                    
                    System.out.println("El número en romano es: VI ");
                }
                
            case 7:
                
                 if(num ==7){
                    
                    System.out.println("El número en romano es: VII ");
                }
                
                
            case 8:
                
                 if(num ==8){
                    
                    System.out.println("El número en romano es: VIII ");
                }
                
                
            case 9: 
                
               if(num ==9){
                    
                    System.out.println("El número en romano es: IX ");
                }
                
                
            case 10:
                
                 if(num ==10){
                    
                    System.out.println("El número en romano es: X ");
                }
       
        }
 
        
    }
    
}


package Introjavaguia5;

import java.util.Scanner;

/**
 *
 * @author lucca
 */
public class Ejextra1 {

    /**
     * @param args the command line arguments
     * 
     * Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si 
el usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 
horas.
     */
    public static void main(String[] args) {
      
        double minutos;
        
        int dias;
        
        int horas;
        
        Scanner n= new Scanner(System.in);
        
        System.out.println("Ingrese un tiempo en minutos: ");
        
        minutos= n.nextInt();
        
        dias=(int) (minutos/1440);
        
        minutos %=1440;
        
        horas= (int) ((minutos*1)/60);
        
        minutos %=60;
        
        int min= (int) minutos;
       
        System.out.println("Los minutos ingresados equivalen a: " + dias+ " día y " + horas + " horas "+ min + " minutos" );
        
        
    }
    
}

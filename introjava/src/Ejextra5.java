
import java.util.Scanner;


/**
 *
 * @author lucca
 */
public class Ejextra5 {

    /**
     * @param args the command line arguments
     * 
     *  
5. Una obra social tiene tres clases de socios: 
o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de 
descuento en todos los tipos de tratamientos. 
o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de 
descuento para los mismos tratamientos que los socios del tipo A. 
o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre 
dichos tratamientos. 
Solicite una letra (carácter) que representa la clase de un socio, y luego un valor real 
que represente el costo del tratamiento (previo al descuento) y determine el importe 
en efectivo a pagar por dicho socio
     * 
     */
    public static void main(String[] args) {
       
        char letra = 0;
        
        int tratamiento=0;
        
        int total=0;
        
        Scanner leer= new Scanner(System.in);
        
        Scanner n= new Scanner(System.in);
        
        System.out.println("Ingrese una letra según la clase de socio: ");
        
        letra=leer.next().charAt(letra);
        
        System.out.println("Ingrese el costo del tratamiento: ");
        
        tratamiento=n.nextInt();
        
       if(letra=='A'){
           
           total= (tratamiento*50)/100;

       } else if(letra== 'B'){
           
           total= (tratamiento*35)/100;
           
       } else{
           
           total= tratamiento;
                   
               System.out.println("No recibe descuento.");   
           
       }
                
                
        System.out.println(" Debe pagar: $"+ total);
        
        
                
        
    }

    
    
}

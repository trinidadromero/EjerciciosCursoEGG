
package ejercicio6;

import ejercicio6.cafe.Nespresso;
import java.util.Scanner;

/**
 *Programa Nespresso. Desarrolle una clase Cafetera con los atributos
capacidadMaxima (la cantidad máxima de café que puede contener la cafetera) y
cantidadActual (la cantidad actual de café que hay en la cafetera). Implemente, al
menos, los siguientes métodos: 
• Constructor predeterminado o vacío
• Constructor con la capacidad máxima y la cantidad actual
• Métodos getters y setters.
• Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
máxima. 
• Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
• Método vaciarCafetera(): pone la cantidad de café actual en cero. 
• Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada
 * 
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner n= new Scanner(System.in).useDelimiter("\n");
        
        Nespresso n1= new Nespresso();
        
        n1.crearNespresso();
        
        int salir=0;
        
        while(salir==0){
            
            
        System.out.println("Escoja una opción: 1.Llenar cafetera 2.Servir taza 3.Vaciar cafetera 4.Agregar café 5.Salir");
        
        int option= n.nextInt();
        
        
        switch(option){
            
            case 1: 
                n1.llenarCafetera(n1.getCantidadActual(), n1.getCapacidadMaxima());
            
            break;
            
            case 2: 
                
               n1.servirTaza(n1.getCantidadActual());
                       
                break;
                
            case 3: 
                
                n1.vaciarCafetera(n1.getCantidadActual());
                
                break;
                
            case 4: 
                
                n1.agregarCafe(n1.getCantidadActual(), n1.getCapacidadMaxima());
                
                break;
                
            case 5:
                
                salir=1;
            }
    }   }       
}

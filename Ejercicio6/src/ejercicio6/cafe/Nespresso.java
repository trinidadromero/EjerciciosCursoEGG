
package ejercicio6.cafe;

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
public class Nespresso {
    
    private int capacidadMaxima;
    
    private int cantidadActual;
    
     Scanner n= new Scanner(System.in).useDelimiter("\n");

    public Nespresso() {
    }

    public Nespresso(int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
    
    public Nespresso crearNespresso(){
        
        System.out.println("Ingrese la capasidad máxima de la cafetera: ");
        
        capacidadMaxima=n.nextInt();
        
        System.out.println("Ingrese la cantidad actual de café que contiene la cafetera: ");
        
        cantidadActual=n.nextInt();
        
        return new Nespresso(capacidadMaxima, cantidadActual);
        
    }
    
   public void llenarCafetera( int cantidadActual, int capacidadMaxima){
       
       cantidadActual=capacidadMaxima; 
       
       System.out.println("Se ha llenado la cafetera: "+ cantidadActual);
       
      setCantidadActual( cantidadActual);
   }
     
     public int servirTaza(int cantidadActual){
         
         System.out.println("Ingrese el tamaño de la taza: ");
         
         int tamaño= n.nextInt();
         
         if(cantidadActual<tamaño){
             
             tamaño=cantidadActual;
             
             System.out.println("No se ha llenado la taza, quedó con: "+ cantidadActual+ "cc" );
         }else{
             
             int servir= cantidadActual-tamaño;
             
             System.out.println("Su taza está llena.");
         }
                 
         
        return tamaño;
   
     }
     
     public void vaciarCafetera( int cantidadActual){
         
         cantidadActual=0;
         
         setCantidadActual( cantidadActual);
         
         System.out.println("Se vació la cafetera: "+ cantidadActual);
   
     }
    
     public void  agregarCafe(int cantidadActual, int capacidadMaxima){
         
          System.out.print("Ingrese la cantidad de cafe a agregar: ");
        
        int cafe = n.nextInt();
        
        if(cantidadActual+cafe<capacidadMaxima){
        
        cantidadActual += cafe;
        
        setCantidadActual(cantidadActual);
        
        }else if(cantidadActual+cafe>capacidadMaxima){
            
            System.out.println("Es demasiado cafe, supera la cantidad maxima");
        }  
    }
}

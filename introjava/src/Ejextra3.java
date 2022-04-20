
import java.util.Scanner;


/**
 *
 * @author lucca
 */
public class Ejextra3 {

    /**
     * @param args the command line arguments
     * 
     * Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una 
vocal. Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la 
clase String. 
     * 
     */
    public static void main(String[] args) {
        
        Scanner leer= new Scanner(System.in);
        
        String letra;
        
        System.out.println("Ingrese una letra: ");
        
        letra= leer.next();
        Object a = null,e = null,i = null,o = null,u = null, A = null, E = null, I = null,O = null,U = null;
        
        if(letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o")|| letra.equals("u")){
            
            System.out.println("La letra ingresada: "+ letra + " es una vocal");
            
        } else if (letra.equals("A") || letra.equals("E") || letra.equals("I") || letra.equals("O")|| letra.equals("U")){
            
             System.out.println("La letra ingresada: "+ letra + " es una vocal");
            
        } else{
            
            System.out.println("La letra ingresada: "+ letra+ " no es una vocal");
            
        }
        
    }
    
}

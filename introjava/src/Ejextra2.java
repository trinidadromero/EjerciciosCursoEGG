
import java.util.Scanner;


/**
 *
 * @author lucca
 */
public class Ejextra2 {

    /**
     * @param args the command line arguments
     * 
     * Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a 
cada una. A continuación, realizar las instrucciones necesarias para que: B tome el 
valor de C, C tome el valor de A, A tome el valor de D y D tome el valor de B. 
Mostrar los valores iniciales y los valores finales de cada variable. Utilizar sólo una 
variable auxiliar
     */
    public static void main(String[] args) {
        
        int A,B,C,D,aux;
        
        Scanner n= new Scanner(System.in);
        
        System.out.println("Ingrese un valor para A,B,C y D");
        
        A= n.nextInt();
        
        B= n.nextInt();
        
        C= n.nextInt();
         
        D= n.nextInt();
        
        
        System.out.println(" A = "+ A + "  \n B= "+ B + "  \n C = " + C + " \n D = "+ D);
        
        
        aux = B;
        
        B= C;
        
        C= A;
        
        A = D;
        
        D = aux;
        
        System.out.println("Intercambio:   \n A= "+ A + "  \n B = "+ B + "  \n C = "+ C + "  \n D = " + D);
        
    }
    
}

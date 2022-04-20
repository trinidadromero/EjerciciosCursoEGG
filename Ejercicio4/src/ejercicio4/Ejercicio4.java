
package ejercicio4;

import ejercicio4.rectangulito.Rectangulo;
import java.util.Scanner;

public class Ejercicio4 {

    /**
     * @param args the command line arguments
     * 
     * Crear una clase Rectángulo que modele rectángulos por medio de un atributo
privado base y un atributo privado altura. La clase incluirá un método para crear el
rectángulo con los datos del Rectángulo dados por el usuario. También incluirá un
método para calcular la superficie del rectángulo y un método para calcular el
perímetro del rectángulo. Por último, tendremos un método que dibujará el
rectángulo mediante asteriscos usando la base y la altura. Se deberán además definir
los métodos getters, setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2
     */
    public static void main(String[] args) {
        
        Scanner n= new Scanner(System.in).useDelimiter("\n");
        
        Rectangulo r1= new Rectangulo();
        
        r1.crearRectangulo();
        
        System.out.println("La superficie es: "+ r1.superficie(r1.getAltura(),r1.getBase()));
        
        System.out.println("El perimetro es: "+ r1.perimetro(r1.getAltura(),r1.getBase()));
        
        r1.dibujarRectangulo(r1.getAltura(), r1.getBase());
       
        
    }
    
}

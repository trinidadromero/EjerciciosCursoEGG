
package ejercicio4.rectangulito;

import java.util.Scanner;

/**
 *Crear una clase Rectángulo que modele rectángulos por medio de un atributo
privado base y un atributo privado altura. La clase incluirá un método para crear el
rectángulo con los datos del Rectángulo dados por el usuario. También incluirá un
método para calcular la superficie del rectángulo y un método para calcular el
perímetro del rectángulo. Por último, tendremos un método que dibujará el
rectángulo mediante asteriscos usando la base y la altura. Se deberán además definir
los métodos getters, setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2
 * 
 */
public class Rectangulo {
    
    Scanner n= new Scanner(System.in).useDelimiter("\n");
    
    private int base;
    
    private int altura;

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo() {
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    public Rectangulo crearRectangulo(){
        
        System.out.println("Ingrese la altura del Rectángulo: ");
        
        altura= n.nextInt();
        
        System.out.println("Ingrese la base del Rect+angulo: ");
        
        base= n.nextInt();
        
        return new Rectangulo(base, altura );
    }
    
    public int superficie(int base, int altura){
        
        int superficie=base*altura;
        
        return superficie;  
    }
    
    public int perimetro(int base, int altura){
        
        int perimetro= (base+altura)*2;
        
        return perimetro;
     
    }
    
    public void dibujarRectangulo(int base, int altura){
        int i = 0;
        int j = 0;
        
        
        char [][] rectangulo = new char [base][altura];
        

        for(i=0;i<base; i++){
            
            System.out.println(" ");
           
            for(j=0;j<altura; j++){
                
                
                rectangulo[i][j]= '*';
                
                System.out.print(rectangulo[i][j]);
                
            }
        }
        
    }
    
    
}

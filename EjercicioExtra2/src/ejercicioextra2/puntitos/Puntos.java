
package ejercicioextra2.puntitos;

import java.util.Scanner;

/**
 *
 * Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus
atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un objeto puntos
usando un método crearPuntos() que le pide al usuario los dos números y los ingresa
en los atributos del objeto. Después, a través de otro método calcular y devolver la
distancia que existe entre los dos puntos que existen en la clase Puntos. Para conocer
como calcular la distancia entre dos puntos consulte el siguiente link:
http://www.matematicatuya.com/GRAFICAecuaciones/S1a.html
 * 
 */
public class Puntos {
    
    private double x;
    
    private double y;
    
    Scanner leer= new Scanner(System.in).useDelimiter("\n");

    public Puntos() {
    }

    public Puntos(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    public void crearPuntos(){
     
        System.out.println("Ingrese la coordenada x ");
        
        x= leer.nextDouble();
        
        setX(x);
        
        System.out.println("Ingrese la coordenada y ");
        
        y= leer.nextDouble();
        
        setY(y);
        
    }
    
    public double calcularDistancia( double x1,double x2,double y1, double y2){
        
       double distancia;
       
       distancia=Math.sqrt(Math.pow((x2-x1), 2)+Math.pow((y2-y1), 2));

       return distancia;
        
    }
    
    
}

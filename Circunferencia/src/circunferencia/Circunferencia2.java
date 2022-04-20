
package circunferencia;

import java.util.Scanner;

/**
 * Declarar una clase llamada Circunferencia que tenga como atributo privado el radio 
de tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo
del objeto.
d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio!).
e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).
 * 
 */
 
public class Circunferencia2 {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    private double radio;

    public Circunferencia2(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
   
    public Circunferencia2 crearCircunferencia(){
        
        System.out.println("Ingrese el radio:");
        
        double radio = leer.nextDouble();
        
        return new Circunferencia2(radio);
        
    }
    
    public double calcularArea(double radio){
        
        double area = Math.PI*Math.pow(radio, 2);
        return area;
        
    }
    
    public double calcularPerimetro(double radio){
        
        double perimetro = 2*Math.PI*radio;
        return perimetro;
        
    }
    

    @Override
    public String toString() {
        return "Circunferencia{" + "radio=" + radio + '}';
    }
 
        
}
    


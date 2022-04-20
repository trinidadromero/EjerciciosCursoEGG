
package ejercicio9;

import mate.Matematica;

/**
 *Realizar una clase llamada Matemática que tenga como atributos dos números reales
con los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener
un constructor vacío, parametrizado y get y set. En el main se creará el objeto y se
usará el Math.random para generar los dos números y se guardaran en el objeto con
su respectivos set. Deberá además implementar los siguientes métodos:
• Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor
valor
• Método calcularPotencia() para calcular la potencia del mayor valor de la clase
elevado al menor número. Previamente se deben redondear ambos valores.
• Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número
 * 
 */
public class Ejercicio9 {

    public static void main(String[] args) {
    
        double num1= Math.random()*10;
        
        double num2= Math.random()*10;
        
        Matematica m1= new Matematica();
        
        m1.setNum1(num1);
        
        m1.setNum2(num2);
        
        m1.devolverMayor(m1.getNum1(), m1.getNum2());
        
        m1.calcularPotencia( m1.getNum1(), m1.getNum2());
        
        m1.calcularRaiz(m1.getNum1(), m1.getNum2());
        
    }
    
}

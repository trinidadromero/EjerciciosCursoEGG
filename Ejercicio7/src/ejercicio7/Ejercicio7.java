
package ejercicio7;

import ejercicio7.datospersonas.Persona;
import java.util.Scanner;

public class Ejercicio7 {

    /**
     * @param args the command line arguments
     * 
     * Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad,
sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún
otro atributo, puede hacerlo. Los métodos que se implementarán son:
• Un constructor por defecto.
• Un constructor con todos los atributos como parámetro.
• Métodos getters y setters de cada atributo.
• Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
O. Si no es correcto se deberá mostrar un mensaje
• Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, significa
que la persona está por debajo de su peso ideal y la función devuelve un -1. Si la
fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona
está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la
fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
función devuelve un 1.
• Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
devuelve un booleano.
A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,
tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad
en distintas variables, para después en el main, calcular un porcentaje de esas 4
personas cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por
encima, y también calcularemos un porcentaje de cuantos son mayores de edad y
cuantos menores
     */
    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        Persona p1= new Persona();
        
        System.out.println("Persona n° : ");
        
        p1.crearPersona();
        
        p1.calcularIMC();
        
        p1.esMayorDeEdad();
        
        System.out.println("Persona n° 2: ");
        
        Persona p2= new Persona();
        
        p2.crearPersona();
        
        p2.calcularIMC();
        
        p2.esMayorDeEdad();
        
        System.out.println("Persona n° 3:  ");
        
        Persona p3= new Persona();
        
        p3.crearPersona();
        
        p3.calcularIMC();
        
        p3.esMayorDeEdad();
        
        System.out.println("Persona n° 4: ");
        
        Persona p4= new Persona();
        
        p4.crearPersona();
        
        p4.calcularIMC();
        
        p4.esMayorDeEdad();
        
        int imc1= p1.calcularIMC();
        
        int imc2= p2.calcularIMC();
        
        int imc3= p3.calcularIMC();
        
        int imc4= p4.calcularIMC();
        
        int desnutrido = 0;
        
        int pesoideal = 0;
        
        int sobrepeso = 0;
        
       if (imc1==-1){
           
           desnutrido++;
           
       } else if(imc1==1){
           
           sobrepeso++;
           
       } else if (imc1==0){
           
           pesoideal++;
           
       }
        

        if (imc2==-1){
           
           desnutrido++;
           
       } else if(imc2==1){
           
           sobrepeso++;
           
       } else if (imc2==0){
           
           pesoideal++;
           
       }
       
         if (imc3==-1){
           
           desnutrido++;
           
       } else if(imc3==1){
           
           sobrepeso++;
           
       } else if (imc3==0){
           
           pesoideal++;
           
       }
         
            if (imc4==-1){
           
           desnutrido++;
           
       } else if(imc4==1){
           
           sobrepeso++;
           
       } else if (imc4==0){
           
           pesoideal++;
           
       }
        
         double pdesnutrido= (desnutrido*100)/4;
         
         double psobrepeso= (sobrepeso*100)/4;
         
         double ppesoideal= (pesoideal*100)/4;
            
        System.out.println(desnutrido);    
        
        System.out.println(sobrepeso);
        
        System.out.println(pesoideal);
        
        System.out.println( "Porcentaje de personas que están por de bajo de su peso ideal: " + pdesnutrido );    
        
        System.out.println("Porcentaje de personas con sobrepeso: "+psobrepeso);
        
        System.out.println("Porcentaje de personas con peso ideal: " + ppesoideal);
        
        boolean mom1= p1.esMayorDeEdad();
        
        boolean mom2= p2.esMayorDeEdad();
        
        boolean mom3= p3.esMayorDeEdad();
        
        boolean mom4= p4.esMayorDeEdad();
        
        int menor=0;
        
        int mayor=0;
        
        if(mom1== true){
            
            mayor++;
            
        } else if(mom1== false){
            
            menor++;
        }
        
        if(mom2== true){
            
            mayor++;
            
        } else if( mom2== false ) {
            
            menor++;
        }
        
        if(mom3== true){
            
            mayor++;
            
        } else if ( mom3== false) {
            
            menor++;
        }
        
        if(mom4== true){
            
            mayor++;
            
        } else if ( mom4== false ) {
            
            menor++;
        }
        
        double pmayor= (mayor*100)/4;
        
        double pmenor=(menor*100)/4;
        
        System.out.println(mayor);
        System.out.println(menor);
        
        
        System.out.println("Porcentaje de la cantidad de personas mayores: " + pmayor);
        
        System.out.println("Porcentaje de la cantidad de personas menores  "+ pmenor);
        
    }
    
}

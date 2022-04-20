
package ejercicio7.datospersonas;

import java.util.Scanner;


/**
 *Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad,
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
 * 
 */
public class Persona {
    
    private String nombre;
    
    private int edad;
    
    private char sexo;
    
    private double peso;
    
    private double altura;
    
     Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Persona() {
    }

    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public Persona crearPersona(){
        
        System.out.println("Ingrese su nombre: ");
        
        nombre= leer.next();
        
        System.out.println("Edad: ");
        
        edad=leer.nextInt();
        
        System.out.println("Sexo: H= hombre, M= mujer, O= otro  ");
        
        char M = 0, H = 0,O = 0;
        
        sexo=leer.next().charAt(0);
        
       while(sexo != 'H' && sexo != 'M' && sexo != 'O'){
            
            System.out.print("Error, indique H, M, O: ");
            sexo = leer.next().charAt(0);
        }
        
        
        System.out.println("Peso: ");
        
        peso=leer.nextDouble();
        
        System.out.println("Altura: ");
        
        altura=leer.nextDouble();
        
        
        return new Persona(nombre, edad, sexo, peso, altura);
     
    }
    
    public int calcularIMC(){
        
          double IMC = (double) (peso/(altura*altura));
        int result;
        
         if(IMC<20){
            
            result= -1;
            
        } else if( IMC>=20 && IMC<=25 ){
            
            result = 0;
            
        } else{
            
            result = 1;
        }
  
        System.out.println(result);
         
        return result;
        
    }
    
    public boolean esMayorDeEdad(){
        
        boolean mayor;
        
        if( edad>= 18){
            
            mayor= true;
            
            System.out.println("Mayor de edad: "+ mayor);
            
        } else{
            
            mayor=false;
            
            System.out.println("Mayor de edad: "+ mayor);
        }
        return mayor;
        
    }
    
    
    
    
}

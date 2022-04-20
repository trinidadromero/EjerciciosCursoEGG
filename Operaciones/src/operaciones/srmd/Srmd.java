/*
 *Crear una clase llamada Operacion que tenga como atributos privados numero1 y
numero2. A continuación, se deben crear los siguientes métodos:
a) Método constructor con todos los atributos pasados por parámetro.
b) Metodo constructor sin los atributos pasados por parámetro.
c) Métodos get y set.
d) Método para crearOperacion(): que le pide al usuario los dos números y los
guarda en los atributos del objeto.
e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
f) Método restar(): calcular la resta de los números y devolver el resultado al main
g) Método multiplicar(): primero valida que no se haga una multiplicación por cero,
si fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el
error. Si no, se hace la multiplicación y se devuelve el resultado al main
h) Método dividir(): primero valida que no se haga una división por cero, si fuera a
pasar una división por cero, el método devuelve 0 y se le informa al usuario el
error se le informa al usuario. Si no, se hace la división y se devuelve el resultado
al main
 */
package operaciones.srmd;

import java.util.Scanner;

public class Srmd {
    
    Scanner n = new Scanner(System.in).useDelimiter("\n");
    
    private int numero1;
    
    private int numero2;

    public Srmd(int numero1, int numero2) {
        
        this.numero1=numero1;
        
        this.numero2=numero2;
        
    }

    public Srmd() {
    }
   
    public Scanner getN() {
        return n;
    }

    public int getNumero1() {
        return numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setN(Scanner n) {
        this.n = n;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
    
    public Srmd crearOpreacion(){
        
        System.out.println("Ingrese el valor del primer número: ");
        
        numero1= n.nextInt();
        
        System.out.println("Ingrese el valor del segundo número: ");
        
        numero2=n.nextInt();
        
        return new Srmd(numero1, numero2);
        
        
    }
    
    public int sumarNumeros (int numero1 , int numero2){
        
        int suma= numero1+ numero2;
        return suma;
    }
    
    public int restarNumeros ( int numero1 , int numero2){
        
        int resta= numero1- numero2;
        return resta;
    }
    
    public int multiplicarNumeros(int numero1, int numero2){
        
        if ( numero1== 0 || numero2==0){
            
            int multiplicar = 0;
            
            System.out.print(" ERROR ");
        }
        
        int multiplicar= numero1*numero2;
        return multiplicar;
    }
    
    public int dividirNumeros(int numero1, int numero2){
        
         if ( numero1== 0 || numero2==0){
            
            int dividir = 0;
            
            System.out.print(" ERROR ");
            
            return dividir;
        }else{
        
        int dividir= numero1/numero2;
        return dividir;
        }
    }
    
}

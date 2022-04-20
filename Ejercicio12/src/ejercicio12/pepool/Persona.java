
package ejercicio12.pepool;

import java.util.Date;
import java.util.Scanner;

/**
 *12. Implemente la clase Persona. Una persona tiene un nombre y una fecha de
nacimiento (Tipo Date), constructor vacío, constructor parametrizado, get y set. Y los
siguientes métodos:
Nota: encontraras un ejemplo descargable de un Date como atributo en Moodle.
• Agregar un método de creación del objeto que respete la siguiente firma:
crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta
al usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos
que la fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
• Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada.
Tener en cuenta que para conocer la edad de la persona también se debe
conocer la fecha actual.
• Agregar a la clase el método menorQue(int edad) que recibe como parámetro
otra edad y retorna true en caso de que el receptor tenga menor edad que la
persona que se recibe como parámetro, o false en caso contrario.
• Metodo mostrarPersona(): este método muestra la persona creada en el método
anterior
 * 
 */
public class Persona {
    
    private String nombre;
    
    private int anio; 
    
    private int mes;
    
    private int dia;
    
    private int edad;
    
    Scanner leer= new Scanner(System.in).useDelimiter("\n");

    public Persona() {
    }

    public Persona(int anio, int mes, int dia) {
        this.anio = anio;
        this.mes = mes;
        this.dia = dia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void crearPersona(){
        
        System.out.println("Ingrese su nombre: ");
        
        nombre= leer.next();
        
        System.out.println("Ingrese su fecha de nacimiento, año, mes y día: ");
        
        anio= leer.nextInt()-1900;
        
        mes= leer.nextInt()-1;
        
        dia= leer.nextInt();
        
        Date fecha= new Date(anio, mes, dia);
        
        
       
    }
    
    public void calcularEdad(){

        Date fecha= new Date(anio, mes, dia);
        
        Date fechaActual=new Date();
        
        int edad =fechaActual.getYear()-fecha.getYear();
        
         if(fecha.getMonth()>fechaActual.getMonth()||fecha.getMonth()==fechaActual.getMonth()&&fecha.getDate()>fechaActual.getDate()){
            edad--;
        }
         
        setEdad(edad);
        
        //System.out.println( edad );
    }
    
    public boolean menorQue(int edad1){
        
        boolean menor;
        
        int edad=getEdad();
        
        if(edad1> edad){
            
            menor= true;
            
        } else{
            
            menor= false;
            
        }
       
        return menor;
        
    }
    
    public void mostrarPersona(){
        
        System.out.println( "Nombre: "+ getNombre());
        
        System.out.println("Edad: "+ getEdad());
     
    }
            
    
}

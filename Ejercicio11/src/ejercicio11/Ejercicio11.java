
package ejercicio11;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Ejercicio11 {

    /**
     * @param args the command line arguments
     * 
     * 11. Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con
la clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la
clase Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le
pedirán al usuario para poner el constructor del objeto Date. Una vez creada la fecha
de tipo Date, deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la
fecha actual, que se puede conseguir instanciando un objeto Date con constructor
vacío.
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date();
Si necesiten acá tienen más información en clase Date: Documentacion Oracle
     */
    public static void main(String[] args) {
   
        int dia;
        
        int mes;
        
        int anio;
        
        Scanner leer=new Scanner(System.in);
        
        System.out.print("Ingrese año, mes y dia: ");
        
        anio=leer.nextInt()-1900;
        
        mes=leer.nextInt()-1;
        
        dia=leer.nextInt();
        
        Date fecha=new Date(anio, mes, dia);
        
        Date fechaActual=new Date();
        
        //Le  doy  el formato que quiero
        
        SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyy");
        
        String fechaformateada= sdf.format(fecha);
        
        System.out.println(fechaformateada);
        
        String fechaActual1= sdf.format(fechaActual);
        
        System.out.println(fechaActual1);
        
        int dif=fechaActual.getYear()-fecha.getYear();
        
        if(fecha.getMonth()>fechaActual.getMonth()||fecha.getMonth()==fechaActual.getMonth()&&fecha.getDate()>fechaActual.getDate()){
            dif--;
        }

        System.out.println("Hay "+dif+" años de diferencia entre la fecha ingresada y la fecha actual.");
        
    }
    
}

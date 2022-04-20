
package Servicios;

import ejercicioextra5.entidades.Meses;
import java.util.Scanner;

/**
 * Crea una clase en Java donde declares una variable de tipo array de Strings que
contenga los doce meses del año, en minúsculas. A continuación, declara una variable
mesSecreto de tipo String, y hazla igual a un elemento del array (por ejemplo,
mesSecreto = mes[9]. El programa debe pedir al usuario que adivine el mes secreto.
Si el usuario acierta mostrar un mensaje, y si no lo hace, pedir que vuelva a intentar
adivinar el mes secreto. Un ejemplo de ejecución del programa podría ser este:
Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: febrero
No ha acertado. Intente adivinarlo introduciendo otro mes: agosto
¡Ha acertado
 *
 * 
 */
public class MesesAño {
    
    Meses m1= new Meses();
    
    Scanner n= new Scanner(System.in).useDelimiter("\n");
    
    public String[] crearArray(){
        
        String Anio[]=new String[12];
        
        Anio[1]="enero";
        
        Anio[2]="febrero";
        
        Anio[3]="marzo";
        
        Anio[4]="abril";
        
        Anio[5]="mayo";
        
        Anio[6]="junio";
        
        Anio[7]="julio";
        
        Anio[8]="agosto";
        
        Anio[9]="septiembre";
        
        Anio[10]="octubre";
        
        Anio[11]="noviembre";
        
        Anio[12]="diciembre";
        
        return Anio;   
    }
    
    public void secreto( String Anio){
        
        System.out.println("Ingrese un mes: ");
        
        
         
        
        
    }
    
    
    
}

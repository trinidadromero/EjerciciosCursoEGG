
package libroo;

import java.util.Scanner;

public class Libroo {

  
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el ISBN, titulo del libro, autor y cantidad de paginas");
       NuevoLibro l1 = new NuevoLibro(leer.nextInt(), leer.next(), leer.next(), leer.nextInt());
       
        System.out.println("ISBN "+ l1.ISBN+" Titulo: " +l1.titulo+" Autor: "+l1.autor+" Cantidad de paginas: "+l1.paginas);
    }
    
}

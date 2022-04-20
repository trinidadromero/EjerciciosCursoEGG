
package ejercicioextra1.extra1;

import java.util.Scanner;

/**
 *
 * Desarrollar una clase Cancion con los siguientes atributos: titulo y autor. Se deberá́
definir además dos constructores: uno vacío que inicializa el titulo y el autor a cadenas
vacías y otro que reciba como parámetros el titulo y el autor de la canción. Se deberán
además definir los métodos getters y setters correspondientes
 * 
 */
public class Cancion {
    
    private String titulo;
    
    private String autor;
    
    Scanner leer= new Scanner(System.in).useDelimiter("\n");

    public Cancion() {
    }

    public Cancion(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    public void crearCancion(){
        
        System.out.println("Ingrese el título: ");
        
        titulo= leer.next();
        
        System.out.println("Ingrese el nombre del autor de la canción: ");
        
        autor= leer.next();
        
        System.out.println("Canción: "+ titulo+ " "+ "Autor: "+ autor);
        
        
    }
    
    
}

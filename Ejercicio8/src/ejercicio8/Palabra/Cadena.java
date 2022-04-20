package ejercicio8.Palabra;

import java.util.Scanner;

/**
 *Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de
String) y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese
una frase que puede ser una palabra o varias palabras separadas por un espacio en
blanco y a través de los métodos set, se guardará la frase y la longitud de manera
automática según la longitud de la frase ingresada. Deberá además implementar los
siguientes métodos:
• Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
frase ingresada.
• Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla.
Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
• Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario
y contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
• Método compararLongitud(String frase), deberá comparar la longitud de la frase
que compone la clase con otra nueva frase ingresada por el usuario.
• Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
con una nueva frase ingresada por el usuario y mostrar la frase resultante.
• Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y
mostrar la frase resultante.
• Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no
 * 
 */
public class Cadena {
    
     Scanner leer= new Scanner(System.in).useDelimiter("\n");
     
    private String frase;
     
    private int longitud;

    public Cadena() {
    }

    public Cadena(String frase, int longitud) {
        this.frase = frase;
        this.longitud = longitud;
    }

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public Cadena crearPalabra(){
        
        System.out.println("Ingrese una frase: ");
        
        frase= leer.nextLine();
        longitud = frase.length();
        return new Cadena (frase, longitud);
        
    }

    public void mostrarVocales(){
        //toLowerCase: convierte las letras en mayuscula que contiene la frase en minusculas para evitar un exceso de condiciones en el IF.
        frase=frase.toLowerCase();
        int i =0;
        int vocal=0;
        for(i =0; i<longitud; i++){
            
            if(frase.charAt(i)== 'a' || frase.charAt(i)== 'e' || frase.charAt(i)== 'i' || frase.charAt(i)== 'o' || frase.charAt(i)== 'u'){
                
                vocal++;
                
                
            }
        }
        System.out.println("Cantidad de vocales: "+vocal);
        
    }
    
    public void invertirFrase(){
        //creo un vector
        char letra[];
        
        letra=new char[longitud];
        
        int i=0;
        
        for(i=0;i<longitud;i++){
            letra[i]=frase.charAt(i);
        }
        
        for(i=longitud-1; i>-1;i--){
            
            System.out.print(letra[i]);
            
        }
        
        System.out.println(" ");
        
    }
    
    public void vecesRepetido(){
        
        String bletra;
        
        System.out.println("Ingrese una letra para buscar dentro de la frase: ");
        
        bletra= leer.next();
        
        int i=0;
        
        int c=0;
        
        for(i=0; i<longitud; i++){
            
            if( bletra.equals(frase.substring(i, i+1))){
                
                c++;
                
            }
            
        }
        
        System.out.println("La letra: "+ bletra+ " se encontró en la frase "+ c+ " veces.");
        
    }
    
    public void compararLongitud(){
        
        String frase2;
        
        System.out.println("Ingrese otra frase por favor: ");
        
        frase2= leer.next();
        
        int longitud2= frase2.length();
        
        if(longitud== longitud2){
            
            System.out.println("La frase: " + frase  + " tiene la misma longitud que la frase: "+ frase2 + " la longitud de ambas es: "+ longitud);
        } else{
            
            System.out.println("Las frases no tienen la misma longitud.");
            
        }
        
    }
    
    public void unirFrase(){
        
        String frasen;
        
        System.out.println("Ingrese una nueva frase: ");
        
        frasen= leer.next();
    
        System.out.println(" Las dos frases unidas:  " + frase + ", "+ frasen);
         
    }
    
    public void reemplazar(){
        
        char caracter;
        
        System.out.println("Ingrese un carácter para reemplazar la letra 'a' dentro de la primer frase: ");
        
        caracter= leer.next().charAt(0);
        
        String newfrase3 = frase.replace('a', caracter);
    
        System.out.println( " La frase después del cambio: "+ newfrase3 );
      
    }
    
    public void contiene(){
        
         String letrita;
        
        System.out.println("Ingrese una letra que esté dentrode de la primer frase: ");
        
         letrita= leer.next();
        
        boolean v;
        
        int i=0;
        
        int con=0;
        
        for(i=0; i<longitud; i++){
            
            if(letrita.equals(frase.substring(i,i+1))){
                
               v= true;
               
               con++;
                
            } 
     
        }
        
        if(con==0){
            
            v= false;
            
            System.out.println(" Falso. ");
            
        } else{
            
           v= true;
           
            System.out.println("Verdadero.");
        }
        
 
    }
    
}


package mate;

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
public class Matematica {
    
    private double num1;
    
    private double num2;

    public Matematica() {
    }

    public Matematica(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    @Override
    public String toString() {
        return "Matematica{" + "num1=" + num1 + ", num2=" + num2 + '}';
    }
    
    public double devolverMayor( double num1, double num2){
       
         double mayor=0;
        
        if(num1> num2){
            
           mayor=num1; 
           
        }else if(num2>num1){
            
            mayor=num2;
        }
        
         System.out.println("El número mayor es: "+ mayor);
        
       return mayor;  
    
    }
    
    public void calcularPotencia( double num1, double num2){
        
        int v1 = (int) Math.round(num1);
        
        int v2 = (int) Math.round(num2);
        
           double red1 = (double) Math.round(num1);
           
           double red2 = (double) Math.round(num2);
           
           double mayor=0;
        
            if(red1>red2){
                
            mayor=red1;
            
             }else if(red2>red1){
            
            mayor=red2;
        }
            
        System.out.println(mayor+" Mayor");
        
        double menor=0;
        
        if(red1<red2){
            
            menor=red1;
            
        }else if(red2<red1){
            
            menor=red2;
        }
        System.out.println(menor+" Menor");
        
        double elevado=0;
        
        elevado=Math.pow(mayor, menor);
        
        System.out.println("Potencia: " + elevado);
        
         
    }   
    
    public void calcularRaiz(double num1, double num2){
        
        double menor=0;
        
        if(num1<num2){
            
            menor= num1; 
            
        } else if( num2< num1 ){
            
            menor=num2;
            
        }
        
        double raiz= Math.sqrt(menor);
        
        System.out.println("La raíz cuadrada de: "+ menor + " es: "+ raiz);
        
        
    }

}

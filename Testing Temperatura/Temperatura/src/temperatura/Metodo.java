
package temperatura;

/**
 *
 * @author royfe
 */
public class Metodo {
    
    public int suma(int num1, int num2){ 
      return num1+num2;  
    }
    
    public int cal(int tem, int dato){
        if(tem<=37){
            System.out.println("Aceseso permitido");
            
        } else {
            System.out.println("Aceseso Denegado");
            
        }  
        return 27;
    }
    
}

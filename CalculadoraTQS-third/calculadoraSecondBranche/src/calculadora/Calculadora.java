package calculadora;
/**
* @author antoniocarvalho
* @version 1.05
* @since release 1.02 da aplicacão
* 
* 
*  Uma classe simples que realiza todas as operacões
*/





public class Calculadora {
/**
 * 
 * @param a O primeiro operando
 * @param b o segundo operando
 * @return O resultado da operação
 */
	
	int somar(int a, int b){
        return a + b;
    }
    
    
    public int sub(int a, int b){
        return a - b;
    }
   
    
    public int multi(int a, int b){
        return a * b;
    }
    
    
    public int div(int a, int b){
        return a / b;
    }
}

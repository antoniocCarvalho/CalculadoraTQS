package calculadora;

public class calculadoraTeste {
    
    public static void main(String[] args){
        Calculadora calc= new Calculadora();
     
     
        System.out.println("TESTES SOMA:");
    
        //cenario de teste 1: soma de dois valores inteiros

        int soma = calc.somar(3,7);
        System.out.println("resultado cenario de teste um: "+soma);
        
        
        //cenario de teste 2: soma de dois valores sendo um zero

        soma = calc.somar(3,0);
        System.out.println("resultado cenario de teste dois: "+soma);
        
        
        //cenario de teste 3: soma de dois valores sendo que ambos são zero

        soma = calc.somar(0,0);
        System.out.println("resultado cenario de teste tres: "+soma);
        
        
        //cenario de teste 3: soma de dois valores sendo um negativo
        
        soma = calc.somar(3,-1);
        System.out.println("resultado cenario de teste quatro: "+soma);
        
        
        
        
        System.out.println("\nTESTES SUBTRAÇÃO:");
        
        //cenario de teste 1: subtração de dois valores inteiros
        
        int sub = calc.sub(8,7);
        System.out.println("resultado cenario de teste um: "+sub);
        
        
        
         //cenario de teste 2: subtração de dois valores sendo um zero

        soma = calc.somar(9,0);
        System.out.println("resultado cenario de teste dois: "+soma);
        
        
        
           //cenario de teste 3: subtração de dois valores sendo um negativo

        soma = calc.somar(9,-6);
        System.out.println("resultado cenario de teste dois: "+soma);
        
        
        
        System.out.println("\nTESTES DIVISÃO:");
        
        //cenario de teste 1: divisão de dois valores inteiros
        
        int div = calc.div(8,2);
        System.out.println("resultado cenario de teste um: "+div);
        
       
       //cenario de teste 2: divisão de dois valores sendo um 0     
       
               try {
      div = calc.div(3,0);
      System.out.println("resultado cenario de teste dois: "+div);
  } catch (Exception ex) {
           System.out.println("ERRO - Impossivel realizar uma divisão com um 0");
   }
        
        
         //cenario de teste 3: divisão de dois valores sendo um negativo
        
        div = calc.div(3,-1);
        System.out.println("resultado cenario de teste dois: "+div);
      
        
        
        
        
        System.out.println("\nTESTES MULTIPLICAÇÃO:");
        
        //cenario de teste 1: divisão de dois valores inteiros
        
         int multi = calc.multi(3,5);
        System.out.println("resultado cenario de teste um: "+multi);
        
        
        //cenario de teste 2: divisão de dois valores sendo um 0
        
        multi = calc.multi(6,0);
        System.out.println("resultado cenario de teste dois: "+multi);
        
        
        ////cenario de teste 3: divisão de dois valores sendo um negativo
        
        multi = calc.multi(2,-1);
        System.out.println("resultado cenario de teste um: "+multi);
    }
    }
        
        
       

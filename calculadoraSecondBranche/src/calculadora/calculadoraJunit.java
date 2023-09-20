package calculadora;

import org.junit.jupiter.api.Test;


public class calculadoraJunit {
	Calculadora calc = new Calculadora();
	

@Test
	public void SomarDoisNumerosPositivos() {
		
		int soma = calc.somar(3, 7);
		
	    System.out.println("\nTESTES SOMA DOIS NÚMEROS POSITIVOS:");
		System.out.println("resultado cenario de teste: "+soma);		
	}


@Test
	public void SomarDoisNumerosUmNegativo() {
		
	


	int soma = calc.somar(3, -9);
	 System.out.println("\nTESTES SOMA DOIS NÚMEROS UM NEGATIVO");
	System.out.println("resultado cenario de teste: "+soma);
	
}



@Test
	public void SomarDoisNumerosUmZero() {	


	int soma = calc.somar(3, 0);
	 System.out.println("\nTESTES SOMA DOIS NÚMEROS UM ZERO");
	System.out.println("resultado cenario de teste: "+soma);
	
}



@Test
	public void SomarDoisNumerosZero() {


	int soma = calc.somar(0, 0);
	 System.out.println("\nTESTES SOMA DOIS NÚMEROS ZERO");
	System.out.println("resultado cenario de teste: "+soma);
	
}

@Test
    public void SubtraçaoDeDoisValoresInteiros() {


	int sub = calc.sub(8, 7);
	 System.out.println("\nTESTES SUBTRAÇÃO DOIS NÚMEROS INTEIROS");
	System.out.println("resultado cenario de teste: "+sub);
	
}

@Test
     public void SubtraçaoDeDoisValoresUmNegativo() {


	int sub = calc.sub(8, -4);
	 System.out.println("\nTESTES SUBTRAÇÃO DOIS NÚMEROS UM NEGATIVO");
	System.out.println("resultado cenario de teste: "+sub);
	
}

@Test
     public void SubtraçaoDeDoisValoresUmZero() {


    		int sub = calc.sub(0, 4);
    		 System.out.println("\nTESTES SUBTRAÇÃO DOIS NÚMEROS UM ZERO");
    		System.out.println("resultado cenario de teste: "+sub);
    		
    	}


@Test
     public void SubtraçaoDeDoisZero() {


    		int sub = calc.sub(0, 0);
    		 System.out.println("\nTESTES SUBTRAÇÃO DOIS NÚMEROS DOIS ZERO");
    		System.out.println("resultado cenario de teste: "+sub);
    		
    	}


@Test
     public void MultiplicacaoDeDoisValoresInteiros() {


    		int multi = calc.multi(4, 2);
    		 System.out.println("\nTESTES MULTIPLICAÇÃO DOIS NÚMEROS INTEIROS");
    		System.out.println("resultado cenario de teste: "+multi);
    		
    	}

@Test
	 public void MultiplicacaoDeDoisValoresUmNegativo() {


		int multi = calc.multi(4, -2);
		 System.out.println("\nTESTES MULTIPLICAÇÃO DOIS NÚMEROS UM NEGATIVO");
		System.out.println("resultado cenario de teste: "+multi);
		
	}
	

@Test
		public void MultiplicacaoDeDoisValoresUmzero() {


		int multi = calc.multi(4, 0);
		 System.out.println("\nTESTES MULTIPLICAÇÃO DOIS NÚMEROS UM ZERO");
		System.out.println("resultado cenario de teste: "+multi);
		
	}

@Test
		public void MultiplicacaoDeDoisZeros() {


		int multi = calc.multi(0, 0);
		 System.out.println("\nTESTES MULTIPLICAÇÃO DOIS ZEROS");
		System.out.println("resultado cenario de teste: "+multi);
		
	}


@Test
		public void DivisaoDeDoisValoresInteiro () {


	int div = calc.div(8, 4);
	 System.out.println("\nTESTES DIVISAO DOIS NÚMEROS INTEIROS");
	System.out.println("resultado cenario de teste: "+div);
	
}

@Test

		public void DivisaoDeDoisValoresUmNegativo () {

	int div = calc.div(8, -3);
		System.out.println("\nTESTES DIVISAO DOIS NÚMEROS UM NEGATIVO");
		System.out.println("resultado cenario de teste: "+div);

}
@Test

		public void DivisaoDeDoisValoresUmZero () {


			int div = calc.div(6, 0);
				System.out.println("\nTESTES DIVISAO DOIS NÚMEROS UM ZERO");
				System.out.println("resultado cenario de teste: "+div);

		}

@Test
		
		public void DivisaoDeDoisValoresDoisZero () {


			int div = calc.div(0, 0);
				System.out.println("\nTESTES DIVISAO DOIS ZERO");
				System.out.println("resultado cenario de teste: "+div);

		}

}





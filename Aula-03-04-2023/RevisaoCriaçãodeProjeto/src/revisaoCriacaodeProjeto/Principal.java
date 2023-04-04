package revisaoCriacaodeProjeto;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) 
	{
		
		// Colocando variaveis(pag 36)
		double primeiroNumeroDouble;
		double segundoNumeroDouble;
		double resultado;
		
		String primeiroNumeroString;
		String segundoNumeroString;
		
		// Criação e inicialização do objeto (pag 93)
		Scanner entradaDados = new Scanner(System.in); 
		
		
		// Imprimir uma informação no console
		System.out.println("SOMA DE DOIS NUMEROS");
		System.out.println("Digite o primeiro numero: ");
				
		primeiroNumeroString = entradaDados.nextLine();
		
		primeiroNumeroDouble = Integer.parseInt(primeiroNumeroString);
		
		System.out.println("Digite o segundo numero: ");
		
		segundoNumeroString = entradaDados.nextLine();
		
		segundoNumeroDouble = Integer.parseInt(segundoNumeroString);
		
		resultado = (primeiroNumeroDouble + segundoNumeroDouble);
		
		System.out.println("O resultado e: " + resultado );
		
				 
		
	}

}

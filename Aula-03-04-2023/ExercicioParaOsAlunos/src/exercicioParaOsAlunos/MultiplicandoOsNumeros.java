package exercicioParaOsAlunos;

import java.util.Scanner;

public class MultiplicandoOsNumeros {

	public static void main(String[] args) 
	{
		Scanner entradaDados = new Scanner(System.in);
		
		double numero1;
		double numero2;
		double resultado;
		String numero1String;
		String numero2String;
		
		
		System.out.println("Multiplicacao de dois numeros!\n ");
		System.out.println("Digite o primeiro numero: ");		
		
		numero1String = entradaDados.nextLine();
		
		numero1 = Integer.parseInt(numero1String);
		
		System.out.println("O primeiro numero double foi: " + numero1String);
		
		System.out.println("Digite o segundo numero: ");
		
		numero2String = entradaDados.nextLine();
		
		numero2 = Integer.parseInt(numero2String);
		
		System.out.println("O segundo numero double foi: " + numero2String);
		
		resultado = (numero1 * numero2);
		
		System.out.println("O resultado e: " + resultado);
				
		
	}

}

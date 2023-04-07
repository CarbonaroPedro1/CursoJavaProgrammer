package principal;

import java.util.Scanner;

import entidade.Animal;

public class Principal {

	public static void main(String[] args) 
	{
				
		Animal animalclasse = new Animal();
		
		Scanner entradaDados = new Scanner(System.in);
		
		String recebeOnome;
		
		System.out.println(" Digite o nome do animal: ");
		recebeOnome = entradaDados.next();
		
		//Armazena a String recebeOnome na variavel nome da classe Animal
		animalclasse.setNome(recebeOnome);
		
		System.err.println(animalclasse.getNome());
		
		
		
	}

}

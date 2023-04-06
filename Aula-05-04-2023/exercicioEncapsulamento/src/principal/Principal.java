package principal;

import java.util.Scanner;
import entidade.Pessoa;
public class Principal {

	public static void main(String[] args) {
		
		Scanner entradaDados = new Scanner(System.in);
		
		String nomeRecebido;
		String cpfRecebido;
		
		Pessoa pessoa = new Pessoa();
		
		System.out.println("Digite o seu nome:");
		nomeRecebido = entradaDados.next();
		
		pessoa.setNome(nomeRecebido);
		
		System.out.println(pessoa.getNome());
		
		System.out.println("Digite a sua CPF: ");
		cpfRecebido = entradaDados.next();
		
		pessoa.setCpf(cpfRecebido);
		
		System.out.println("O CPF e: " + pessoa.getCpf());
		
	}

}

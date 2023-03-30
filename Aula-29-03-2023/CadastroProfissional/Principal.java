import java.util.Scanner;
public class Principal{

   public static void main(String[] args){

		Scanner entradaDados = new Scanner(System.in);
		
		Programador programadorNovo = new Programador();
		System.out.println("Digite o nome do programador: ");
		
		programadorNovo.nome = entradaDados.next();
		
		System.out.println("Digite o CPF do programador");
		programadorNovo.cpf = entradaDados.next();
		
		System.out.println("Digite a linguagem de programação");
		programadorNovo.linguagem = entradaDados.next();

		System.out.println(programadorNovo.nome);
		System.out.println(programadorNovo.cpf);
		System.out.println(programadorNovo.linguagem);

	
	}

}
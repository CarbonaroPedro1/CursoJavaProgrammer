package entidade;

public class Pessoa {

	private String nome;
	private String cpf;
	
	//Recebe o valor da variavel nome
		public void setNome(String nomeRecebido) {
			this.nome = nomeRecebido;
					
			
			
		} 
	
		public String getNome() {
			return this.nome;	
		}
		
		public void setCpf(String cpfRecebido) {
			this.cpf = cpfRecebido;
			
		}
		
		public String getCpf() {
			return this.cpf;
		}
		
}

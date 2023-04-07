package Principal;

import javax.swing.JOptionPane;

import Entidades.Celular;
import Entidades.Televisao;

public class Principal {

	public static void main(String[] args) {
		
		Celular celular = new Celular();
		Televisao televisao = new Televisao();
		
		String recebeCodigo;
		String recebeModelo;
		
		String recebeModeloTemp = JOptionPane.showInputDialog("Digite o modelo: ");
		JOptionPane.showMessageDialog(null,"O nome recebido foi: " + recebeModeloTemp);
		
		

	}

}

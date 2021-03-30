//Tela que vemos

package app1.view;

import javax.swing.JOptionPane;

public class Tela {

	//M�todo: Montar o Menu
	public String montarMenu() {
		
		//Op��es do Menu
		String menu = "1. Cadastrar Contato"
				+ "\n2. Buscar Contato"
				+"\n3. Editar Contato"
				+"\n4. Excluir Contato"
				+ "\n0. Sair"
				+ "\n\n";
		
		//Retorno
		return JOptionPane.showInputDialog(
				null,
				menu,
				":: AGENDA DE CONTATOS ::",//T�tulo 
				-1);
		
	}// Fecha o m�todo montarMenu
	
	//M�todo: receber valores, recebe os dados informados pelo usu�rio
	public String receberDados(String mensagem, String titulo, int icone) {
		
		return JOptionPane.showInputDialog(
				null,
				mensagem,
				titulo,
				icone);

	}// fecha o m�todo receberDados
	
	//Mostra o resultado
	public void mostrarMensagem(String mensagem, String titulo, int icone) {
		
		JOptionPane.showMessageDialog(
				null,
				mensagem,
				titulo,
				icone);
	}
	
	//Mostra a tela de confirma��o
	public int confirmarMensagem(String mensagem, String titulo, int icone) {
		
	return JOptionPane.showConfirmDialog(
			null, 
			mensagem,
			titulo,
			JOptionPane.YES_NO_OPTION,
			icone); //Retorna um inteiro
	}
}














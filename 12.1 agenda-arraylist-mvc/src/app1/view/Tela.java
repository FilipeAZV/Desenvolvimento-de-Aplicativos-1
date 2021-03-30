//Tela que vemos

package app1.view;

import javax.swing.JOptionPane;

public class Tela {

	//Método: Montar o Menu
	public String montarMenu() {
		
		//Opções do Menu
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
				":: AGENDA DE CONTATOS ::",//Título 
				-1);
		
	}// Fecha o método montarMenu
	
	//Método: receber valores, recebe os dados informados pelo usuário
	public String receberDados(String mensagem, String titulo, int icone) {
		
		return JOptionPane.showInputDialog(
				null,
				mensagem,
				titulo,
				icone);

	}// fecha o método receberDados
	
	//Mostra o resultado
	public void mostrarMensagem(String mensagem, String titulo, int icone) {
		
		JOptionPane.showMessageDialog(
				null,
				mensagem,
				titulo,
				icone);
	}
	
	//Mostra a tela de confirmação
	public int confirmarMensagem(String mensagem, String titulo, int icone) {
		
	return JOptionPane.showConfirmDialog(
			null, 
			mensagem,
			titulo,
			JOptionPane.YES_NO_OPTION,
			icone); //Retorna um inteiro
	}
}














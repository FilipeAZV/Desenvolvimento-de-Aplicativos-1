import javax.swing.JOptionPane;

public class Tela {

	// 0. Exemplo b�sico
	public void mostrar() {
		JOptionPane.showMessageDialog(null, "PLAIN_MESSAGE", "T�tulo -1", -1);
		JOptionPane.showMessageDialog(null, "ERROR_MESSAGE", "T�tulo 0", 0);
		JOptionPane.showMessageDialog(null, "INFORMATION_MESSAGE", "T�tulo 1", 1);
		JOptionPane.showMessageDialog(null, "WARNING_MESSAGE", "T�tulo 2", 2);
		JOptionPane.showMessageDialog(null, "QUESTION_MESSAGE", "T�tulo 3", 3);
		// (null, "A mensagem em si", "T�tulo da janela", �cone)

		// Para o usu�rio colocar um valor, tem que ser
		
		// JOptionPane.showInputDialog(null, "teste","T�tulo",1);

		// Lista de �cones

		// - 1. PLAIN_MESSAGE
		// 0. ERROR_MESSAGE
		// 1. INFORMATION_MESSAGE
		// 2. WARNING_MESSAGE
		// 3. QUESTION_MESSAGE
	}

	// 1. Mostrar mensagem
	public void mostrarMensagem(String mensagem, String titulo, int numIcone) {
		JOptionPane.showConfirmDialog(null, mensagem, titulo, numIcone);
	}

	// 2. Cadastrar Contato
	public String informaDados(String campo) {
		String dados = JOptionPane.showInputDialog(null, "Informe o " + campo, "Cadastrar Contato", 1);

		return dados;
	}

	// 3. Confirmar Sair
	public int confirmarSair() {
		int sair = JOptionPane.showConfirmDialog(null, "Tem certeza?", "Fechar Sistema",JOptionPane.YES_NO_OPTION, 3);
		//int sair = JOptionPane.showInputDialog(null, "Tem certeza? = Mensagem", "Fechar Sistema = T�tulo",JOptionPane.YES_NO_OPTION = Confirma��o, icone = 3);

		//OBS:
		//Sim == 0 
		//N�o == 1
		
		return sair;
	}
}











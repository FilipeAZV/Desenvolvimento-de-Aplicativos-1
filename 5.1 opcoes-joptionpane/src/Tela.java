import javax.swing.JOptionPane;

public class Tela {

	// 0. Exemplo básico
	public void mostrar() {
		JOptionPane.showMessageDialog(null, "PLAIN_MESSAGE", "Título -1", -1);
		JOptionPane.showMessageDialog(null, "ERROR_MESSAGE", "Título 0", 0);
		JOptionPane.showMessageDialog(null, "INFORMATION_MESSAGE", "Título 1", 1);
		JOptionPane.showMessageDialog(null, "WARNING_MESSAGE", "Título 2", 2);
		JOptionPane.showMessageDialog(null, "QUESTION_MESSAGE", "Título 3", 3);
		// (null, "A mensagem em si", "Título da janela", ícone)

		// Para o usuário colocar um valor, tem que ser
		
		// JOptionPane.showInputDialog(null, "teste","Título",1);

		// Lista de ícones

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
		//int sair = JOptionPane.showInputDialog(null, "Tem certeza? = Mensagem", "Fechar Sistema = Título",JOptionPane.YES_NO_OPTION = Confirmação, icone = 3);

		//OBS:
		//Sim == 0 
		//Não == 1
		
		return sair;
	}
}











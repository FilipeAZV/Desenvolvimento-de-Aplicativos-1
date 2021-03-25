import javax.swing.JOptionPane;

public class Tela {


	public static void mostrarMensagem(String mensagem, String titulo, int icone) {
		JOptionPane.showMessageDialog(
				null,
				mensagem,
				titulo,
				icone);
	}
	
	public String receberDados(String mensagem, String titulo, int icone) {
		return JOptionPane.showInputDialog(
				null,
				mensagem,
				titulo,
				icone);
	}
	
	/*
	public String receberNome() {
		return JOptionPane.showInputDialog("Informe o nome");
	}
	
	public String receberEmail() {
		return JOptionPane.showInputDialog("Informe o e-mail");
	}
	
	public String receberSenha() {
		return JOptionPane.showInputDialog("Informe a senha");
	}
	*/
}
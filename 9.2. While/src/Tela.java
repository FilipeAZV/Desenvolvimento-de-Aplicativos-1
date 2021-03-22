import javax.swing.JOptionPane;

public class Tela {

	public String receberDado(String mensagem, String titulo, int icone) {
		return JOptionPane.showInputDialog(null,mensagem, titulo, icone);

	}

	public void mostrarMensagem(String mensagem, String titulo, int icone) {
		JOptionPane.showMessageDialog(null, mensagem);
	}
}

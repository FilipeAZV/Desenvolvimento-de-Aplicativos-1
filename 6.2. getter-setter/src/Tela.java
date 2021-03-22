import javax.swing.JOptionPane;

public class Tela {

	public String pegarDados(String campo) {
		return JOptionPane.showInputDialog("Informe " + campo);
	}

	public void mostrarDados(String mensagem) {
		JOptionPane.showMessageDialog(null, mensagem);
	}
}

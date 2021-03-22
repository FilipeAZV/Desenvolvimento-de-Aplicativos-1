import javax.swing.JOptionPane;

public class Tela {

	public String resultado;

	public String input(String texto) {

		return JOptionPane.showInputDialog(texto);

	}

	public void output(String texto) {
		JOptionPane.showMessageDialog(null, texto);
	}
}

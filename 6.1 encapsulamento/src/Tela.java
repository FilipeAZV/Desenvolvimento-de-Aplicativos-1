import javax.swing.JOptionPane;

public class Tela {

	// Atributos (Variav�is)
	public Double tamanho;
	public String marca;

	// M�todos
	public String input() {
		return JOptionPane.showInputDialog("Informe um n�mero");
	}
	
	//Sa�da (Mostrar)
	public void output(String resultado) {
		JOptionPane.showMessageDialog(null, resultado);
	}
}

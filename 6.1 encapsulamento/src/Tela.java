import javax.swing.JOptionPane;

public class Tela {

	// Atributos (Variavéis)
	public Double tamanho;
	public String marca;

	// Métodos
	public String input() {
		return JOptionPane.showInputDialog("Informe um número");
	}
	
	//Saída (Mostrar)
	public void output(String resultado) {
		JOptionPane.showMessageDialog(null, resultado);
	}
}

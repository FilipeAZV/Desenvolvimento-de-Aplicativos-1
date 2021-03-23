
//OBS: while enquanto
import javax.swing.JOptionPane;

//Métodos
public class Contador {

	public void contadorWhile() {
		String valorInformado = JOptionPane.showInputDialog(null, "Informe um valor", /* Mensagem */
				"Contador WHILE", /* Título */
				3);

		try {
			// Tenta converter o valor informado (texto) para inteiro:
			int valor = Integer.parseInt(valorInformado);

			// Contador
			int cont = 1;

			while (cont <= valor) {

				if (cont < valor) {
					System.out.print(cont + ", ");

				} else {
					System.out.print(cont + ".");
				}

				cont++; // o mesmo que: cont = cont +1;(Coloque mais 1 dentro deste valor)

			}

		} catch (Exception e) {// Se não der para converter cairá aqui(excessão):
			JOptionPane.showMessageDialog(null, "Informe apenas números");
		}

	}// Fecha o método contadorWhile

	public void contadorFor() {

		String valorInformado = JOptionPane.showInputDialog(null, "Informe um valor", /* Mensagem */
				"Contador FOR", /* Título */
				3);

		int valor;

		try {
			// Tenta converter o valor informado (texto) para inteiro:
			valor = Integer.parseInt(valorInformado);
			System.out.println("\n");
			
			for (int cont = 1; cont <= valor; cont++) { //com o for fica tudo praticamente na mesma linha

				if (cont < valor) {
					System.out.print(cont + ", ");

				} else {
					System.out.print(cont + ".");
				}
			}
		
		} catch (Exception e) {// Se não der para converter cairá aqui(excessão):
			JOptionPane.showMessageDialog(null, "Informe apenas números");
		}

	}// Fecha o método contadorFor
}

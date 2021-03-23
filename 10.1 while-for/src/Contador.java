
//OBS: while enquanto
import javax.swing.JOptionPane;

//M�todos
public class Contador {

	public void contadorWhile() {
		String valorInformado = JOptionPane.showInputDialog(null, "Informe um valor", /* Mensagem */
				"Contador WHILE", /* T�tulo */
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

		} catch (Exception e) {// Se n�o der para converter cair� aqui(excess�o):
			JOptionPane.showMessageDialog(null, "Informe apenas n�meros");
		}

	}// Fecha o m�todo contadorWhile

	public void contadorFor() {

		String valorInformado = JOptionPane.showInputDialog(null, "Informe um valor", /* Mensagem */
				"Contador FOR", /* T�tulo */
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
		
		} catch (Exception e) {// Se n�o der para converter cair� aqui(excess�o):
			JOptionPane.showMessageDialog(null, "Informe apenas n�meros");
		}

	}// Fecha o m�todo contadorFor
}

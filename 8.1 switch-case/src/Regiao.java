//Diferen�a entre o IF ELSE e SWITCH CASE

import javax.swing.JOptionPane;

public class Regiao {

	// Atributos
	// (\n: quebra de linha)
	private String menu = 
			":: Informe a regi�o ::\n\n" 
			+ "1. Sul\n"
			+ "2. Sudeste\n"
			+ "3. Centro-Oeste\n"
			+ "4. Nordeste\n"
			+ "5. Norte\n" 
			+ "0. Sair\n\n"
			+ "Informe uma das regi�es\n\n";

	// M�todos
	public void criarMenuSwitch() {
		// Variav�l que ir� receber a regi�o informada pelo usu�rio:
		String regiao = JOptionPane.showInputDialog(
				null, 
				menu, // Mensagem
				"Regi�es com Switch Case", // T�tulo
				3);

		switch (regiao) {
		case "0":
			regiao = "Encerrando o sistema...";
			break;

		case "1":
			regiao = "Regi�o escolhida: Sul";
			break;

		case "2":
			regiao = "Regi�o escolhida: Sudeste";
			break;

		case "3":
			regiao = "Regi�o escolhida: Centro-Oeste";
			break;

		case "4":
			regiao = "Regi�o escolhida: Nordeste";
			break;

		case "5":
			regiao = "Regi�o escolhida: Norte";
			break;

		default:
			regiao = "Informe uma das op��es do menu";
		}
		
		// Mostra a regi�o escolhida
		JOptionPane.showMessageDialog(null, regiao, "Regi�o", 1);

	}// Fecha o m�todo criarMenuSwitch

	public void criarMenuIF() {

		String regiao = JOptionPane.showInputDialog(
				null, 
				menu, // Mensagem
				"Regi�es com IF ElSE", // T�tulo
				2); 

		if (regiao.equals("0")) {// Equals: equals � da classe objeto, serve para fazer teste com outra
			regiao = "Encerrando o sistema...";

		} else if (regiao.equals("1")) {
			regiao = "Regi�o escolhida: Sul";

		} else if (regiao.equals("2")) {
			regiao = "Regi�o escolhida: Sudeste";

		} else if (regiao.equals("3")) {
			regiao = "Regi�o escolhida: Centro-Oeste";

		} else if (regiao.equals("4")) {
			regiao = "Regi�o escolhida: Nordeste";

		} else if (regiao.equals("5")) {
			regiao = "Regi�o escolhida: Norte";

		} else { // se a pessoa n�o colocar n�mero. a resposta ser� est�!
			regiao = "Informe uma das op��es do menu";
		}
		// Mostra a regi�o escolhida:
		JOptionPane.showMessageDialog(null, regiao, "regi�o", 1);
	}

}

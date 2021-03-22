
public class Calculadora {

	//Calcular
	public void calcular() { //FA�ADE (padr�o de projetos - Design Pattern)
		
		String menu = 
				"1. Adi��o\n"
				+ "2. Subtra��o\n"
				+ "3. Multiplica��o\n"
				+ "4. Divis�o\n"
				+ "0. Sair\n\n";
		
		//o boolean pergunta, o ativo est� ativo? = true
		//ps: n�o fa�a o while sem um tipo de parada, ou escape
		//O menu vai ficar rodando, s� vai ser desativado quando apertarmos o 0, e assim o 0 se tornar� falso (de false para true) 
		
		//Verifica��o do menu:
		boolean ativo = true;
		Tela tela = new Tela();
	
		while (ativo) {//enquanto a condi��o for verdadeira, ele fica ativo, o mesmo que: while (ativo == true) {
			//Monta o menu
			String valor = tela.receberDado(menu, "Calculadora", -1);
			
			int operacao = 0;
			
			//Recebe a opera��o informada pelo usu�rio
			try {
				operacao = Integer.parseInt(valor); // se tentarmos converter uma letra para inteiro, e n�o der ele vai tentar fazer
			
			} catch (Exception e ) {
				tela.mostrarMensagem("Informe apenas n�meros", "Aten��o", 2);
				e.printStackTrace();// joga no console 
			}
			
			double valor1 = 0; //ao criar um valor num�rico, temos que colocar pelo menos um 0, n�o pode ficar vazio
			double valor2 = 0;
			
			//Se a opera��o escolhida estiver, entre 1 e 4 (op��es do menu)
			if (operacao >= 1 && operacao <= 4) {
				valor = tela.receberDado("Informe o primeiro valor", "Informar valor",3);
				valor1 = Double.parseDouble(valor);
			
				valor = tela.receberDado("Informe o segundo valor", "Informar valor",3);
				valor2 = Double.parseDouble(valor);
			}
			
			switch (operacao) {
			
				case 0:
					tela.mostrarMensagem("Encerrando sistema...", "Encerrando", 2);
					ativo = false;
					break;
			
					//2 tipos, primeiro:
				case 1:
					tela.mostrarMensagem("O resultado �: " + somar(valor1, valor2), "Adi��o",1);
					break;
					
					//outro tipo, que est� mais resumido:
				case 2:
					tela.mostrarMensagem("O resultado �: " + subtrair(valor1, valor2), "Subtra��o", 1);
					break;
					
				case 3:
					tela.mostrarMensagem("O resultado �: " + multiplicar(valor1, valor2), "Multiplica��o", 1);
					break;
					
				case 4:
					tela.mostrarMensagem("O resultado �: " + dividir(valor1, valor2), "Divis�o", 1);
					break;
					
				default:
					tela.mostrarMensagem("Informe uma das op��es do menu", "Aten��o", 0);
			
			}	
		}	
	} //Fecha o m�todo calcular
	
	//Processamento:
	private Double somar(double _valor1, double _valor2) {
		return _valor1 + _valor2;
	}
	private Double subtrair(double _valor1, double _valor2) {
		return _valor1 - _valor2;
	}
	private Double multiplicar(double _valor1, double _valor2) {
		return _valor1 * _valor2;
	}
	private Double dividir(double _valor1, double _valor2) {
		return _valor1 / _valor2;
	}
	
}



















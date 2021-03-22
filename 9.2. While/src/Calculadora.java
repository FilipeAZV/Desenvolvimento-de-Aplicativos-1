
public class Calculadora {

	//Calcular
	public void calcular() { //FAÇADE (padrão de projetos - Design Pattern)
		
		String menu = 
				"1. Adição\n"
				+ "2. Subtração\n"
				+ "3. Multiplicação\n"
				+ "4. Divisão\n"
				+ "0. Sair\n\n";
		
		//o boolean pergunta, o ativo está ativo? = true
		//ps: não faça o while sem um tipo de parada, ou escape
		//O menu vai ficar rodando, só vai ser desativado quando apertarmos o 0, e assim o 0 se tornará falso (de false para true) 
		
		//Verificação do menu:
		boolean ativo = true;
		Tela tela = new Tela();
	
		while (ativo) {//enquanto a condição for verdadeira, ele fica ativo, o mesmo que: while (ativo == true) {
			//Monta o menu
			String valor = tela.receberDado(menu, "Calculadora", -1);
			
			int operacao = 0;
			
			//Recebe a operação informada pelo usuário
			try {
				operacao = Integer.parseInt(valor); // se tentarmos converter uma letra para inteiro, e não der ele vai tentar fazer
			
			} catch (Exception e ) {
				tela.mostrarMensagem("Informe apenas números", "Atenção", 2);
				e.printStackTrace();// joga no console 
			}
			
			double valor1 = 0; //ao criar um valor numérico, temos que colocar pelo menos um 0, não pode ficar vazio
			double valor2 = 0;
			
			//Se a operação escolhida estiver, entre 1 e 4 (opções do menu)
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
					tela.mostrarMensagem("O resultado é: " + somar(valor1, valor2), "Adição",1);
					break;
					
					//outro tipo, que está mais resumido:
				case 2:
					tela.mostrarMensagem("O resultado é: " + subtrair(valor1, valor2), "Subtração", 1);
					break;
					
				case 3:
					tela.mostrarMensagem("O resultado é: " + multiplicar(valor1, valor2), "Multiplicação", 1);
					break;
					
				case 4:
					tela.mostrarMensagem("O resultado é: " + dividir(valor1, valor2), "Divisão", 1);
					break;
					
				default:
					tela.mostrarMensagem("Informe uma das opções do menu", "Atenção", 0);
			
			}	
		}	
	} //Fecha o método calcular
	
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



















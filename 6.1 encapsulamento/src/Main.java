
public class Main {

	public static void main(String[] args) {
		
		//1. Declaração das variavéis 
		Tela tela = new Tela();
		Double valor1, valor2, resultado;
		
		//2. Atribuição de valores
		String valor = tela.input(); // guardou o valor
		// entra String e já é convertido para Double
		valor1 = Double.parseDouble(tela.input()); 
		valor2 = Double.parseDouble(tela.input());
		
		//3. Cáculo (PROCESSAMENTO)	
		resultado = valor1 + valor2;
		
		//4. Mostra o resultado
		tela.output(resultado.toString());
		
		//Visibilidade (Public e Private)
		tela.tamanho = 5.5;
		tela.marca = "Xiaiomi"; 
		
		tela.output(tela.tamanho.toString());
		tela.output(tela.marca);
		
	}
}

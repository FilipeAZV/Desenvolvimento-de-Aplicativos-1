//6. Escreva um algoritmo que receba 2 valores e inverta os valores informados (valor1 passa
//a ter o conte�do de valor2 e valor2 passa a ter o conte�do de valor1.

public class Atividade6 {

	public static void main(String[] args) {

		Tela t = new Tela();// instanciar o objeto

		// Variav�is
		double valor1, valor2, cache;

		// Caixa de di�logo
		valor1 = Double.parseDouble(t.input("Digite o 1� valor"));
		valor2 = Double.parseDouble(t.input("Digite o 2� valor"));

		// Processamento
		cache = valor1;
		valor1 = valor2;
		valor2 = cache;

		// tela
		t.output(" O valor 1 �: " + valor1 + " e o valor 2 �: " + valor2);
	}
}

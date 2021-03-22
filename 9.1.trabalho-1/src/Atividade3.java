//3. Escreva um algoritmo que calcule a área de um quadrado. Mostre na tela.

public class Atividade3 {

	public static void main(String[] args) {

		Tela t = new Tela(); // instanciar o objeto
		double[] n = new double[2]; // instaciar Array

		// Variavéis
		double areaQuadrada;

		// Caixa de diálogo
		for (int i = 0; i < n.length; i++) { // Se o i for maior que o tamanho da matriz, ele sai do loop
			int a = i + 1;
			n[i] = Double.parseDouble(t.input("Digite o " + a + "º Valor"));
		}

		// Processamento
		areaQuadrada = n[0] * n[1];

		// tela
		t.output("O calculo da área deste quadrado é: " + areaQuadrada);

	}

}

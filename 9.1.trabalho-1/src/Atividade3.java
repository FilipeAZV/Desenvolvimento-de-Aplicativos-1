//3. Escreva um algoritmo que calcule a �rea de um quadrado. Mostre na tela.

public class Atividade3 {

	public static void main(String[] args) {

		Tela t = new Tela(); // instanciar o objeto
		double[] n = new double[2]; // instaciar Array

		// Variav�is
		double areaQuadrada;

		// Caixa de di�logo
		for (int i = 0; i < n.length; i++) { // Se o i for maior que o tamanho da matriz, ele sai do loop
			int a = i + 1;
			n[i] = Double.parseDouble(t.input("Digite o " + a + "� Valor"));
		}

		// Processamento
		areaQuadrada = n[0] * n[1];

		// tela
		t.output("O calculo da �rea deste quadrado �: " + areaQuadrada);

	}

}

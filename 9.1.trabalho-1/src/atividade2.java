/*2. Escreva um algoritmo que receba 4 valores. Calcule o produto dos dois primeiros e some
com o produto dos dois últimos. Mostre na tela.*/

public class atividade2 {
	
	public static void main(String[] args) {

		Tela t = new Tela();//instanciar o objeto
		double[] n = new double[4]; // instaciar Array
		
		//Variavéis
		double multiplicar1,multiplicar2,soma;
		
		// Caixa de diálogo 
		for (int i = 0; i < n.length;i++) {  //Se o i for maior que o tamanho da matriz, ele sai do loop
			int a = i + 1; // adquando i para a string
			n[i] = Double.parseDouble(t.input("Digite o " + a + "º valor"));
		}
		
		//Processamento
		multiplicar1 = (n[0]*n[1]);// lembrando que array começa em 0
		multiplicar2 = (n[2]*n[3]);
		soma = multiplicar1 + multiplicar2;
		
		//tela
		t.output("A soma das multiplicações é "+ soma);
		
		}
	}
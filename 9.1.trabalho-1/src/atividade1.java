//1. Escreva um algoritmo que receba 3 notas. Calcule a m�dia das notas e mostre na tela.

public class atividade1 {

	public static void main(String[] args) {

		Tela t = new Tela();//instanciar o objeto
		double[] n = new double[3];// instaciar Array
		
		//Variav�is
		double soma = 0, media;
		
		// Caixa de di�logo 
		for (int i = 0; i < n.length;i++) { //Se o i for maior que o tamanho da matriz, ele sai do loop
			int a = i + 1; // adequando i para a string
			n[i] = Double.parseDouble(t.input("Digite a " + a + "� nota"));
		}
		
		//Processamento
		// Ele pega a variavel n, cada item dessa array n ele faz um loop e salva na variavel d. 
		for(double d: n) {
			soma += d;// Soma todos os valores da array dentro da variav�l soma
		}
		
		media = soma /n.length; // media igual a soma / pelo n�mero de notas
		
		//tela
		t.output("A m�dia das "+ n.length + " notas �: " + media);
		
		}
}

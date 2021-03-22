//1. Escreva um algoritmo que receba 3 notas. Calcule a média das notas e mostre na tela.

public class atividade1 {

	public static void main(String[] args) {

		Tela t = new Tela();//instanciar o objeto
		double[] n = new double[3];// instaciar Array
		
		//Variavéis
		double soma = 0, media;
		
		// Caixa de diálogo 
		for (int i = 0; i < n.length;i++) { //Se o i for maior que o tamanho da matriz, ele sai do loop
			int a = i + 1; // adequando i para a string
			n[i] = Double.parseDouble(t.input("Digite a " + a + "ª nota"));
		}
		
		//Processamento
		// Ele pega a variavel n, cada item dessa array n ele faz um loop e salva na variavel d. 
		for(double d: n) {
			soma += d;// Soma todos os valores da array dentro da variavél soma
		}
		
		media = soma /n.length; // media igual a soma / pelo número de notas
		
		//tela
		t.output("A média das "+ n.length + " notas é: " + media);
		
		}
}

//5. Escreva um algoritmo que receba um percentual de desconto e calcule esse desconto
//sobre o pre�o do produto, apresentando o valor do desconto e o novo pre�o do produto.

public class Atividade5 {
	public static void main(String[] args) {
		
		Tela t = new Tela(); // instanciar o objeto
		
		 // Variav�is 
		double produto, resultado,porcentagem;
		
		//Caixa de di�logo
		 produto = Double.parseDouble(t.input("Digite o valor do produto"));
		 porcentagem = Double.parseDouble(t.input("Digite a porcentagem do desconto"));
		 
		 //Processamento 
		 resultado = produto - produto*(porcentagem/100);
		 
		 //tela
		 t.output("O valor fica em R$" + resultado);
	}
	
}


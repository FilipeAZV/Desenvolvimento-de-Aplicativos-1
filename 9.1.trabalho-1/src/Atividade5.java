//5. Escreva um algoritmo que receba um percentual de desconto e calcule esse desconto
//sobre o preço do produto, apresentando o valor do desconto e o novo preço do produto.

public class Atividade5 {
	public static void main(String[] args) {
		
		Tela t = new Tela(); // instanciar o objeto
		
		 // Variavéis 
		double produto, resultado,porcentagem;
		
		//Caixa de diálogo
		 produto = Double.parseDouble(t.input("Digite o valor do produto"));
		 porcentagem = Double.parseDouble(t.input("Digite a porcentagem do desconto"));
		 
		 //Processamento 
		 resultado = produto - produto*(porcentagem/100);
		 
		 //tela
		 t.output("O valor fica em R$" + resultado);
	}
	
}


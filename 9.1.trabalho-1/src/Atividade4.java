//4. Escreva um algoritmo que calcule o desconto de 10% sobre o pre�o de um produto.
//Apresente o novo pre�o na tela.

public class Atividade4 {
	 public static void main(String[] args) {

	      Tela t = new Tela();  // instanciar o objeto
	      
	      // Variav�is 
	      double desconto, valor;
	      
	      //Caixa de di�logo 
	      valor = Double.parseDouble(t.input("Digite o valor"));
	      
	  	// Processamento
	 	 desconto = valor - (valor*0.10);
	 	 
	 	 //tela 
	 	 t.output(valor + " com 10% de desconto fica " + desconto);
	    }
	 
	}


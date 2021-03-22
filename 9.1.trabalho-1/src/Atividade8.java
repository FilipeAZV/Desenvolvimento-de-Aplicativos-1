/*8. Considerando que, para um consórcio, sabe-se o número total de prestações, a
quantidade de prestações pagas e o valor da prestação (fixa), escreva um algoritmo que
mostre o saldo devedor do cliente.*/

public class Atividade8 {

	public static void main(String[] args) {
		
		Tela t = new Tela();// instanciar o objeto
		
		// Variavéis
		double ppagas, pvalor, ptotal, psaldo;
		
		// Caixa de diálogo
		ptotal = Double.parseDouble(t.input("Número total de prestações: "));
		ppagas = Double.parseDouble(t.input("Prestações pagas: "));
		pvalor = Double.parseDouble(t.input("Valor da prestação: "));
		
		// Processamento
		psaldo = (ptotal - ppagas)*(pvalor);
		
		//tela
		t.output("faltam " + (ptotal - ppagas) + " prestações \n Saldo devedor: R$" + psaldo);
	
	}
	
}

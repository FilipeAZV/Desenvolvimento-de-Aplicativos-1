/*8. Considerando que, para um cons�rcio, sabe-se o n�mero total de presta��es, a
quantidade de presta��es pagas e o valor da presta��o (fixa), escreva um algoritmo que
mostre o saldo devedor do cliente.*/

public class Atividade8 {

	public static void main(String[] args) {
		
		Tela t = new Tela();// instanciar o objeto
		
		// Variav�is
		double ppagas, pvalor, ptotal, psaldo;
		
		// Caixa de di�logo
		ptotal = Double.parseDouble(t.input("N�mero total de presta��es: "));
		ppagas = Double.parseDouble(t.input("Presta��es pagas: "));
		pvalor = Double.parseDouble(t.input("Valor da presta��o: "));
		
		// Processamento
		psaldo = (ptotal - ppagas)*(pvalor);
		
		//tela
		t.output("faltam " + (ptotal - ppagas) + " presta��es \n Saldo devedor: R$" + psaldo);
	
	}
	
}

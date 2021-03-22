/*7. Uma sorveteria vende tr�s tipos de picol�s: os de Frutas custam R$2,50, os Cremosos
custam R$ 3,50 e o com Recheados custam R$4,50. Escreva um algoritmo que receba a
quantidade de picol�s vendida de cada tipo e mostre quanto a sorveteria faturou por cada
tipo de picol� e no total de vendas.*/

public class Atividade7 {

	public static void main(String[] args) {

		Tela t = new Tela();// instanciar o objeto

		// Variav�is
		double fruta = 2.50, cremoso = 3.50, recheado = 4.50, qfrutas, qcremosos, qrecheados;
		double tfrutas, tcremosos,trecheados;
		
		// Caixa de di�logo
		t.output("Picol�s de Frutas: \nPre�o: R$" + fruta + "\nPicol�s Cremosos: \nPre�o: R$" + cremoso
				+ "\nPicol�s Recheados: \nPre�o: R$" + recheado + "\n");
		
		qfrutas = Double.parseDouble(t.input("Quantos picol�s de frutas foram vendidos?"));
		qcremosos = Double.parseDouble(t.input("Quantos picol�s de cremosos foram vendidos?"));
		qrecheados = Double.parseDouble(t.input("Quantos picol�s de recheados foram vendidos?"));

		// Processamento
		tfrutas = qfrutas * fruta;
		tcremosos = qcremosos * cremoso;
		trecheados = qrecheados * recheado;
		
		// tela
		t.output("A sorveteria faturou \n" + //\n = enter em uma string, � passado para a pr�xima linha
		"R$" + tfrutas + ": Com a venda dos picol�s de frutas \n" +
		"R$" + tcremosos + ": Com a venda dos picol�s cremosos \n" + 
		"R$" + trecheados + ": Com a venda dos picol�s recheados\n\n" +
		"Totalizando no final do dia um faturamento de R$" + (tfrutas + tcremosos + trecheados));
		
	}

}

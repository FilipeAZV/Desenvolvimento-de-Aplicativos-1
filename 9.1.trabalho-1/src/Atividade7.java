/*7. Uma sorveteria vende três tipos de picolés: os de Frutas custam R$2,50, os Cremosos
custam R$ 3,50 e o com Recheados custam R$4,50. Escreva um algoritmo que receba a
quantidade de picolés vendida de cada tipo e mostre quanto a sorveteria faturou por cada
tipo de picolé e no total de vendas.*/

public class Atividade7 {

	public static void main(String[] args) {

		Tela t = new Tela();// instanciar o objeto

		// Variavéis
		double fruta = 2.50, cremoso = 3.50, recheado = 4.50, qfrutas, qcremosos, qrecheados;
		double tfrutas, tcremosos,trecheados;
		
		// Caixa de diálogo
		t.output("Picolés de Frutas: \nPreço: R$" + fruta + "\nPicolés Cremosos: \nPreço: R$" + cremoso
				+ "\nPicolés Recheados: \nPreço: R$" + recheado + "\n");
		
		qfrutas = Double.parseDouble(t.input("Quantos picolés de frutas foram vendidos?"));
		qcremosos = Double.parseDouble(t.input("Quantos picolés de cremosos foram vendidos?"));
		qrecheados = Double.parseDouble(t.input("Quantos picolés de recheados foram vendidos?"));

		// Processamento
		tfrutas = qfrutas * fruta;
		tcremosos = qcremosos * cremoso;
		trecheados = qrecheados * recheado;
		
		// tela
		t.output("A sorveteria faturou \n" + //\n = enter em uma string, é passado para a próxima linha
		"R$" + tfrutas + ": Com a venda dos picolés de frutas \n" +
		"R$" + tcremosos + ": Com a venda dos picolés cremosos \n" + 
		"R$" + trecheados + ": Com a venda dos picolés recheados\n\n" +
		"Totalizando no final do dia um faturamento de R$" + (tfrutas + tcremosos + trecheados));
		
	}

}

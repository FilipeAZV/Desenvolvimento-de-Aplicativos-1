
public class Main {

	public static void main(String[] args) {
		
		Tela t = new Tela();
		
		Gerente ger = new Gerente();
		Caixa c = new Caixa();
		Vendedor vend = new Vendedor();
		
		ger.setNome("Fernando");
		ger.setCargo("Gerente");
		ger.setMatricula("1");
		ger.setSalario("10000");
		ger.setHorasTrabalhadas("203");
		ger.calcularHoraExtra();

		c.setNome("João");
		c.setCargo("Caixa");
		c.setMatricula("2");
		c.setSalario("2000");
		c.setHorasTrabalhadas("200");
		c.calcularHoraExtra();

		vend.setNome("Daniel");
		vend.setCargo("Vendedor");
		vend.setMatricula("3");
		vend.setSalario("3000");
		vend.setHorasTrabalhadas("190");
		vend.setComissao("100");
		vend.calcularHoraExtra();

		//Processamento
		String texto = "";
		texto += ger.getDados() + "\n\n";
		texto += c.getDados() + "\n\n";
		texto += vend.getDados() + "\n\n";
	
		//tela
		t.output(texto);
		
		
	}
}


public class Vendedor extends Funcionario {

	public Vendedor() {
		
		super();
	}
	private Double comissao;	
	
	public Double getComissao() {
		return comissao;
	}
	public void setComissao(String comissao) {
		this.comissao = Double.parseDouble(comissao);
	}
	
	public void Vender() {
	}
}

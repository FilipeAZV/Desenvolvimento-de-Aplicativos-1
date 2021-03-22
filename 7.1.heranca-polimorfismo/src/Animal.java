
public class Animal {

	// Atributos da classe
	private String especie;
	private Double peso;
	private Double fome;
	private Double valor;
	private int idade;

	// Construtor vazio
	public Animal() {

	}

	//Métodos
	public void emitirSom() {
		
		System.out.println("Animal > Som padrão do animal");
	}
	
	//Get e Set
	public String getEspecie() {
		return this.especie;
	}

	public void setEspecie(String _especie) {
		this.especie = _especie;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public Double getFome() {
		return this.fome;
	}

	public void setFome(Double _fome) {
		this.fome = _fome;
	}

	public Double getValor() {
		return this.valor;
	}

	public void setValor(Double _valor) {
		this.valor = _valor;
	}

	public int getIdade() {
		return this.idade;
	}

	public void setIdade(int _idade) {
		this.idade = _idade;
	}

}

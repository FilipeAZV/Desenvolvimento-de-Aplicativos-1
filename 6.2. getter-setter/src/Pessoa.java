
public class Pessoa {

	// Atributos (Propriedades da classe)

	// String, Double, com letra mai�scula, tem essas letras para que possam ser
	private String nome; // convertidos em parse, para transformar de texto para inteiro, ou casa decimal
	private Integer idade;
	private Double peso;

	// Construtor(Vazio) (Nem sempre vamos usar) (o m�todo exige que a pessoa
	// coloque pelo menos o nome)
	public Pessoa() {

	}

	// Construtor com 1 parametro
	public Pessoa(String nome) {
		this.nome = nome; // this(desta): o nome que est� nesta classe, recebe o que estava por parametro
	}

	// Construtor com todos os parametros
	public Pessoa(String nome, Integer idade, Double peso) {
		this.nome = nome;
		this.idade = idade;
		this.peso = peso;
	}

	// M�todos
	public Boolean votar() {

		boolean podeVotar = false;

		// ESTRUTURA CONDICIONAL (IF ELSE)

		// Verifica se a idade � maior ou igual a 18
		if (this.idade < 16) { // Qual a idade que tem dentro do pote?
			System.out.println("N�o � permitido");
			podeVotar = false;

			// Se a idade for mair ou igual a 18, e for menor que 65
		} else if (this.idade >= 18 && this.idade < 65) { // Else n�o tem condi��o, mas o if else tem pois ir� testar //
															// outro
			System.out.println("Voto obrigat�rio");
			podeVotar = true;

		} else {
			System.out.println("Voto opcional");
			podeVotar = true;
		}

		return podeVotar;

	}

	public Boolean dirigir() {
		// Verifica se a idade � maior ou igual a 18
		if (this.idade >= 18) {
			return true;
		}

		return false;
	}

	// Get == pegar
	// Set == atribuir (verbo) | (Set == conjunto (substantivo)

	// M�todos Getter e Setter (ir na op��o source)
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

}

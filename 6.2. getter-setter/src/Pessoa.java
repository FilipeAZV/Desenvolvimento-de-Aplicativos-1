
public class Pessoa {

	// Atributos (Propriedades da classe)

	// String, Double, com letra maiúscula, tem essas letras para que possam ser
	private String nome; // convertidos em parse, para transformar de texto para inteiro, ou casa decimal
	private Integer idade;
	private Double peso;

	// Construtor(Vazio) (Nem sempre vamos usar) (o método exige que a pessoa
	// coloque pelo menos o nome)
	public Pessoa() {

	}

	// Construtor com 1 parametro
	public Pessoa(String nome) {
		this.nome = nome; // this(desta): o nome que está nesta classe, recebe o que estava por parametro
	}

	// Construtor com todos os parametros
	public Pessoa(String nome, Integer idade, Double peso) {
		this.nome = nome;
		this.idade = idade;
		this.peso = peso;
	}

	// Métodos
	public Boolean votar() {

		boolean podeVotar = false;

		// ESTRUTURA CONDICIONAL (IF ELSE)

		// Verifica se a idade é maior ou igual a 18
		if (this.idade < 16) { // Qual a idade que tem dentro do pote?
			System.out.println("Não é permitido");
			podeVotar = false;

			// Se a idade for mair ou igual a 18, e for menor que 65
		} else if (this.idade >= 18 && this.idade < 65) { // Else não tem condição, mas o if else tem pois irá testar //
															// outro
			System.out.println("Voto obrigatório");
			podeVotar = true;

		} else {
			System.out.println("Voto opcional");
			podeVotar = true;
		}

		return podeVotar;

	}

	public Boolean dirigir() {
		// Verifica se a idade é maior ou igual a 18
		if (this.idade >= 18) {
			return true;
		}

		return false;
	}

	// Get == pegar
	// Set == atribuir (verbo) | (Set == conjunto (substantivo)

	// Métodos Getter e Setter (ir na opção source)
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

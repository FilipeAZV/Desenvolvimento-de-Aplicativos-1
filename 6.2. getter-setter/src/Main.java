
public class Main {

	public static void main(String[] args) {

		// Cria um objeto da classe tela
		Tela tela = new Tela();

		// Usuário informa os dados, o método abaixo converte de String para int
		String nome = tela.pegarDados("o nome");
		int idade = Integer.parseInt(tela.pegarDados("a idade"));
		double peso = Double.parseDouble(tela.pegarDados("o peso"));

		// Cria um objeto da classe pessoa (3 tipos)
		// Pessoa p1 = new Pessoa(); // TIPO(Pessoa), NOME(p1), VALOR(new Pessoa();)
		// Pessoa p2 = new Pessoa("Ana");
		// Pessoa p3 = new Pessoa("Maria", 18, 63.5);
		Pessoa p3 = new Pessoa(nome, idade, peso);

		// Colocando valor dentro do p1
		// p1.setNome("Pedro");// Atribui o nome, traz ele, atribui a um nome
		// System.out.println(p1.getNome()); // agora eu quero mostrar o nome (Console)
		// System.out.println(p2.getNome());

		System.out.println("Nome " + p3.getNome() + "\nIdade: " + p3.getIdade() + "\nPeso " + p3.getPeso());

		// Votar (Chamar os métodos)
		// boolean é primitivo, usamos quando não é necessário fazer validações e
		// conversões.
		System.out.println("Pode votar? " + p3.votar());
		Boolean voto2 = true; // Boolean é uma classe, com B maiusculo aceita conversões para String e outras
								// validações

		// Dirigir
		System.out.println("Pode dirigir? " + p3.dirigir());

	}

}

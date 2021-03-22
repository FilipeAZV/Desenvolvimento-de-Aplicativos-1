
public class Main {
	
	public static void main(String[] args) {
		
		// Cria um objeto da classe pessoa
		Pessoa p = new Pessoa();

		// Preenche os dados da pessoa
		p.nome = "Filipe";
		p.idade = 20;
		p.email = "filipeazevedomoraes@gmail.com";
		p.sobrenome = "Azevedo";

		// Mostra a mensagem de boas vindas, void não tem return pois simplesmente chega e escreve essa frase, e pronto (telinha)
		p.falar("Bem-vindo(a) " + p.nome + " " + p.sobrenome);
		p.falar("E-mail " + p.email);
		p.falar("Idade " + p.idade);

		// Cria uma variavél para receber a resposta, o retorno vai ser guardado na comida
		String comida = p.comer();
		
		// Mostra a resposta
		p.falar("Almoço: " + comida);
	}

}

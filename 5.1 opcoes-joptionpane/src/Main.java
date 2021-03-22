
public class Main {

	public static void main(String[] args) {
		//Criando o objeto da classe tela
		
		Tela tela = new Tela();
		//Classe = Tela
		//Variavél = tela 
		
		// 0. Exemplo básico
		//tela.mostrar();
		
		//1. Mostrar Mensagem 
		String mensagem = "Hello World";
		String titulo = "Título da Janela";
		int numeroIcone = 1;
		
		tela.mostrarMensagem(mensagem, titulo, numeroIcone);
		tela.mostrarMensagem("Mensagem manual", "Título", 0);
		
		//2. Cadastrar Contato
		String nome = tela.informaDados("nome");
		String email = tela.informaDados("e-mail");
		String idade = tela.informaDados("idade");
		
		try {
			int idade2 = Integer.parseInt(idade);
		} catch (Exception e) {
			tela.mostrarMensagem("Informe apenas números na idade", "Idade inválida", 0);
		}
		
		tela.mostrarMensagem(nome, "Nome", 2);
		tela.mostrarMensagem(email, "E-mail", 2);
		tela.mostrarMensagem(idade, "Idade", 0);
		
		// 3. Confirmar Sair
		Integer sair = tela.confirmarSair();
		
		tela.mostrarMensagem(sair.toString(), "Saindo?", 3);
		
		
	}
}

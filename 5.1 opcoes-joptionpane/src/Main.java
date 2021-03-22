
public class Main {

	public static void main(String[] args) {
		//Criando o objeto da classe tela
		
		Tela tela = new Tela();
		//Classe = Tela
		//Variav�l = tela 
		
		// 0. Exemplo b�sico
		//tela.mostrar();
		
		//1. Mostrar Mensagem 
		String mensagem = "Hello World";
		String titulo = "T�tulo da Janela";
		int numeroIcone = 1;
		
		tela.mostrarMensagem(mensagem, titulo, numeroIcone);
		tela.mostrarMensagem("Mensagem manual", "T�tulo", 0);
		
		//2. Cadastrar Contato
		String nome = tela.informaDados("nome");
		String email = tela.informaDados("e-mail");
		String idade = tela.informaDados("idade");
		
		try {
			int idade2 = Integer.parseInt(idade);
		} catch (Exception e) {
			tela.mostrarMensagem("Informe apenas n�meros na idade", "Idade inv�lida", 0);
		}
		
		tela.mostrarMensagem(nome, "Nome", 2);
		tela.mostrarMensagem(email, "E-mail", 2);
		tela.mostrarMensagem(idade, "Idade", 0);
		
		// 3. Confirmar Sair
		Integer sair = tela.confirmarSair();
		
		tela.mostrarMensagem(sair.toString(), "Saindo?", 3);
		
		
	}
}

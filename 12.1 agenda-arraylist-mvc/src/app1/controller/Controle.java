package app1.controller;

import app1.model.Agenda;
import app1.model.Contato;
import app1.view.Tela;
import app1.view.Tela;

public class Controle {

	// Cria os objetos das classes
	Tela tela = new Tela();
	Agenda agenda = new Agenda();
	
	// Método usado para iniciar o Aplicativo
	public void iniciarAplicativo() {
		
		// Ativa o Sistema
		boolean menuPrincipal = true;
		
		while (menuPrincipal) {
			
			// Menu
			String opcaoEscolhida = this.tela.montarMenu();
			
			// Chama o método conforme a opção escohida
			switch (opcaoEscolhida) {
			
				case "0":
					//menuPrincipal = false; // modo simples
					menuPrincipal = confirmarSair();
					break;
					
				case "1":
					// Cadastrar
					cadastrar();
					break;
					
				case "2":
					// Buscar
					buscar();
					break;
					
				case "3":
					// Editar
					editar();
					break;
					
				case "4":
					// Escluir
					excluir();
					break;
					
				default:
					this.tela.mostrarMensagem("Escolha uma das opções do menu", "Atenção", 2);
			}
		}
	} // fecha o método iniciarAplicativo
	
	private void cadastrar() {
		String titulo	= "Cadastro de Contato";
		String nome		= this.tela.receberDados("Informe o nome", titulo, 1);
		String idade	= this.tela.receberDados("Informe a idade", titulo, 1);
		String salario	= this.tela.receberDados("Informe o salário", titulo, 1);
		
		// Converte os valores numéricos
		try {
			int _idade		= Integer.parseInt(idade);
			double _salario	= Double.parseDouble(salario);
			
			// Cria um objeto da classe Contato
			Contato contato = new Contato(nome, _idade, _salario);
			
			// Envia os dados para serem cadastrados no Sistema
			String mensagem = this.agenda.cadastrarContatoService(contato);
			
			// Mostra o resultado
			this.tela.mostrarMensagem(mensagem, "Cadastro", 2);
			
		} catch (Exception e) {
			this.tela.mostrarMensagem("Informe apenas números", "Atenção", 2);
		}
	} // fecha o método cadastrar
	
	private void buscar() {
		String resultadoDaBusca = this.agenda.buscarContatoService();
		this.tela.mostrarMensagem(resultadoDaBusca, "Contatos", 1);
	} // fecha o método buscar
	
	private void editar() {
		buscar();
		
		String id = this.tela.receberDados("Informe o ID para editar", "Editar", 1);
		String novoNome = this.tela.receberDados("Informe o novo nome", "Editar", 1);
		String novaIdade = this.tela.receberDados("Informe a nova idade", "Editar", 1);
		String novoSalario = this.tela.receberDados("Informe o novo salário", "Editar", 1);
		
		// Converte os valores numéricos
		try {
			int _id				= Integer.parseInt(id);
			int _novaIdade		= Integer.parseInt(novaIdade);
			double _novoSalario	= Double.parseDouble(novoSalario);
			
			// Cria um objeto da classe Contato
			Contato contato = new Contato(novoNome, _novaIdade, _novoSalario);
			
			// Envia os dados para serem atualizados no Sistema
			String mensagem = this.agenda.editarContatoService(contato, _id);
			
			// Mostra o resultado
			this.tela.mostrarMensagem(mensagem, "Editar", 3);
			
		} catch(Exception e) {
			this.tela.mostrarMensagem("Informe apenas números", "Atenção", 2);
		}
		
	} // fecha o método editar
	
	private void excluir() {
		buscar();
		String id = this.tela.receberDados("Informe o ID para excluir", "Excluir", 1);
		
		try {
			int _id = Integer.parseInt(id);
			
			// Envia os dados para serem atualizados no Sistema
			String mensagem = this.agenda.excluirContatoService(_id);
			
			// Mostra o resultado
			this.tela.mostrarMensagem(mensagem, "Excluir", 3);
			
		} catch (Exception e) {
			this.tela.mostrarMensagem("Informe apenas números", "Atenção", 2);
		}
		
	} // fecha o método excluir
	
	// Confirmar Sair do Sistema
	private Boolean confirmarSair() {
		
		int sair = this.tela.confirmarMensagem("Tem certeza?", "Encerrar Sistema", 3);
		
		//System.out.println("Retorno do YES NO: " + sair);
		
		if (sair == 0) {
			this.tela.mostrarMensagem("Encerrando o Sistema...", "Encerrando", 1);
			return false;
		}
		
		return true;
		
		/*
		// IF Ternário (O mesmo teste que foi usado acima com o IF)
		
		// Quem recebe;	Condição; SE 	  : SENÃO
		boolean menu = 	sair == 0 ? false : true;
		
		return menu;
		*/
	} // fecha o método confirmarSair
}

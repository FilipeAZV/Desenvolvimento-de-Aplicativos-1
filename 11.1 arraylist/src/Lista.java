import java.util.ArrayList;
import java.util.List;

public class Lista {

	public void cadastrar() {
		Tela tela = new Tela();
		
		//renomeia os dados das variavéis abaixo, pode ser reutilizado:
		String titulo = "Cadastro"; 
		int icone = -1;
		
		//Dados que iremos usar
		/*String nome = tela.receberDados("Informe o nome", titulo, icone);
		
		List<String> listaContato = new ArrayList<>(); // (capa da lista) ele vai pegar uma lista com Strings dentro
		listaContato.add(nome);*/
		
		//tela
		//Tela.mostrarMensagem("Nome: " + listaContato.get(0), titulo, icone);
	
		//exemplos com mais dados: 
		String nome = tela.receberDados("Informe o nome", titulo, icone);
		String email = tela.receberDados("Informe o e-mail", titulo, icone);
		String senha = tela.receberDados("Informe a senha", titulo, icone);

		List<String> listaContato = new ArrayList<>(); // (capa da lista) ele vai pegar uma lista com Strings dentro
		listaContato.add(nome);//
		listaContato.add(email);
		listaContato.add(senha);
		
		Tela.mostrarMensagem("Nome: " + listaContato.get(0), titulo, icone);
		Tela.mostrarMensagem("E-mail: " + listaContato.get(1), titulo, icone);
		Tela.mostrarMensagem("Senha: " + listaContato.get(2), titulo, icone);
	}
}

package app1.model;

import java.util.ArrayList;
import java.util.List;

public class Agenda {

	// Cria a lista de Contatos (Agenda) [GLOBAL]
	List<Contato> listaContato = new ArrayList<>();
	
	public String cadastrarContatoService(Contato contato) {
		
		// Verifica se os campos estão preenchidos
		if (contato.getNome().equals("")) {
			return "O campo Nome é obrigatório";
		}
		
		// Adiciona o Contato na Agenda
		listaContato.add(contato);
		
		return "Cadastro efetuado com sucesso!";
		
	} // fecha o método cadastrarContatoService
	
	public String buscarContatoService() {
		
		// Guarda os valores buscados
		String resultado = "";
		
		// Guarda o tamanho da lista (quantidade de registros) 
		int tamanhoLista = listaContato.size();
		
		// Verifica se há registro na lista
		if (tamanhoLista > 0) {
			
			// Percorre a lista
			for (int i = 0; i < tamanhoLista; i++) {
				String contato = "ID: " + (i + 1) +
						"\nNome: " + listaContato.get(i).getNome() +
						"\nIdade: " + listaContato.get(i).getIdade() +
						"\nSalário: " + listaContato.get(i).getSalario() +
						"\n\n-----\n";
				
				// Concatena com o resultado (se houver mais de 1)
				resultado += contato;
				//resultado = resultado + contato; (o mesmo que a linha acima)
			}
		
		} else {
			return "Nenhum resultado encontrado.";
		}
		
		return resultado;
		
	} // fecha o método buscarContatoService
	
	public String editarContatoService(Contato contato, int id) {
		
		// Atualiza a lista (ArrayList)
		listaContato.get(id -1).setNome(contato.getNome());
		listaContato.get(id -1).setIdade(contato.getIdade());
		listaContato.get(id -1).setSalario(contato.getSalario());
		
		return "Cadastro editado com sucesso";
	}
	
	public String excluirContatoService(int id) {
		listaContato.remove(id -1);
		
		return "Cadastro excluído com sucesso";
	}
}

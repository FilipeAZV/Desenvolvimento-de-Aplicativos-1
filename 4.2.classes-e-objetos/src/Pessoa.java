import javax.swing.JOptionPane;

public class Pessoa {
    
	// Atributos da classe (Variavéis)
    public String nome;
    public int idade;
    public String email;
    public String sobrenome;

    // Métodos (ações), manda a mensagem
    public void falar(String mensagem) {
        
    	// Mostra uma mensagem de boas vindas
        System.out.println(mensagem);

        // JOPionPane = usado para fazer os retornos do void, entrega a mensagem (Telinhas)
        JOptionPane.showMessageDialog(null, mensagem);
    }

    public String comer() {
        
    	// Pergunta o que a pessoa comeu
    	return JOptionPane.showInputDialog("O que tu comeu no almoço?");
    }
}

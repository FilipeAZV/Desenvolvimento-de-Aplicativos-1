//o conceito é, pegar uma classe principal, para que as demais classes possam tilizarar, tirando dela todas as c


public class Main {

	public static void main(String[] args) {

		// Cria um objeto da classe Animal
		/*Animal animal = new Animal();

		animal.setValor(225.0);
		System.out.println("Animal > Preço " + animal.getValor());
		animal.emitirSom();*/

		// 2 formas de manipular os dados herdados: 
		
		//(classe super) Tanto faz criar da classe animal e dizer que é cachorro, pegar direto da classe mãe
		Animal cachorro1 = new Cachorro();
		cachorro1.setValor(150.0);
		System.out.println("Animal > preço: " + cachorro1.getValor());
		cachorro1.emitirSom();
		
		// (melhor jeito) Ou criar com a classe cachorro, pois ela vai herdar da Animal
		Cachorro cachorro2 = new Cachorro();
		cachorro2.setValor(350.0);
		System.out.println("Animal > preço: " + cachorro2.getValor());
		cachorro2.emitirSom();
		
		Vaca vaca = new Vaca();
		vaca.setEspecie("Jersey");
		System.out.println("Vaca > raça: " + vaca.getEspecie());
		//Sempre pegar o som* do objeto a ser usado
		vaca.emitirSom();
		
		Animal pato = new Pato();
		pato.setIdade(3000);
		System.out.println("Pato > idade " + pato.getIdade());
		pato.emitirSom();
	}
}













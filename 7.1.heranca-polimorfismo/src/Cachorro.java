
//extends significa que ela irá estender alguma classe, herdar seu conteúdo
public class Cachorro extends Animal {

	// Método vindo da super classe e sobrescrito
	@Override // crtl+espaço, sobescrita
	public void emitirSom() {
		System.out.println("Cachorro > Au au");

	}

}

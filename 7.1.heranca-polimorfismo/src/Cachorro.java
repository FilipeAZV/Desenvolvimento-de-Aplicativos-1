
//extends significa que ela ir� estender alguma classe, herdar seu conte�do
public class Cachorro extends Animal {

	// M�todo vindo da super classe e sobrescrito
	@Override // crtl+espa�o, sobescrita
	public void emitirSom() {
		System.out.println("Cachorro > Au au");

	}

}

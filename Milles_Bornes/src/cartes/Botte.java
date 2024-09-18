package cartes;

public class Botte extends Probleme {

	public Botte(Type t) {
		super(t);
	}
	
	@Override
	public String toString() {
		return type.getBotte();
	}

}

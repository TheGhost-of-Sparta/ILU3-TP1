package cartes;

public class Attaque extends Bataille {

	public Attaque(Type t) {
		super(t);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return type.getAttaque();
	}

}

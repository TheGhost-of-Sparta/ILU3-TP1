package cartes;

public class Parade extends Bataille {

	public Parade(Type t) {
		super(t);
	}

	@Override
	public String toString() {
		return type.getParade();
	}

	
}

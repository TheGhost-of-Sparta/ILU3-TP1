package cartes;

public enum Type {
	FEU("FeuvRouge","Feu Vert", "Vehicule Prioritaire"),
	ESSENCE("Panne d'Essence","Essence","Citerne d'Essence"),
	CREVAISON("Crevaison","Roue de Secours","Increvable"),
	ACCIDENT("Accident","Reparation","As Du Volant");
	
	private final String attaque;
	private final String parade;
	private final String botte;
	
	Type(String attaque, String parade, String botte){
		this.botte=botte;
		this.parade=parade;
		this.attaque=attaque;
	}

	public String getAttaque() {
		return attaque;
	}

	public String getParade() {
		return parade;
	}

	public String getBotte() {
		return botte;
	}
	
	
}


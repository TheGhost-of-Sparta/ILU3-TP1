package cartes;

public enum Type {
	FEU("FeuRouge","FeuVert", "VehiculePrioritaire"),
	ESSENCE("PanneEssence","Essence","CiterneEssence"),
	CREVAISON("Crevaison","RoueSecours","Increvable"),
	ACCIDENT("Accident","Reparation","AsDuVolant");
	
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


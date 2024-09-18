package cartes;

public class Configuration {
	int nbExemplaire;
	Carte carte;
	
	public Configuration(Carte carte, int nbExemplaire) {
		this.carte=carte;
		this.nbExemplaire=nbExemplaire;
	}
	
	public int getNbExemplaire() {
		return nbExemplaire;
	}
	
	public Carte getCarte(){
		return carte;
	}

}

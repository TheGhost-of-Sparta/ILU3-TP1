package cartes;

public class JeuDeCartes {
	private Configuration[] jeuDeCarte= new Configuration[19];
	private int nbcartes=0;
	public JeuDeCartes() {
	}
	
	public void affichageJeuDeCartes() {
		for(int i = 0; i<nbcartes;i++) {
			System.out.println(jeuDeCarte[i].getNbExemplaire() + " " + jeuDeCarte[i].getCarte().toString());
		}
	}
	
	public void ajouterCarte(Carte carte, int nbExemplaire) {
		if (nbcartes<19) {
			jeuDeCarte[nbcartes]=new Configuration(carte,nbExemplaire);
			nbcartes++;
		}
	}

}

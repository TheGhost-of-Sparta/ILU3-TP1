package TestFonctionnel;
import cartes.*;

public class TestJeuDeCartes {

	public static void main(String[] args) {
		JeuDeCartes jeuDeCartes= new JeuDeCartes();
		jeuDeCartes.ajouterCarte(new Attaque(Type.FEU), 5);
		jeuDeCartes.ajouterCarte(new Attaque(Type.ACCIDENT), 5);
		jeuDeCartes.ajouterCarte(new Attaque(Type.CREVAISON), 5);
		jeuDeCartes.ajouterCarte(new Attaque(Type.ESSENCE), 5);
		jeuDeCartes.ajouterCarte(new Parade(Type.FEU), 5);
		jeuDeCartes.ajouterCarte(new Parade(Type.ACCIDENT), 5);
		jeuDeCartes.ajouterCarte(new Parade(Type.CREVAISON), 5);
		jeuDeCartes.ajouterCarte(new Parade(Type.ESSENCE), 5);
		jeuDeCartes.ajouterCarte(new Botte(Type.FEU), 5);
		jeuDeCartes.ajouterCarte(new Botte(Type.ACCIDENT), 5);
		jeuDeCartes.ajouterCarte(new Botte(Type.CREVAISON), 5);
		jeuDeCartes.ajouterCarte(new Botte(Type.ESSENCE), 5);
		jeuDeCartes.ajouterCarte(new Borne(25), 5);
		jeuDeCartes.ajouterCarte(new Borne(50), 5);
		jeuDeCartes.ajouterCarte(new Borne(75), 5);
		jeuDeCartes.ajouterCarte(new Borne(100), 5);
		jeuDeCartes.ajouterCarte(new Borne(200), 5);
		jeuDeCartes.ajouterCarte(new FinLimite(), 5);
		jeuDeCartes.ajouterCarte(new DebutLimite(), 5);
		jeuDeCartes.affichageJeuDeCartes();
		
		

		

	}

}

package jeu;
import cartes.*;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class Sabot implements Iterable<Carte>{
	private int nbCartes;
	private Carte[] tableau;
	private int nombreOperations=0;

	public Sabot(Carte[] tab) {
		tableau= tab;
	}
	
	public boolean estVide() {
		return nbCartes==0;
	}
	
	public void ajouterCarte(Carte carte) {
		if(nbCartes<tableau.length) {
			tableau[nbCartes]= carte;
			nbCartes++;
			nombreOperations++;
		}
	}
	
	public Carte piocher() {
		Iterator<Carte> Iterateur = iterator();
		Carte carte =Iterateur.next();
		Iterateur.remove();
		return carte;
	}
	
	public Iterator<Carte> iterator() {
        return new SabotIterator();
    }
	
	private class SabotIterator implements Iterator<Carte> {
        private int index = 0;
        private boolean nextEffectue=false;
        private int nombreOperationReference=nombreOperations;
        
        @Override
        public void remove() {
        	verifierConcurrence();
        	if (nextEffectue) {
        		for(int i = index-1; i<nbCartes;i++) {
        			tableau[i]=tableau[i+1];
        		}
        		nbCartes--;
        		nombreOperationReference++;nombreOperations++;
        		nextEffectue=false;
        	}else {
        		throw new IllegalStateException();
        	}
        }
        
        public void verifierConcurrence() {
        	if (nombreOperations != nombreOperationReference) {
        		 throw new ConcurrentModificationException();
        	}
        }

        @Override
        public boolean hasNext() {
            return index < nbCartes;
        }

        @Override
        public Carte next() {
        	verifierConcurrence();
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            nombreOperationReference++;nombreOperations++;
            this.nextEffectue=true;
            return tableau[index++];
        }
    }

}

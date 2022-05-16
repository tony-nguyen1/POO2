package assertionsExceptions;

import java.util.ArrayList;

public class Pile implements IPile{
		// structure de stockage interne des elements
		private ArrayList<Object> elements;
		
		// Mise en oeuvre des operations
		public Pile() throws PileBorneeTailleMaxPlusPetiteQueTailleException, PileBorneeTailleMaxNegException{
			initialiser();
		}
		
		public Object depiler() throws PileVideException{//sauf les RunTimeException
			if (this.estVide())
				throw new PileVideException("en dépilant");
			
			int nbAvant = elements.size();
			
			Object sommet = elements.get(elements.size()-1);
			elements.remove(sommet);
			
			assert nbAvant-1==elements.size() : "changement de taille incorrecte";
			
			return sommet;
		}
		
		public void empiler(Object t) throws PileVideException, PileBorneePleineException{
			int nbAvant = taille();
			System.out.println("nbAvant"+nbAvant);
			elements.add(t);
			System.out.println("nbAprès"+taille());
			//assert this.sommet()==t : "dernier empile ="+this.sommet();
			assert this.sommet()==t : "dernier empile ="+this.sommet();
			assert nbAvant+1==taille() : "changement de taille incorrecte";
		}
		
		public boolean estVide() {return elements.isEmpty();}
		
		public void initialiser() throws PileBorneeTailleMaxPlusPetiteQueTailleException, PileBorneeTailleMaxNegException {
			elements = new ArrayList<>();
			assert this.estVide();
		}
		
		public Object sommet() throws PileVideException{
			if (this.estVide())
				throw new PileVideException("en dépilant");
			return elements.get(elements.size()-1);
		}
		
		public int taille(){return elements.size();}
		
		public String toString(){return "Pile = "+ elements;}

}

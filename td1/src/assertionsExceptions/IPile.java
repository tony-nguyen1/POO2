package assertionsExceptions;

public interface IPile {
	void initialiser() throws PileBorneeTailleMaxNegException, PileBorneeTailleMaxPlusPetiteQueTailleException;;	
	void empiler(Object t) throws PileVideException, PileBorneePleineException;;
	Object depiler()throws PileVideException;;
	Object sommet() throws PileVideException;
	boolean estVide();
	int taille();
}

package assertionsExceptions;

import java.util.ArrayList;

public class PileBornee extends Pile implements IPileBornee {
	private ArrayList<Object> elements;
	private int tailleMax;
	
	public PileBornee() throws PileBorneeTailleMaxPlusPetiteQueTailleException, PileBorneeTailleMaxNegException {
		super();
	}

	public void initialiser() throws PileBorneeTailleMaxPlusPetiteQueTailleException, PileBorneeTailleMaxNegException {
		super.initialiser();
		setTailleMax(10);
		assert getTailleMax() >= 0;
		System.out.println("initialisation de PileBornee");
	}

	public void empiler(Object t) throws PileVideException, PileBorneePleineException{

		if (taille() >= getTailleMax()) { throw new PileBorneePleineException(); }
		else {
			super.empiler(t);
		}
		assert taille() <= getTailleMax();
	}

	@Override
	public void setTailleMax(int max)
			throws PileBorneeTailleMaxPlusPetiteQueTailleException, PileBorneeTailleMaxNegException {
		if (max < 0) throw new PileBorneeTailleMaxNegException(max+" est négatif");
		if (max < taille()) throw new PileBorneeTailleMaxPlusPetiteQueTailleException(max+" plus petit que "+taille());
		
		tailleMax = max;
	}

	@Override
	public int getTailleMax() { return tailleMax; }

}

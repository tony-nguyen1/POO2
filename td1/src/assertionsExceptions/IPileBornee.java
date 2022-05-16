package assertionsExceptions;

public interface IPileBornee extends IPile{
	void setTailleMax(int max) throws PileBorneeTailleMaxPlusPetiteQueTailleException, PileBorneeTailleMaxNegException;
	int getTailleMax();
}

package td6_Arbres;

public interface ArbreBinaireDecisionEtiquetee <E> {
	public ArbreBinaireDecisionEtiquetee<E> sousArbreVrai();
	public ArbreBinaireDecisionEtiquetee<E> sousArbreFaux();
	public boolean estVide();
	public default boolean estFeuille() { return sousArbreVrai() == null && sousArbreFaux() == null; }
	public E getEtiquette() throws Exception;
	public String toString();
}

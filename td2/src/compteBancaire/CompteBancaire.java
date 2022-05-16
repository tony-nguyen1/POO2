package compteBancaire;

public interface CompteBancaire {
	public abstract float getSolde();
	public abstract void setSolde(float newSolde);
	public default void fermer() { System.out.println("Solde: "+getSolde()); }
}

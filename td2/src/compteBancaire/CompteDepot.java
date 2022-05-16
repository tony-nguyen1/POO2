package compteBancaire;

public interface CompteDepot extends CompteBancaire {
	default void fermer() {
		setSolde(getSolde()-100);
	}
}

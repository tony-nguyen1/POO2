package compteBancaire;

public interface CompteRemunere extends CompteBancaire {
	default void fermer() { 
		setSolde(getSolde()*1.1f);
		CompteBancaire.super.fermer();
	}
}

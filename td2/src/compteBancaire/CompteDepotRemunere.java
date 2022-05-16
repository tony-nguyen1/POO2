package compteBancaire;

public interface CompteDepotRemunere extends CompteRemunere, CompteDepot{

	//obliger de redéfinir
	@Override
	default void fermer() {
		// TODO Auto-generated method stub
		CompteDepot.super.fermer();
		CompteRemunere.super.fermer(); //doit ajouter nom de l'interface, car pottentiellement 
	}
}

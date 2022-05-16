package compteBancaire;

public class CDR implements CompteDepotRemunere {
	private float solde;
	

	@Override
	public float getSolde() { return solde; }
	@Override
	public void setSolde(float newSolde) { solde = newSolde; }

}

package assertionsExceptions;

public class Personne {
	private int anneeNaissance;
	private boolean vivant;
	private boolean majeur;
	private Personne[] parents;
	
	public Personne(int anneeNaissance, boolean vivant) throws Exception {
		setAnneeNaissance(anneeNaissance);
		this.vivant = vivant;
		parents = new Personne[2]; //tableau de 2 personne
	}
	
	public void setAnneeNaissance(int i) throws Exception {
		if (i <= 1900) {
			throw new Exception("annee de naissance doit être supérieur à 190 ");
		}
		
		anneeNaissance = i;
		assert anneeNaissance > 1900 : "è_é";

		majeur = isMajor(i);
		assert majeur == 2022 - i >= 18;
	}
	
	public static boolean isMajor(int anneeNaissance) {
		if (2022 - anneeNaissance >= 18) {
			return true;
		}
		return false;
	}
	
	public int getAge() { return 2022 - anneeNaissance; }
	
	private void setParent(Personne p, int i) throws Exception {
		if (p == this) {
			throw new Exception("parent == enfant");
		} else if (p.getAge() <= 16) {
			throw new Exception("parent trop jeune");
		}
			
		parents[i] = p;
	}
	
	public void setPere(Personne pere) throws Exception {
		setParent(pere, 0);
		assert pere != this && pere.getAge() > 16 : "pere == this || trop jeune";
	}
	
	public void setMere(Personne mere) throws Exception {
		setParent(mere, 1);
		assert mere != this && mere.getAge() > 16 : "mere == this || trop jeune";
	}

}

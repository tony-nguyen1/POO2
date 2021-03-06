package assertionsExceptions;

public class AppPersonne {

	public static void main(String[] args) throws Exception{
		Personne P1 = new Personne(1980, true);
		Personne M1 = new Personne(1982, true);
		
		Personne enfant = new Personne(2020, true);
		
		enfant.setPere(P1);
		enfant.setMere(M1);
		
		System.out.println("Jusqu'ici, tout va bien.");
		
		try {
			enfant.setAnneeNaissance(1899);
		} catch (Exception e) {
			System.out.println("Ça a lancé une erreur, c'est ce qu'on voulait");
			e.printStackTrace();
		}
		
		try {
			enfant.setPere(new Personne(2019, true));
		} catch (Exception e) {
			System.out.println("Ça a lancé une erreur, c'est ce qu'on voulait");
			e.printStackTrace();
		}
		
		try {
			enfant.setPere(enfant);
		} catch (Exception e) {
			System.out.println("Ça a lancé une erreur, c'est ce qu'on voulait");
			e.printStackTrace();
		}
	}

}

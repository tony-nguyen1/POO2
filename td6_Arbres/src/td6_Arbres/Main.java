package td6_Arbres;

public class Main {

	public static void main(String[] args) throws Exception {
		ADB<String> A = new ADB<String>("Poils", 
					new ADB<String>("mamifère"), 
					new ADB<String>("Poisson/reptile"));
		
		A = new ADB<String>("Plumes",
				new ADB<String>("oiseau"),
				A);
//		System.out.println(A);
		
		ADB<String> B = new ADB<String>("Coquille", 
				new ADB<String>("mollusque"),
				new ADB<String>("arthropode"));
//		System.out.println(B);
		
		ADB<String> aTree = new ADB<String>("Vertébré",A,B);
		System.out.println(aTree);
		
		System.out.println("Etiquette de la racine :");
		System.out.println(aTree.getEtiquette().toString());
		
		System.out.println("oiseau feuille ???");
		System.out.println(aTree.sousArbreVrai().sousArbreVrai().estFeuille());
		
		///////////////////////////////////////////////////////////////////////
		
		ADB<String> D400 = new ADB<String>("divisible par 400", new ADB<String>("2000"), new ADB<String>("1900"));
		System.out.println(D400);
		
		ADB<String> D100 = new ADB<String>("divisible par 100", D400, new ADB<String>("2008"));
		System.out.println(D100);
		
		ADB<String> D4 = new ADB<String>("divisible par 4", D100, new ADB<String>("Non-bisextile"));
		System.out.println(D4);
		
		System.out.println("\"Coquille\" dans larbre");
		System.out.println(aTree.recherche("Coquille"));
		
		System.out.println("Nombre de noeuds interne :");
		System.out.println(aTree.nbNoeuds());
		System.out.println();
		
//		aTree.rechercheClasse();
		aTree.printClean();
		System.out.println();
		
		
		System.out.println("Parcours en largeur");
		aTree.parcoursLarge();
		System.out.println();System.out.println();
		
		System.out.println("Parcours postfixe");
		aTree.parcoursPostfixe();
		System.out.println(); System.out.println();
		
		System.out.println("Parcours suffixe");
		aTree.parcoursInfixe();
		System.out.println();
		
	}
}

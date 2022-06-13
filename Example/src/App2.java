
public class App2 {

	public static void main(String[] args) {
		
		Classe classe2022 = new Classe();
		
		classe2022.prof = new Personne("Tony");
		classe2022.assistant = new Personne("Romain");
		classe2022.eleve1 = new Personne("Mouss");
		classe2022.eleve2 = new Personne("Mehdi");
		
		for (Personne p : classe2022) {
			System.out.println(p);
		}
		
		System.out.println("///////////////////////////////////");
		
		ClasseIterator test = new ClasseIterator(classe2022);
		while (test.hasNext()) {
			System.out.println(test.next());
		}
	}

}

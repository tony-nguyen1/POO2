import java.util.Iterator;

public class ClasseIterator implements Iterator<Personne> {
	
	private int i = 0;
	private Classe maClasse;
	
	
	public ClasseIterator(Classe maClasse) {
		this.maClasse = maClasse;
	}

	@Override
	public boolean hasNext() {
		if (i > 3) { return false; }
		else { return true; }
	}

	@Override
	public Personne next() {
		Personne answer = null;
		if (i == 0) {
			answer = maClasse.prof;
		} else if (i == 1) {
			answer = maClasse.assistant;
		}else if (i == 2) {
			answer = maClasse.eleve1;
		}else { // i == 3
			answer = maClasse.eleve2;
		}
		
		i++;
		
		return answer;
	}

}

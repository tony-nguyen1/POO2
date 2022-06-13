import java.util.Iterator;

public class Classe implements Iterable<Personne> {
	public Personne prof;
	public Personne assistant;
	public Personne eleve1;
	public Personne eleve2;
	
	@Override
	public Iterator<Personne> iterator() {
		return new ClasseIterator(this);
	}

}

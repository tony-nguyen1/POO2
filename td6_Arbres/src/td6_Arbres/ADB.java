package td6_Arbres;

//Java program to demonstrate BufferedReader
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class ADB<E> implements ArbreBinaireDecisionEtiquetee<E>{
	private E etiquette;
	private ADB<E> vrai, faux;
	
	
	
	public ADB(E etiquette) {
		super();
		this.etiquette = etiquette;
		this.vrai = null;
		this.faux = null;
	}

	public ADB(E etiquette, ADB<E> vrai, ADB<E> faux) throws Exception, IOException {
		if ( (etiquette==null && (vrai != null || faux != null))
		|| (vrai == null && faux == null)) {
			throw new Exception("Arbre abominable");
		} else {
			this.etiquette = etiquette;
			this.vrai = vrai;
			this.faux = faux;
		}
	}

//	public ADB composer(E étiquette, ADB vrai, ADB faux) { 
//		this.vrai = vrai;
//		this.faux = faux;
//		
//		return this; 
//	}
	
	public ADB<E> sousArbreVrai() { return vrai; }
	
	public ADB<E> sousArbreFaux() { return faux; }
	
	public boolean estVide() { return etiquette == null; }

	public boolean estFeuille() { 
		return this.sousArbreVrai()==null && this.sousArbreFaux()==null;
	}
	
	public E getEtiquette() { return etiquette; }
	
	@Override
	public String toString() {
		if (estVide()) return "EMPTY";
		
		String s = etiquette.toString() + "-";
		if (!estFeuille()) { 	
			s += vrai.toString();
			s += faux.toString();
		}
		
		return s;
	}
	
	public boolean recherche(E eti) {
		if (estFeuille()) { return etiquette.equals(eti); } 
		
		//else
		return etiquette.equals(eti) || vrai.recherche(eti) || faux.recherche(eti);
	}
	
	public int nbNoeuds() {
		if (estFeuille()) return 0;
		return sousArbreVrai().nbNoeuds() + sousArbreFaux().nbNoeuds() + 1;
	}
	
	public void rechercheClasse() throws IOException {
		if (estFeuille()) {
			System.out.println("Vous pensez à un " + etiquette);
		} else {
			// Enter data using BufferReader
	        BufferedReader reader = new BufferedReader(
	            new InputStreamReader(System.in));
	 
	        System.out.println(etiquette + " ?");
	        // Reading data using readLine
	        String rep = reader.readLine();
	 
	        if (rep.equals("y")) {
	        	sousArbreVrai().rechercheClasse();
	        } else {
	        	sousArbreFaux().rechercheClasse();
	        }
		}
	}
	
	public void printClean() {
		printCleanAux(0);
	}
	public void printCleanAux(int depth) {
		for (int i = 0; i < depth; i++) {
			System.out.print("    ");
		}
		
		
		if (!estFeuille()) {
			System.out.println(etiquette+" ?");
			sousArbreVrai().printCleanAux(depth+1);
			sousArbreFaux().printCleanAux(depth+1);
		} else {
			System.out.println(etiquette);
		}
	}
	
	public void parcoursLarge() {
		Queue<ADB<E>> queue = new LinkedList<ADB<E>>();
		queue.add(this);
		
		
		while (queue.size() > 0) {
			ADB<E> foo = queue.remove();
			if (foo.estFeuille()) {
				System.out.print(foo.etiquette+"-");				
			} else {
				System.out.print(foo.etiquette+" ?-");
				queue.add(foo.sousArbreVrai());
				queue.add(foo.sousArbreFaux());
			}
		}	
	}
	
	public String parcoursPostfixe() {
		if (estVide()) return "EMPTY";
		
		if (estFeuille()) {
			System.out.print(etiquette.toString()+"-");
		} else {
			sousArbreVrai().parcoursPostfixe();
			sousArbreFaux().parcoursPostfixe();
			System.out.print(etiquette.toString()+" ?-");
		}
		return "";
	}
	
	public String parcoursInfixe() {
		if (estVide()) return "EMPTY";
		
		if (estFeuille()) {
			System.out.print(etiquette.toString()+"-");
		} else {
			sousArbreVrai().parcoursInfixe();
			System.out.print(etiquette.toString()+" ?-");
			sousArbreFaux().parcoursInfixe();
		}
		return "";
	}
}

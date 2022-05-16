package assertionsExceptions;

public class App {

	public static void main(String[] args) throws Exception {
		PileBornee pile = new PileBornee();
		
		
		System.out.println("Taille max : "+pile.getTailleMax());
		System.out.println("Taille actuelle : "+pile.taille());
		
		pile.setTailleMax(5);

		
		pile.empiler("a");
		pile.empiler("b");
		pile.empiler("c");
		pile.empiler("d");
		pile.empiler("e");
		

		System.out.println("Taille max : "+pile.getTailleMax());
		System.out.println("Taille actuelle : "+pile.taille());
		
		try {
			pile.setTailleMax(4);
		} catch (PileBorneeTailleMaxPlusPetiteQueTailleException e) {
			e.printStackTrace();
		}
		
		try {
			pile.empiler("d");
		} catch (PileBorneePleineException e) {
			e.printStackTrace();
		}
		
		try {
			pile.setTailleMax(-1);
		} catch (PileBorneeTailleMaxNegException e) {
			e.printStackTrace();
		}
		
		System.out.println(pile.depiler());
		System.out.println("Taille max : "+pile.getTailleMax());
		System.out.println("Taille actuelle : "+pile.taille());
		
		pile.depiler();pile.depiler();pile.depiler();pile.depiler();
		System.out.println("Taille max : "+pile.getTailleMax());
		System.out.println("Taille actuelle : "+pile.taille());
		
		try {
			pile.depiler();
		} catch (PileVideException e) {
			System.err.print("après avoir dépiler pile vide \n");
			e.printStackTrace();
		}
	}
}

package couleur;

public class Couleurs {
	public static void main(String[] args) {
		System.out.println("------------- pinceau pp3 -----------------");
		PinceauPastel pp3 = new PinceauPastel();
		pp3.vert();//dans pinceau
		System.out.println();
		pp3.rose(); //rose() dans PinceauPastel
		System.out.println();
		pp3.bleu(); //bleu() dans PinceauPastel
		System.out.println();
		pp3.jaune(); //jaune() dans Pinceau, cherche dans PinceuaPastel, puis PinceauClair, puis Pinceau. this pp3 de type PinceauPastel, execution de gamme() de PinceauPastel
		System.out.println();
		pp3.orange(); //orange() de Pinceau mais variante_orange() de PinceauPastel()
		System.out.println();
		pp3.mauve1(); System.out.println();
		pp3.mauve2(); System.out.println();
		System.out.println("------------- pinceau p3 -----------------");
		Pinceau p3 = new PinceauPastel();
		p3.vert(); System.out.println();
		p3.rose();
		System.out.println();
		p3.bleu();
		System.out.println();
		p3.jaune(); System.out.println();
		p3.orange();
		System.out.println();
		//p3.mauve1(); //pas de mauve1() et mauve2() dans Pinceau type statique, problème à la compilation
		//p3.mauve2();
		System.out.println("------------- pinceau pc3 -----------------");
		PinceauClair pc3 = new PinceauPastel();
		pc3.vert();
		System.out.println();
		pc3.rose();
		System.out.println();
		pc3.bleu();
		System.out.println();
		pc3.jaune(); System.out.println();
		pc3.orange();
		System.out.println();
		//pc3.mauve1();
		//pc3.mauve2();
		}
}

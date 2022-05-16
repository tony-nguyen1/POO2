package couleur;

abstract class Pinceau{
	public void vert(){System.out.print("vert");} //héritage sans redéfinition
	public void rose(){System.out.print("rose");}
	public void bleu(){System.out.print("bleu");}
	
	public void jaune(){System.out.print("jaune"); gamme(); } //définition par généralisation avec appel de méthode abstraite
	public void orange(){System.out.print("orange"); variante_orange(); } //définition par généralisation avec appel de méthode concrète
	
	public void variante_orange(){System.out.print(" standard");} 
	abstract void gamme(); //méthode abstraire
}
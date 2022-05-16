package couleur;

public class PinceauPastel extends PinceauClair {
	@Override
	public void bleu(){System.out.print("bleu pastel");} //redéfinition avec maquage
	@Override
	public void rose(){super.rose(); System.out.print(" dragée");} //redéfinition avec spécialisation de Pinceau.clair()
	@Override
	public void variante_orange(){System.out.print(" coquille d’oeuf");} //redéfinition avec masquage
	public void mauve1(){this.rose(); System.out.print("---"); this.bleu();}
	public void mauve2(){super.rose(); System.out.print("---"); super.bleu();} /// ??? louche ??? la class possède rose() et bleu() localement mais on fait appel a super
	@Override
	public void gamme() {System.out.print(" pastel");}
}

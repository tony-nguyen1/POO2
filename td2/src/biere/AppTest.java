package biere;

public class AppTest {

	public static void main(String[] args) {
		Biere biere1 = new Biere(); biere1.description();                           // main1
		
		
		Biere biere2 = new Lambic(); biere2.description();                          // main2
		//type dynamique : Lambic; cherche description() à partir de Lambic; this.couleur() de Lambic
		
		
		Biere biereA1 = new MortSubiteKriek(); biereA1.description();		        // main3
		//type statique Biere; description() est dans Biere, OK;
		//type dynamique MortSubiteKriek, description() de MortSubiteKriek, super.couleur() de Lambic
		
		
		BiereAcidulee biereA2 = new MortSubiteKriek(); biereA2.description(); 		// main4
		//description() dans BiereAcidulee ou super classe; à l'exécution, super.couleur() de Lambic
		
		
		MortSubiteKriek biereA3 = new MortSubiteKriek(); biereA3.description();     // main5

	}

}

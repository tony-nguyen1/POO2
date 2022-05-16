package compteBancaire;

public class AppTest {

	public static void main(String[] args) {
		CDR unCDR = new CDR();
		//unCDR.setSolde(1000f);
		
		System.out.println("getSolde(): "+unCDR.getSolde());
		
		unCDR.fermer();
	}

}

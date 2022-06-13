import java.io.IOException;

public class App {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		boolean test = true;
		System.out.println("Hello, World!");
		
		assert test : ("y a un pb");
		
		
		try {
			faux();
		} catch(IOException e) {
			
		} finally {
			System.out.println("finally");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("Fin du programme.");
	}
	
	public static void faux() throws Exception {
		
		boolean faux = false;
		
//		try {
//			
//		}
//	
		
	}

}

package td4;

@RefactoringOperation(actorName = "Tony", 
comment = "extraire attributs dans une classe Adresse", 
isInEclipse = true, 
nbCases = 1, 
nom = RefactoringName.extractClass)
public class Personne {
    public Personne (String nom,int age,int numrue,String nomrue, String ville,int codepostale){
        this.NomComplet = nom ;
        this.Age = age ;
        this.NumRue = numrue ;
        this.NomRue = nomrue ;
        this.Ville = ville ;
        this.CodePostale=codepostale;
    }

    @RefactoringOperation(actorName = "Tony", 
    		comment = "enlever la majuscule au début", 
    		isInEclipse = true, 
    		nbCases = 6, 
    		nom = RefactoringName.rename)
    @RefactoringOperation(actorName = "Tony", 
    	comment = "passer la portée en privée", 
    	isInEclipse = true, 
    	nbCases = 6, 
    	nom = RefactoringName.encapsulatedField)
    public String NomComplet;
    public int Age;
    public int NumRue;
    public String NomRue;
    public String Ville;
    public int CodePostale;

    @RefactoringOperation(actorName = "Tony", 
    		comment = "enlever la majuscule", 
    		isInEclipse = true, 
    		nbCases = 1, 
    		nom = RefactoringName.rename)
    public void AfficherAdresse() {
        System.out.println("Numero de rue : " + NumRue);
        System.out.println("Nom de la rue : " + NomRue);
        System.out.println("Nom de la ville : " + Ville);
        System.out.println("CodePostale : " + CodePostale);
    }
}

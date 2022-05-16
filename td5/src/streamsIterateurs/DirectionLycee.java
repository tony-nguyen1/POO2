package streamsIterateurs;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class DirectionLycee implements Iterable<EmployeLycee> {
	private EmployeLycee proviseur,
						proviseurAdjoint,
						conseillerPrincipaldEducation,
						gestionnaire,
						chefDeTravaux;
	public DirectionLycee() {}

	public EmployeLycee getProviseur() {
		return proviseur;
	}

	public void setProviseur(EmployeLycee proviseur) {
		this.proviseur = proviseur;
	}

	public EmployeLycee getProviseurAdjoint() {
		return proviseurAdjoint;
	}

	public void setProviseurAdjoint(EmployeLycee proviseurAdjoint) {
		this.proviseurAdjoint = proviseurAdjoint;
	}

	public EmployeLycee getConseillerPrincipaldEducation() {
		return conseillerPrincipaldEducation;
	}

	public void setConseillerPrincipaldEducation(EmployeLycee conseillerPrincipaldEducation) {
		this.conseillerPrincipaldEducation = conseillerPrincipaldEducation;
	}

	public EmployeLycee getGestionnaire() {
		return gestionnaire;
	}

	public void setGestionnaire(EmployeLycee gestionnaire) {
		this.gestionnaire = gestionnaire;
	}

	public EmployeLycee getChefDeTravaux() {
		return chefDeTravaux;
	}

	public void setChefDeTravaux(EmployeLycee chefDeTravaux) {
		this.chefDeTravaux = chefDeTravaux;
	}
	
	public String toString() {
		String res ="Direction du lycee "
				+"\nproviseur "+this.getProviseur()
				+"\nproviseur adjoint "+this.getProviseurAdjoint()	
				+"\ngestionnaire "+this.getGestionnaire()		
				+"\nCPE "+this.getConseillerPrincipaldEducation()	
				+"\nChef de travaux "+this.getChefDeTravaux();
		
//		res = "Direction du lycee ";
//		
//		for (EmployeLycee e : this) {
//			res += e.getNom();
//		}
		return res;
	}
	
	public int ageMoyen() {
		 return (this.getProviseur().getAge()+
				this.getProviseurAdjoint().getAge()+
				this.getConseillerPrincipaldEducation().getAge()+
				this.getGestionnaire().getAge()+
				this.getChefDeTravaux().getAge())/5;
	}
		
	// Methode qui affiche les noms des employés sur la sortie standard 
	
	public void afficheNoms() {
		System.out.println(this.getProviseur().getNom());
		System.out.println(this.getProviseurAdjoint().getNom());
		System.out.println(this.getConseillerPrincipaldEducation().getNom());
		System.out.println(this.getGestionnaire().getNom());
		System.out.println(this.getChefDeTravaux().getNom());
	}
	
	// Methode qui retourne la liste des employes recrutes 
	// apres une certaine annee passee en parametre
	
	public ArrayList<EmployeLycee> recruteApres(int annee) {
		ArrayList<EmployeLycee> res = new ArrayList<>();
		if (this.getProviseur().getAnneeRecrutement()> annee) {
			res.add(getProviseur());
		}
		if (this.getProviseurAdjoint().getAnneeRecrutement()> annee) {
			res.add(getProviseurAdjoint());
		}
		if (this.getConseillerPrincipaldEducation().getAnneeRecrutement()> annee) {
			res.add(getConseillerPrincipaldEducation());
		}
		if (this.getGestionnaire().getAnneeRecrutement()> annee) {
			res.add(getGestionnaire());
		}
		if (this.getChefDeTravaux().getAnneeRecrutement()> annee) {
			res.add(getChefDeTravaux());
		}
		return res;
	}

	// Methode qui retourne l'age moyen 
	// des membres d'une certaine categorie recrutes
	// avant une certaine annee	
	
	public double ageMoyenCategorieAvant(Categorie a, int annee)
	{
		int sum = 0;
		int i = 0;
		
		if (this.getProviseur().getAnneeRecrutement() < annee && a == getProviseur().getCategorie()) {
			sum += getProviseur().getAge();
			i++;
		}
		if (this.getProviseurAdjoint().getAnneeRecrutement() < annee && a == getProviseurAdjoint().getCategorie()) {
			sum += getProviseurAdjoint().getAge();
			i++;
		}
		if (this.getConseillerPrincipaldEducation().getAnneeRecrutement() < annee && a == getConseillerPrincipaldEducation().getCategorie()) {
			sum += getConseillerPrincipaldEducation().getAge();
			i++;
		}
		if (this.getGestionnaire().getAnneeRecrutement() < annee && a == getGestionnaire().getCategorie()) {
			sum += getGestionnaire().getAge();
			i++;
		}
		if (this.getChefDeTravaux().getAnneeRecrutement() < annee && a == getChefDeTravaux().getCategorie()) {
			sum += getChefDeTravaux().getAge();
			i++;
		}
		return sum/i;		
	}
	
	// Methode qui retourne l'annee de recrutement
	// la plus ancienne pour les employes 
	// d'un certain corps

	public int anneeRecrutementPlusAnciennePourCorps(String corps)
	{		
		ArrayList<EmployeLycee> res = new ArrayList<>();
		
		if (this.getProviseur().getCorps().equals(corps)) {
			res.add(getProviseur());
		}
		if (this.getProviseurAdjoint().getCorps().equals(corps)) {
			res.add(getProviseurAdjoint());
		}if (this.getConseillerPrincipaldEducation().getCorps().equals(corps)) {
			res.add(getConseillerPrincipaldEducation());
		}if (this.getGestionnaire().getCorps().equals(corps)) {
			res.add(getGestionnaire());
		}if (this.getChefDeTravaux().getCorps().equals(corps)) {
			res.add(getChefDeTravaux());
		}
		
		int min = res.get(0).getAnneeRecrutement();
//		EmployeLycee best = res.get(0);
		for (EmployeLycee e : res) {
			if (e.getAnneeRecrutement() < min) {
//				best = e;
				min = e.getAnneeRecrutement();
			}
		}
		return min;		
	}
	
	//********* ITERATEUR ******************
	
	@Override
	public DirectionLyceeIterator iterator() {
		return new DirectionLyceeIterator(this);
	}
	

	// Après avoir écrit l'itérateur et avoir transformé la
	// classe DirectionLycee en classe Iterable ...
	
	// Ecrire afficheNoms avec for (quand l'iterateur existe)
	public void afficheNomsIte() {
		for (EmployeLycee e : this) {
			System.out.println(e.getNom());
		}
	}
	
	public int ageMoyenIte() {
		int i = 0;
		int sum = 0;
		
		for (EmployeLycee e : this) {
			sum += e.getAge();
			i++;
		}
		
		return sum/i;	
	}
	
	// Ecrire recruteApres avec for (quand l'iterateur existe)
	public ArrayList<EmployeLycee> recruteApresIte(int annee) {
		ArrayList<EmployeLycee> res = new ArrayList<>();
		
		for (EmployeLycee e : this) {
			
			if (e.getAnneeRecrutement() > annee) {
				res.add(e);
			}
		}
		return res;
	}
		
	// Ecrire ageMoyenCategorieAvant avec for (quand l'iterateur existe)
	public double ageMoyenCategorieAvantIte(Categorie a, int annee)
	{
		double sum = 0;
		double i = 0;
		
		for (EmployeLycee e : this) {
			if (e.getAnneeRecrutement() < annee && a == e.getCategorie()) {
				sum += e.getAge();
				i++;
			}
		}
		double m = sum / i;
		return m;		
	}
	
	// Ecrire anneeRecrutementPlusAnciennePourCorps avec for (quand l'iterateur existe)
	public int anneeRecrutementPlusAnciennePourCorpsIte(String corps) {		
		ArrayList<EmployeLycee> res = new ArrayList<>();
		
		for (EmployeLycee e : this) {
			if (e.getCorps().equals(corps)) {
				res.add(e);
			}
		}
		
		int min = res.get(0).getAnneeRecrutement();
//		EmployeLycee best = res.get(0);
		for (EmployeLycee e : res) {
			if (e.getAnneeRecrutement() < min) {
//				best = e;
				min = e.getAnneeRecrutement();
			}
		}
		return min;		
	}
	
	
	//********* STREAM ******************
	
	// Stream 1 - Ecrire une methode retournant une liste contenant les membres de la direction
	public ArrayList<EmployeLycee> membres() {
		ArrayList<EmployeLycee> employe = new ArrayList<>();
		
		employe.add(proviseur);
		employe.add(proviseurAdjoint);
		employe.add(conseillerPrincipaldEducation);
		employe.add(gestionnaire);
		employe.add(chefDeTravaux);
		
		return employe;
	}
	// la liste peut être utilisée ci-dessous pour obtenir un stream puis
	// le naviguer
	
	// Stream 2 - Ecrire aussi une methode retournant un stream sur les membres
	// de la direction à partir de l'itérateur
	
	// Ecrire ageMoyen avec les 2 streams obtenus comme indiqué précédemment 
	public double ageMoyenStream() {	
		return membres()
				.stream()
				.mapToInt(EmployeLycee::getAge)
				.average()
				.getAsDouble();
	}
	
	// Ecrire afficheNoms avec l'un des 2 streams
	public void afficheNomsStream() {
		membres()
			.stream()
			.map(EmployeLycee::getNom)
			.forEach(System.out::println);
	}
	
	// Ecrire recruteApres avec l'un des 2 streams
	List<EmployeLycee> recruteApresStream(int annee) {
		return membres()
				.stream()
				.filter(e -> e.getAnneeRecrutement() > annee)
				.collect(Collectors.toList());
	}
	// Ecrire ageMoyenCategorieAvant avec l'un des 2 streams
	public double ageMoyenCategorieAvantStream(Categorie cat, int annee) {
		return membres()
				.stream()
				.filter(e -> e.getCategorie().equals(cat))
				.filter(e -> e.getAnneeRecrutement() < annee)
				.mapToInt(EmployeLycee::getAge)
				.average()
				.getAsDouble();
	}
	
	// Ecrire anneeRecrutementPlusAnciennePourCorps avec l'un des 2 streams
	public int anneeRecrutementPlusAnciennePourCorpsStream(String corps) {
		return membres()
				.stream()
				.filter(e -> e.getCorps().equals(corps))
				.mapToInt(EmployeLycee::getAnneeRecrutement)
				.min()
				.getAsInt();
	}
}

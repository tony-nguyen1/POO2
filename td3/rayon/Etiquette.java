public class Etiquette {
    private float degreAlcool;
    private String nomProducteur;
    private String adresseProducteur; // une classe producteur ?
    private String contenu;
    private float quantité;//en L
    
    public Etiquette(float degreAlcool, String nomProducteur, String adresseProducteur, String contenu,
            float quantité) {
        this.degreAlcool = degreAlcool;
        this.nomProducteur = nomProducteur;
        this.adresseProducteur = adresseProducteur;
        this.contenu = contenu;
        this.quantité = quantité;
    }

    @Override
    public String toString() {
        return "Etiquette [adresseProducteur=" + adresseProducteur + ", contenu=" + contenu + ", degreAlcool="
                + degreAlcool + ", nomProducteur=" + nomProducteur + ", quantité=" + quantité + "]";
    }

    
}

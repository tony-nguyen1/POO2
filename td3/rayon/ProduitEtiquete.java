public class ProduitEtiquete implements ObjetAvecEtiquette{
    private String etiquette;
    public String etiquette(){
        return etiquette;
    }
    public ProduitEtiquete(String etiquette) {
        this.etiquette = etiquette;
    }
    public String getEtiquette() {
        return etiquette;
    }
    public void setEtiquette(String etiquette) {
        this.etiquette = etiquette;
    }

    
}

import java.util.ArrayList;

public class RayonGenerique<P extends ProduitEtiquete> {
    private ArrayList<P> contenu = new ArrayList<P>();

    public RayonGenerique() {
    }

    public String listingContenu() {
        String listing = "";
        for (Produit c : contenu)
            listing += c.etiquette();
        return listing;
    }

    public void addElement(P p){
        if (!contenu.contains(p)){
            contenu.add(p);
        }
    }

    public static void main(String[] args) {
        RayonGenerique<Livre> rl=new RayonGenerique<>();
        RayonGenerique<ProduitEtiquete> rp=new RayonGenerique<>();

        Livre l1=new Livre("L1");
        Livre l2=new Livre("L2");
        ProduitEtiquete p1=new ProduitEtiquete("P1");
        rl.addElement(l1);
        r1.addElement(l2);
        System.out.println(r1.listingContenu());
        r2.add(l1);
        r2.add(l2);
        r2.add(p1);
        System.out.println(r2.listingContenu());
    }
}

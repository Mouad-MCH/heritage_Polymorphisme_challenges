package Challenge_10;

public class ProduitElectronique extends Produit{

    public ProduitElectronique(String nom, double prix) {
        super(nom, prix);
    }

    public double getPrixFinal() {
        return getPrix() - 10;
    }


}

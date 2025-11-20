package Challenge_10;

public class ProduitVestimentaire extends Produit{

    public ProduitVestimentaire(String nom, double prix) {
        super(nom, prix);
    }

    public double getPrixFinal() {
        return getPrix() - 300;
    }
}

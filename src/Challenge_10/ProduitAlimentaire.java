package Challenge_10;

public class ProduitAlimentaire extends Produit{

    public ProduitAlimentaire(String nom, double prix) {
        super(nom, prix);
    }

    public double getPrixFinal() {
        return getPrix() - 130;
    }

}

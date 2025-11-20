package Challenge_10;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void afficher(List<Produit> list) {
        System.out.println("---------------Produit--------------");
        for (Produit l : list) {
          System.out.println(" * Class : " + l.getClass().getSimpleName());
          System.out.println("=".repeat(5));
            System.out.println(l);
            System.out.println("*** Prix Finall ***");
            System.out.println("Prix = " + l.getPrixFinal());
          System.out.println("*".repeat(20));
        }
    }
    public static void main(String[] args) {

        List<Produit> l = new ArrayList<>();

        l.add(new ProduitAlimentaire("PA", 2.33));
        l.add(new ProduitElectronique("PE", 24.33));
        l.add(new ProduitVestimentaire("PV", 442.33));
        afficher(l);

    }
}

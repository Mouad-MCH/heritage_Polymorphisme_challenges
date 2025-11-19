package Challenge_5;

public class Main {

    public static void traiterPaiement(Paiement p) {
        System.out.println("=== TRAITEMENT DU PAIEMENT ===");
        System.out.println("Type : " + p.getClass().getSimpleName());
        System.out.println("Détails : " + p);
        p.effectuerPaiement(p.getMontant());
    }
    public static void main(String[] args) {

        Paiement p1 = new PaiementCarte("fff",3444.3,"34345345","2030");
        Paiement p2 = new PaiementCash("fff",3444.3,343.4);

        traiterPaiement(p1);
        traiterPaiement(p2);


    }
}

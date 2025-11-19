package Challenge_5;

public class Paiement {
    private String id;
    private double montant;

    public Paiement(String id, double montant) {
        this.id = id;
        this.montant = montant;
    }

    public String getId() {
        return id;
    }

    public double getMontant() {
        return montant;
    }

    public void effectuerPaiement(double montant) {
    }


}

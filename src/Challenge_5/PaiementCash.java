package Challenge_5;

public class PaiementCash extends Paiement{
    private double montantRemis;

    public PaiementCash(String id, double montant, double montantRemis) {
        super(id, montant);
        this.montantRemis = montantRemis;
    }

    @Override
    public void effectuerPaiement(double montant) {
        System.out.println("Paiement en CASH");
        System.out.println("Montant a payer: " + montant);
        System.out.println("Montant remis: " + montantRemis);

        if(montantRemis >= montant) {
            double r = montantRemis - montant;
            System.out.println(" rendre: " + r + " MAD");
        }else {
            System.out.println(" montant insuffisant manque: " + (montant - montantRemis) + " MAD");
        }
    }

    public double getMontantRemis() {
        return montantRemis;
    }

    public void setMontantRemis(double montantRemis) {
        this.montantRemis = montantRemis;
    }

    @Override
    public String toString() {
        return "PaiementCash{" +
                "montantRemis=" + montantRemis +
                '}';
    }
}

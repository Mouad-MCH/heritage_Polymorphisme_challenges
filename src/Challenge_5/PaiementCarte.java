package Challenge_5;

public class PaiementCarte extends Paiement{
    private String numeroCarte;
    private String dateExpiration;

    public PaiementCarte(String id, double montant, String numeroCarte, String dateExpiration) {
        super(id, montant);
        this.numeroCarte = numeroCarte;
        this.dateExpiration = dateExpiration;
    }

    public void effectuerPaiement(double montant) {
        System.out.println("Numero de carte: " + numeroCarte);
        System.out.println("date de Expiration: " + dateExpiration);
        System.out.println("Montant: " + montant);
    }


    public String getNumeroCarte() {
        return numeroCarte;
    }

    public void setNumeroCarte(String numeroCarte) {
        this.numeroCarte = numeroCarte;
    }

    public String getDateExpiration() {
        return dateExpiration;
    }

    public void setDateExpiration(String dateExpiration) {
        this.dateExpiration = dateExpiration;
    }

    @Override
    public String toString() {
        return "PaiementCarte{" +
                "numeroCarte='" + numeroCarte + '\'' +
                ", dateExpiration='" + dateExpiration + '\'' +
                '}';
    }
}

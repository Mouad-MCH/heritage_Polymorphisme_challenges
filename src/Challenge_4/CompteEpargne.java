package Challenge_4;

public class CompteEpargne extends Compte{
    private double tauxInteret;

    public CompteEpargne(String numero, double solde, double tauxInteret) {
        super(numero, solde);
        this.tauxInteret = tauxInteret;
    }

    public void appliquerInteret() {
        double t = solde * (tauxInteret/100);
        solde += t;
        System.out.println("adding  Iteret : " + t);
        System.out.println("new Solde : " + solde);

    }

    @Override
    public String toString() {
        return "CompteEpargne{" +
                "tauxInteret=" + tauxInteret +
                ", numero='" + numero + '\'' +
                ", solde=" + solde +
                '}';
    }
}

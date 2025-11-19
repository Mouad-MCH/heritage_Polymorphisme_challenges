package Challenge_4;

public class CompteCourant extends Compte {
    private double limiteDecouvert;

    public CompteCourant(String numero, double solde, double limiteDecouvert) {
        super(numero, solde);
        this.limiteDecouvert = limiteDecouvert;
    }

    @Override
    public void retirer() {
        System.out.println("votre Solde : " + solde + " MAD");
        System.out.print("Entre montant: ");
        double r = scanner.nextDouble();
        if (r > 0 && (solde - r) >= -limiteDecouvert) {
            solde -= r;
            System.out.println("votre Solde : " + solde + " MAD");
            if (solde < 0) {
                System.out.println("Attention : vous êtes à découvert !");
            } else {
                System.out.println("Retrait impossible : limite de découvert dépassée (" + limiteDecouvert + " MAD)");
            }
        }
    }


    @Override
    public String toString() {
        return "CompteCourant{" +
                "limiteDecouvert=" + limiteDecouvert +
                ", numero='" + numero + '\'' +
                ", solde=" + solde +
                '}';
    }
}

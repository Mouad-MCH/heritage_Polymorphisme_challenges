package Challenge_2;

public class Employe {
    private String nom;
    private double salaireBase;

    public Employe(String nom, double salaireBase) {
        this.nom = nom;
        this.salaireBase = salaireBase;
    }

    public Employe(String nom) {
    }

    public double calculerSalaire() {
        return salaireBase;
    }



}

package Challenge_7;

public class Personnage {
    private String nom;
    private int pointsDeVie;

    public Personnage(String nom, int pointsDeVie) {
        this.nom = nom;
        this.pointsDeVie = pointsDeVie;
    }

    public String getNom() {
        return nom;
    }

    public int getPointsDeVie() {
        return pointsDeVie;
    }

    public void attaquer() {
        System.out.println("Bankai");
    }

    @Override
    public String toString() {
        return "Personnage{" +
                "nom='" + nom + '\'' +
                ", pointsDeVie=" + pointsDeVie +
                '}';
    }
}

package Challenge_7;

public class Guerrier extends Personnage{
    private String power;

    public Guerrier(String nom, int pointsDeVie, String power) {
        super(nom, pointsDeVie);
        this.power = power;
    }

    @Override
    public void attaquer() {
        System.out.println("Bankai");
    }

    public String getPower() {
        return power;
    }

    @Override
    public String toString() {
        return "Personnage{" +
            "nom='" + getNom() + '\'' +
                    ", pointsDeVie=" + getPointsDeVie() + "\n" +
                "Guerrier{" +
                "power='" + power + '\'' +
                '}';
    }
}

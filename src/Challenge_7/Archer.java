package Challenge_7;

public class Archer extends Personnage{
    private String weapon;

    public Archer(String nom, int pointsDeVie, String weapon) {
        super(nom, pointsDeVie);
        this.weapon = weapon;
    }

    @Override
    public void attaquer() {
        System.out.println("I don't know");
    }

    public String getWeapon() {
        return weapon;
    }

    @Override
    public String toString() {
        return "Personnage{" +
                "nom='" + getNom() + '\'' +
                ", pointsDeVie=" + getPointsDeVie() + "\n" +
                "Archer{" +
                "weapon='" + weapon + '\'' +
                '}';
    }
}

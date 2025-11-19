package Challenge_7;

public class Mage extends Personnage{
    private String magicType;

    public Mage(String nom, int pointsDeVie, String magicType) {
        super(nom, pointsDeVie);
        this.magicType = magicType;
    }

    @Override
    public void attaquer() {
            System.out.println("Abra kadabra");
    }

    public String getMagicType() {
        return magicType;
    }

    @Override
    public String toString() {
        return "Personnage{" +
                        "nom='" + getNom() + '\'' +
                        ", pointsDeVie=" + getPointsDeVie() + "\n" +
                "Mage{" +
                "magicType='" + magicType + '\'' +
                '}';
    }
}

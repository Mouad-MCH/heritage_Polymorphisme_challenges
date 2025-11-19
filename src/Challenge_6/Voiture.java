package Challenge_6;

public class Voiture extends Vehicule{
    private int nombrePortes;

    public Voiture(String marque, String modele, int nombrePortes) {
        super(marque, modele);
        this.nombrePortes = nombrePortes;
    }

    public int getNombrePortes() {
        return nombrePortes;
    }

    @Override
    public void demarrer() {
        System.out.println("marque: " + getMarque() + ", Modele: " + getModele());
        System.out.println("Nombre de Portes: " + nombrePortes);
        System.out.println("Etapes: ");
        System.out.println("    -Etape 1: ");
        System.out.println("    -Etape 2: ");
        System.out.println("    -Etape 3: ");
        System.out.println("    -Etape 4: ");

    }

    @Override
    public String toString() {
        return "Voiture{" +
                "nombrePortes=" + nombrePortes +
                '}';
    }
}

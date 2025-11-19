package Challenge_6;

public class Moto extends Vehicule{
    private String cylander;

    public Moto(String marque, String modele, String cylander) {
        super(marque, modele);
        this.cylander = cylander;
    }

    @Override
    public void demarrer() {
        System.out.println("marque: " + getMarque() + ", Modele: " + getModele());
        System.out.println("cylinder: " + cylander);
        System.out.println("Etapes: ");
        System.out.println("    -Etape 1: ");
        System.out.println("    -Etape 2: ");
        System.out.println("    -Etape 3: ");
        System.out.println("    -Etape 4: ");

    }

    @Override
    public String toString() {
        return "Moto{" +
                "cylander='" + cylander + '\'' +
                '}';
    }
}

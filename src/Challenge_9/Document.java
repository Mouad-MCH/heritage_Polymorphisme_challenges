package Challenge_9;

public class Document {
    private String nom;
    private int taille;

    public Document(String nom, int taille) {
        this.nom = nom;
        this.taille = taille;
    }

    public void afficher() {
        System.out.println("Document: " + nom + " (" + taille + "Mo)");
    }

    public String getNom() {
        return nom;
    }

    public int getTaille() {
        return taille;
    }
}

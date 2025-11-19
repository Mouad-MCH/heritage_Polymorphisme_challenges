package Challenge_9;

public class Word extends Document{
    private String auteur;

    public Word(String nom, int taille, String auteur) {
        super(nom, taille);
        this.auteur = auteur;
    }


    @Override
    public void afficher() {
        System.out.println("Document Word: " + getNom() + " - Auteur"  + auteur + " (" + getTaille() + "Mo)");
    }

}

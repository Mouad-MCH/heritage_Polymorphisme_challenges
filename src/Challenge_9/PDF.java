package Challenge_9;

public class PDF extends Document{
    private int nombrePages;

    public PDF(String nom, int taille, int nombrePages) {
        super(nom, taille);
        this.nombrePages = nombrePages;
    }

    @Override
    public void afficher() {
        System.out.println("PDF: " + getNom() + " - "  + nombrePages + " pages (" + getTaille() + "Mo)");
    }

}

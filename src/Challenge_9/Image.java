package Challenge_9;

public class Image extends Document{
    private String format;

    public Image(String nom, int taille, String format) {
        super(nom, taille);
        this.format = format;
    }


    @Override
    public void afficher() {
        System.out.println("Image: " + format + ": "  + getNom() + " (" + getTaille() + "Mo)");
    }


}

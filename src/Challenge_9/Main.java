package Challenge_9;

public class Main {
    public static void main(String[] args) {

        Document[] d = new Document[5];

        d[0] = new PDF("something.pdf" , 222, 49);
        d[1] = new Image("image.png" , 359, "PNG");
        d[2] = new Word("letter.docx" , 222, "Someone");
        d[3] = new PDF("Presentation.pdf" , 222, 49);
        d[4] = new Word("letter2.docx" , 222, "SomeBody");

        for(Document doc : d) {
            doc.afficher();
            System.out.println("*".repeat(15));
        }

    }
}

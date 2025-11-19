package Challenge_4;

public class Main {
    public static void main(String[] args) {
        Compte c1 = new CompteCourant("213234254", 232.432,12);
        CompteEpargne c2 = new CompteEpargne("213234254", 232.432,2.5);

        System.out.println("******** Tester un retrait sur un compte courant *********");

        c1.verser();
        c1.retirer();
        System.out.println(c1);

        System.out.println("******** Tester l’application des intérêts *********");

        c2.appliquerInteret();
        System.out.println(c2);

    }
}

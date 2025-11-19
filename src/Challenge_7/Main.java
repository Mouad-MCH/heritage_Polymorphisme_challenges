package Challenge_7;

public class Main {
    static void traitement(Personnage p) {
        System.out.println("-----Personnage-----");
        System.out.println("Type : " + p.getClass().getSimpleName());
        System.out.println("=".repeat(10));
        System.out.println(p.toString());

    }
    public static void main(String[] args) {

        Personnage p1 = new Guerrier("Mouad", 11,"hard");
        Mage p2 = new Mage("Ali", 11,"boll");
        Archer p3 = new Archer("Omar", 11,"poleaxe");

        traitement(p1);
        traitement(p2);
        traitement(p3);
    }
}

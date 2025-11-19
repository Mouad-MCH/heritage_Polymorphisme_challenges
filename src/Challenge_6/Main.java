package Challenge_6;

public class Main {
    static void traitement(Vehicule v) {
        System.out.println("---- Vehicule diarrage ------");
        System.out.println("Class : " + v.getClass().getSimpleName());
        System.out.println("=".repeat(5));
        v.demarrer();
    }
    public static void main(String[] args) {
        Vehicule v1 = new Voiture("Ford", "2024", 123);
        Vehicule v2 = new Moto("Harley davidson", "Freewheeler", "45-degree V-twin engine");
        //Vehicule v2 = new Camion("Ford", "2024", 123);

        traitement(v1);
        traitement(v2);

    }
}

package Challenge_3;

public class Chien extends Animal{
    @Override
    public void faireSon() {
        System.out.println("Wouf wouf!");
    }

    @Override
    public void manger() {
        System.out.println("Le chien mange des croquettes ");
    }
}

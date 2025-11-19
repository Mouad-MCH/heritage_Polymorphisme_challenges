package Challenge_3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> a = new ArrayList<>();

        a.add(new Chat());
        a.add(new Chien());

        for(Animal an : a) {
            System.out.print("son : ");
            an.faireSon();
            System.out.print(" + ");
            an.manger();
        }
    }
}

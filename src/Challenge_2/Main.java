package Challenge_2;

import Challenge_1.Forme;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Employe[] E = new Employe[2];

        E[0] = new EmployeHoraire("Mouad", 23,40.5);
        E[1] = new EmployeCommission("Mouad", 23,4.5);

        System.out.println("*********** Employe ***********");
        for(Employe e : E) {
            System.out.println(e.toString() + " salaire = " + e.calculerSalaire());
        }

    }
}

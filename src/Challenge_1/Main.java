package Challenge_1;

import javax.sql.rowset.FilteredRowSet;

public class Main {
    public static void main(String[] args) {

        Forme[] forme = new Forme[5];

        forme[0] = new Cercle(5.4);
        forme[1] = new Cercle(56.4);
        forme[2] = new Rectangle(5.4, 33.0);
        forme[3] = new Cercle(1.4);
        forme[4] = new Rectangle(45.4, 2);

        for(Forme f : forme) {
            System.out.println(f.toString() + "=> Aire = " + f.calculerAire());
            System.out.println("*****************************");
        }

    }
}

package Challenge_4;

import java.util.Scanner;

public class Compte {
   static Scanner scanner = new Scanner(System.in);
    protected String numero;
    protected double solde;

    public Compte(String numero, double solde) {
        this.numero = numero;
        this.solde = solde;
    }

    public void verser() {
        System.out.println("****** Verser ******");
        System.out.println("votre Solde : " + solde + " MAD");
        System.out.print("Entre montant: ");
        double v = scanner.nextDouble();
        this.solde += v;
        System.out.println("votre Solde apre verser : " + solde + " MAD");
        System.out.println("****** ************* ******");
    }

    public void retirer() {
        System.out.println("****** Retirer ******");
        System.out.println("votre Solde : " + solde + " MAD");
        System.out.print("Entre montant: ");
        double r = scanner.nextDouble();
        if(solde == 0 && r > solde) {
            System.out.println("Votre solde est vide");
        }else {
            this.solde -= r;
            System.out.println("mis a jour de Solde : " + solde + " MAD");
        }

        System.out.println("****** ********* ******");
    }


}

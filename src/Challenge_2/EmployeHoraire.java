package Challenge_2;

public class EmployeHoraire extends Employe{
    private double heuresTravaillees;
    private double tauxHoraire;

    public EmployeHoraire(String nom,double heuresTravaillees, double tauxHoraire) {
        super(nom);
        this.heuresTravaillees = heuresTravaillees;
        this.tauxHoraire = tauxHoraire;
    }

    @Override
    public double calculerSalaire() {
        return heuresTravaillees * tauxHoraire;
    }

    @Override
    public String toString() {
        return "EmployeHoraire{" +
                "heuresTravaillees=" + heuresTravaillees +
                ", tauxHoraire=" + tauxHoraire +
                '}';
    }
}

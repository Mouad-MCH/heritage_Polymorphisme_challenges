package Challenge_2;

public class EmployeCommission extends Employe{
    private int ventes;
    private double commission;

    public EmployeCommission(String nom, int ventes, double commission) {
        super(nom);
        this.ventes = ventes;
        this.commission = commission;
    }

    @Override
    public double calculerSalaire() {
        return ventes * commission;
    }

    @Override
    public String toString() {
        return "EmployeCommission{" +
                "ventes=" + ventes +
                ", commission=" + commission +
                '}';
    }
}

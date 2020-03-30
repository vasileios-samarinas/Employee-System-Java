package staff.management;

public class Director extends Manager {

    double budget;

    public Director(String name, String NiNumber, double salary, String deptName,double budget) {
        super(name, NiNumber, salary, deptName);
        this.budget=budget;
    }

    public double getBudget() {
        return budget;
    }
}

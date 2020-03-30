package staff;

public abstract class Employee {
    String name;
    String NiNumber;
    double salary;

    public Employee(String name, String NiNumber, double salary) {
        this.name=name;
        this.NiNumber=NiNumber;
        this.salary=salary;
    }

    public String getName() {
        return name;
    }

    public String getNiNumber() {
        return NiNumber;
    }

    public double getSalary() {
        return salary;
    }

    public double raiseSalary(double wage){
        return this.salary+this.salary*wage;
    }

    public double payBonus(){
        return this.salary*0.01;
    }


}

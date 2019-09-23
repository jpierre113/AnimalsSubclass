package Household;

public abstract class Family extends HouseGreeter {
    double netWorth = this.netWorth;
    double salary = this.salary;
    double taxRate = this.taxRate;
    Pet pet = this.pet;

    public Family(double netWorth, double salary, double taxRate, Pet pet) {
        super(netWorth, salary, taxRate, pet);
    }
}


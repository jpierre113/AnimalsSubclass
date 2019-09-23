package Household;

abstract class HouseGreeter {
    double netWorth;
    double salary;
    double taxRate;
    Pet pet;

    public HouseGreeter(double netWorth, double salary, double taxRate, Pet pet){
        this.netWorth = netWorth;
        this.salary = salary;
        this.taxRate = taxRate;
        this.pet = pet;
    }

    public double payTaxes(){
        return salary * taxRate;
    }

    public abstract String careForPet();

    public void earnMoney(){
        double taxes = payTaxes();
        double profit = this.salary - taxes;
        this.netWorth += profit;
        System.out.println("You earned: "+profit+ "\n You have a net worth of: "+netWorth );
    }

    public void dailyActivities(){
        payTaxes();
        earnMoney();
    }
    }


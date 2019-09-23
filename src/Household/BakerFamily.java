package Household;

public class BakerFamily extends HouseGreeter  {
    BakerFamily(double netWorth, double salary, double taxRate, Pet pet) {
        super(netWorth, salary, taxRate, pet);
    }

    public void earnMoney(){
        System.out.println("Baker sold cookies for a year");
        super.earnMoney();
    }

    public String careForPet(){
        return pet.eat();
    }
}

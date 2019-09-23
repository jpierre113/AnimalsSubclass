package Household;

public class TeacherFamily extends HouseGreeter {
    TeacherFamily(double netWorth, double salary, double taxRate, Pet pet) {
        super(netWorth, salary, taxRate, pet);
    }

    public void earnMoney(){
        System.out.println("Teacher taught for a year");
        super.earnMoney();
    }

    public String careForPet(){
        return pet.groom();
    }
}

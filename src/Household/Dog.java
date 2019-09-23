package Household;

public class Dog implements Pet {
    @Override
    public String eat(){
        return "Food time";
    }
    @Override
    public String groom(){
        return "Woof, I am clean";
    }
    @Override
    public String play(){
        return "Fetch ball";
    }
}

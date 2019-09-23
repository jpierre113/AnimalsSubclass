package Household;

public class Cat implements Pet {
    @Override
    public String eat(){
        return "Meow I am fed";
    }
    @Override
    public String groom(){
        return "Meow, I am clean";
    }
    @Override
    public String play(){
        return "Play with string";
    }
}

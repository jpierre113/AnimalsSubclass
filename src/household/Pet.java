package household;

abstract public class Pet implements House {
    private String pet;

    public Pet(String pet){
        this.pet = pet;
    }

    @Override
    public void beFed(){
        System.out.println("Pet gets food");
    }

    @Override
    public void beGroomed(){
        System.out.println("Pet got a bath and brushed their teeth");
    }

    @Override
    public void playWith(){
        System.out.println("Spent time playing with Pet");
    }

}

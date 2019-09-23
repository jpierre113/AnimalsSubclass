package Household;

public class Main {
    public static void main(String[] args) {
        Pet cat = new Cat();
        Pet dog = new Dog();
        HouseGreeter bakerFamily = new BakerFamily(35_000,1200,.2,cat);
        HouseGreeter teacherFamily = new TeacherFamily(50_000,1550,.2,dog);

        for(int i = 0; i < 3 ; i++){
            bakerFamily.dailyActivities(); //will print out money amount for baker
            teacherFamily.dailyActivities(); // will print money amount for teacher
            System.out.println(bakerFamily.careForPet()); //print pet action
            System.out.println(teacherFamily.careForPet());
        }

    }
}

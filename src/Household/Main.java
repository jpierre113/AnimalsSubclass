package Household;

public class Main {
    public static void main(String[] args) {
        Pet cat = new Cat();
        Pet dog = new Dog();
        HouseGreeter bakerFamily = new BakerFamily(35_000,1200,.2,cat);
        HouseGreeter teacherFamily = new TeacherFamily(50_000,1550,.2,dog);

        for(int i = 0; i < 3 ; i++){
            bakerFamily.dailyActivities();
            teacherFamily.dailyActivities();
        }

    }
}

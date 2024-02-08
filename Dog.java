package OOP.seminar1;



import OOP.seminar1.interfaces.Goable;
import OOP.seminar1.interfaces.Huntable;
import OOP.seminar1.interfaces.Swimable;

public class Dog extends Animal implements Huntable, Goable, Swimable{
    public Dog(String patientName, int birthdayYear, Illness illness) {
        super(patientName, birthdayYear, illness);
    }
    

    @Override
    public double run() {
        return 25;
    }

    @Override
    public double swim() {
        return 2;
    }

}


package OOP.seminar1;


import OOP.seminar1.interfaces.Goable;
import OOP.seminar1.interfaces.Swimable;

public class Hamster extends Animal implements Goable, Swimable{
    public Hamster(String patientName, int birthdayYear, Illness illness) {
        super(patientName, birthdayYear, illness);
    }
    
    @Override
    public double run() {
        return 5;
    }
    @Override
    public double swim() {
        return 2;
    }
}

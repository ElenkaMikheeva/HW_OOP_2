package OOP.seminar1;


import OOP.seminar1.interfaces.Flyable;

public class Owl extends Animal implements Flyable{
    public Owl(String patientName, int birthdayYear, Illness illness) {
        super(patientName, birthdayYear, illness);
    }
    
    @Override
    public double fly() {
        return 50;
    }
}

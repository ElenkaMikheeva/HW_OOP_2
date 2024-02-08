package OOP.seminar1;


import OOP.seminar1.interfaces.Swimable;

public class Penguin extends Animal implements Swimable{
    public Penguin(String patientName, int birthdayYear, Illness illness) {
        super(patientName, birthdayYear, illness);
    }

    @Override
    public double swim() {
        return 30;
    }
}

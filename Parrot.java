package OOP.seminar1;


import OOP.seminar1.interfaces.Flyable;

public class Parrot extends Animal implements Flyable{
    public Parrot(String patientName, int birthdayYear, Illness illness) {
        super(patientName, birthdayYear, illness);
    }

    @Override
    public double fly() {
        return 5;
    }
}

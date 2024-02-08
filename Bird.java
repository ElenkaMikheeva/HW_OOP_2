package OOP.seminar1;


public class Bird extends Animal {
    private int wingCount;

    public Bird(String patientName, int birthdayYear, Illness illness, int wingCount) {
        super(patientName, birthdayYear, illness);
        this.wingCount = wingCount;
    }
}

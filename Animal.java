package OOP.seminar1;


public class Animal {
    protected String patientName;
    protected int birthdayYear;
    protected Illness illness;

    public Animal(String patientName, int birthdayYear, Illness illness){
        this.patientName = patientName;
        this.birthdayYear = birthdayYear;
        this.illness = illness;
    }

    public Animal(){
        this("Вася",2000, new Illness("Болезнь"));
    }

    public void setIllness(Illness illness) {
        this.illness = illness;
    }

    public String getName() {
        return patientName;
    }

    public int getBirthdayYear() {
        return birthdayYear;
    }

    public Illness getIllness() {
        return illness;
    }

    public String getType(){
        return getClass().getSimpleName();
    }



  
   
        @Override
    public String toString() {
        return String.format("Пациент: %s, %s %d, %s", this.getType(), patientName, birthdayYear, illness.getTitle());
    }
}

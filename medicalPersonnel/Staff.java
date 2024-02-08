package OOP.seminar1.medicalPersonnel;


public abstract class Staff {
    protected String name;
    protected String qualification;
    protected int salary;

    public Staff(String name, String qualification, int salary){
        this.name = name;
        this.qualification = qualification;
        this.salary = salary;
    }  

    public String getType() {
        return this.getClass().getSimpleName();
    }

    public String toString() {
        return String.format("Сотрудник: %s, %s, %s, %d", this.getType(), name, qualification, salary);
    } 
}

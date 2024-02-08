package OOP.seminar1.medicalPersonnel;

import java.util.Map;
import java.util.Random;

import OOP.seminar1.Animal;

public class Nurse extends Staff{

    public Nurse(String name, String qualification, int salary) {
        super(name, qualification, salary);
        
    }
    private final Map<Integer, String> procedures = Map.of(1, "Укол", 2, "Промывание раны", 3, "Бинтование раны");

    public void makeProcedure(Animal patient) {
        Random r = new Random();
        int random = r.nextInt(procedures.size()) + 1;
        String d = procedures.get(random);
        System.out.println("Проведены процедуры: " + d);
    }
}

package OOP.seminar1.medicalPersonnel;

import java.util.Map;
import java.util.Random;

import OOP.seminar1.Animal;
import OOP.seminar1.Illness;

public class Doctor extends Staff{

    public Doctor(String name, String qualification, int salary) {
        super(name, qualification, salary);
        
    }
    private final Map<Integer, String> diagnoses = Map.of(1, "Глисты", 2, "Чумка", 3, "Лишай");

    public void makeDiagnos(Animal patient) {
        Random r = new Random();
        int random = r.nextInt(diagnoses.size()) + 1;
        String d = diagnoses.get(random);
        patient.setIllness(new Illness(d));
        System.out.println("Поставлен диагноз: " + d);;
    }
    
}

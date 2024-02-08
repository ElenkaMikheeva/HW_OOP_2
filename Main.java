package OOP.seminar1;

import OOP.seminar1.medicalPersonnel.Doctor;
import OOP.seminar1.medicalPersonnel.Nurse;

public class Main {
    public static void main(String[] args) {
        VeterinaryClinic clinic = new VeterinaryClinic();  


        Doctor oleg = new Doctor("Петров Олег", "Кардиолог", 25365);
        Doctor anna = new Doctor("Василькова Анна", "Хирург", 27652);
        Nurse sveta = new Nurse("Кобышева Светлана", "Процедурная сестра", 16592);
        Nurse mary = new Nurse("Родина Мария ", "Приемная сестра", 16589);

        clinic.addStaff(oleg);
        clinic.addStaff(anna);
        clinic.addStaff(sveta);
        clinic.addStaff(mary);
        
        clinic.getStaff();

        Animal baby = new Dog("Малыш", 2001, new Illness("Глисты"));
        Animal snow = new Hamster("Снежок", 2024, new Illness("Ожирение"));
        Animal buklya = new Owl("Букля", 2015, new Illness("Выпадение перьев"));
        Animal kyzya = new Parrot("Кузя", 2022, new Illness("Перьевые паразиты"));
        Animal arktic = new Penguin("Арктик", 2016, new Illness("Простуда"));


        clinic.addPatient(baby);
        clinic.addPatient(snow);
        clinic.addPatient(buklya);
        clinic.addPatient(kyzya);
        clinic.addPatient(arktic);

        clinic.getPatients();
        
        clinic.getGoables();
        clinic.getFlyables();
        clinic.getSwimables();
    }


}

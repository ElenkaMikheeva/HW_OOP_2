package OOP.seminar1;

import java.util.ArrayList;
import java.util.List;

import OOP.seminar1.interfaces.Flyable;
import OOP.seminar1.interfaces.Goable;
import OOP.seminar1.interfaces.Swimable;
import OOP.seminar1.medicalPersonnel.Staff;

public class VeterinaryClinic {
   
    private List<Staff> staff;
    private List<Animal> patients;
    
    public VeterinaryClinic() {
        this.staff = new ArrayList<>();
        this.patients = new ArrayList<>();
    }
    public void addStaff(Staff a) {
        staff.add(a);
    }
    public void getStaff() {
        System.out.println();
        System.out.println("Список медперсонала клиники:");
        for (Staff a : staff) {
            System.out.println(a);
        }
       
    }
    public void addPatient(Animal a) {
        patients.add(a);
    }
   
    public void getPatients() {
        System.out.println();
        System.out.println("Список пациентов ветеринарной клиники:");
        for (Animal a : patients) {
            System.out.println(a);
        }
        
    }
    public void getFlyables() {
        System.out.println();
        System.out.println("Летающие пациенты:");
        for (Animal a : patients) {
            if (a instanceof Flyable) {
                System.out.println(a);
            }
        }
        
    }

    public void getSwimables() {
        System.out.println();
        System.out.println("Павающие пациенты:");
        for (Animal a : patients) {
            if (a instanceof Swimable) {
                System.out.println(a);
            }
        }
        
    }

    public void getGoables() {
        System.out.println();
        System.out.println("Бегающие пациенты: ");
        for (Animal a : patients) {
            if (a instanceof Goable) {
                System.out.println(a);
            }
        }
        
    }

}

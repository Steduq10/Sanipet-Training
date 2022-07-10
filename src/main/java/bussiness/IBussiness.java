package bussiness;

import employee.Doctor;
import employee.Stylist;
import patient.Cat;
import patient.Dog;

public interface IBussiness {
    String FILE_NAME = "history.txt";

    void addCat (String FILE_NAME, Cat cat);
    void addDog (String FILE_NAME, Dog dog);
    void addDoctor (String FILE_NAME, Doctor doctor);
    void addStylist (String FILE_NAME, Stylist stylist);
    void list();
    void starthistory();
}

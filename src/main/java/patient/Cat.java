package patient;

import java.util.Date;
import java.util.Random;

public class Cat extends Patient{

    public Cat() {
    }

    public Cat(String clinicNumber, String name,Owner owner, String breed, String statusVaccines, Date desparasization) {
        super(clinicNumber, name,owner, breed, statusVaccines, desparasization);
    }

    @Override
    public String getClinicNumber() {
        Random random = new Random();
        long value = random.nextLong(999999 + 100000) + 100000;
        String number = Long.toString(value);
        return number;
    }

    @Override
    public String toString() {
        return "Register complete correctly [ " +
                "Clinic History Number = " + clinicNumber +
                ", Name = " + name +
                ", Breed = " + breed +
                ", " + owner +
                ", Vaccines status = " + statusVaccines +
                ", De-worming date = " + deworming +
                ']';
    }
}

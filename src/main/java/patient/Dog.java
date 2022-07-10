package patient;

import java.time.LocalDate;
import java.util.Date;
import java.util.Random;
import java.util.RandomAccess;

public class Dog extends Patient{
    public Dog() {
    }
    public Dog(String clinicNumber, String name, Owner owner, String breed, String statusVaccines, LocalDate desparasization) {
        super(clinicNumber, name,owner, breed, statusVaccines, desparasization);
    }
    @Override
    public  String getClinicNumber() {
        Random random = new Random();
        long value = random.nextLong(999999 + 100000) + 100000;
        String number = Long.toString(value);
        return number;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "clinicNumber='" + clinicNumber + '\'' +
                ", name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", " + owner + '\'' +
                ", statusVaccines=" + statusVaccines +
                ", desparasization=" + deworming +
                '}';
    }
}



package patient;

import java.util.Date;

public class Cat extends Patient{

    public Cat() {
    }

    public Cat(String clinicNumber, String name, String breed, Owner owner, String statusVaccines, Date desparasization) {
        super(clinicNumber, name, breed, owner, statusVaccines, desparasization);
    }


    @Override
    public String toString() {
        return "Register complete correctly [" +
                "Clinic History Number = " + clinicNumber +
                ", Name = " + name +
                ", Breed = " + breed +
                ", " + owner +
                ", statusVaccines=" + statusVaccines +
                ", desparasization=" + deworming +
                ']';
    }
}

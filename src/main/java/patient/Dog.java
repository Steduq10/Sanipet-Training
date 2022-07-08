package patient;

import java.util.Date;

public class Dog extends Patient{

    public Dog() {
    }

    public Dog(String clinicNumber, String name, String breed, Owner owner, String statusVaccines, Date desparasization) {
        super(clinicNumber, name, breed, owner, statusVaccines, desparasization);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "clinicNumber='" + clinicNumber + '\'' +
                ", name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", " + owner +
                ", statusVaccines=" + statusVaccines +
                ", desparasization=" + desparasization +
                '}';
    }
}

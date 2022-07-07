package patient;

import java.util.Date;

public class Cat extends Patient{

    public Cat() {
    }

    public Cat(String clinicNumber, String name, String breed, Owner owner, boolean statusVaccines, Date desparasization) {
        super(clinicNumber, name, breed, owner, statusVaccines, desparasization);
    }

    @Override
    public String generateNumber() {
        double number = (Math.random() * ((999999 - 100000)) + 100000);
        long iNumber = (long) Math.round(number);
        String clinicNumber = Long.toString(iNumber);
        //int number2 = Math.round(number);
        return clinicNumber;
    }

    @Override
    public String toString() {
        return "Register complete correctly {" +
                "clinicNumber='" + clinicNumber + '\'' +
                ", name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", " + owner +
                ", statusVaccines=" + statusVaccines +
                ", desparasization=" + desparasization +
                '}';
    }
}

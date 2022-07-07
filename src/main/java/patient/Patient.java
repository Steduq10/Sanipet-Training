package patient;

import java.util.Date;
import java.util.Random;

import static java.lang.Math.round;

public abstract class  Patient {
    //Attributes
    protected String clinicNumber;
    protected String name;
    protected String breed;
    protected Owner owner;
    protected boolean statusVaccines;
    protected Date desparasization;

    //constructor


    public Patient() {
    }

    public Patient(String clinicNumber, String name, String breed, Owner owner, boolean statusVaccines, Date desparasization) {
        this.clinicNumber = clinicNumber;
        this.name = name;
        this.breed = breed;
        this.owner = owner;
        this.statusVaccines = statusVaccines;
        this.desparasization = desparasization;
    }

    public Patient(String clinicNumber) {
        this.clinicNumber = clinicNumber;
    }

    public String getClinicNumber() {
        return clinicNumber;
    }

    public void setClinicNumber(String clinicNumber) {
        this.clinicNumber = clinicNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public boolean isStatusVaccines() {
        return statusVaccines;
    }

    public void setStatusVaccines(boolean statusVaccines) {
        this.statusVaccines = statusVaccines;
    }

    public Date getDesparasization() {
        return desparasization;
    }

    public void setDesparasization(Date desparasization) {
        this.desparasization = desparasization;
    }

    //method to generate the clinicNumber
    public abstract String generateNumber();

}


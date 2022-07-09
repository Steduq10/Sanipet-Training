package patient;

import java.time.LocalDate;
import java.util.Date;


import static java.lang.Math.round;

public abstract class  Patient {
    //Attributes
    protected String clinicNumber;
    protected String name;
    protected String breed;
    protected Owner owner;
    protected String statusVaccines;
    protected LocalDate deworming;

    //constructor


    public Patient() {
    }

    public Patient(String clinicNumber, String name,Owner owner, String breed, String statusVaccines, LocalDate deworming) {
        this.clinicNumber = clinicNumber;
        this.name = name;
        this.breed = breed; 
        this.owner = owner;
        this.statusVaccines = statusVaccines;
        this.deworming = deworming;
    }

    public Patient(String clinicNumber) {
        this.clinicNumber = clinicNumber;
    }

    public String getClinicNumber() {
        return clinicNumber;
    }

    public void setClinicNumber(String clinicNumber) {
        this.clinicNumber = clinicNumber;
        //return String.valueOf(ThreadLocalRandom.current().nextInt(1, 999999 + 1));
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

    public String getStatusVaccines() {
        return statusVaccines;
    }

    public void setStatusVaccines(String statusVaccines) {
        if(statusVaccines.equalsIgnoreCase("n")){
            System.out.println("Your pet must be vaccinated!!!");
            System.exit(0);
        }else if(statusVaccines.equalsIgnoreCase("y"))
        {
            System.out.println("Great!!! you can continue");
            System.out.println();
        }else{
            System.out.println("Please write a valid option Y/N");
        }
        this.statusVaccines = statusVaccines;
    }

    public LocalDate getdeworming() {
        return deworming;
    }

    public void setdeworming(LocalDate deworming) {
        this.deworming = deworming;
    }

    //method to generate the clinicNumber
    public  String generateClinicNumber;





}


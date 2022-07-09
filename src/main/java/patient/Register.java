package patient;

import appointments.Medicine;
import employee.Doctor;
import employee.Employee;
import employee.Stylist;

import java.util.ArrayList;
import java.util.List;

public class Register {
    //public Patient patient;
    //public Employee employee;
    public Medicine medicine;
    public Dog dog;
    public Cat cat;
    public Doctor doctor;
    public Stylist stylist;
    List<Register> register = new ArrayList<Register>();

    public Register() {
    }

    public Register(Cat cat, Doctor doctor) {
        this.cat = cat;
        this.doctor = doctor;
    }

    public Register(Dog dog, Doctor doctor) {
        this.dog = dog;
        this.doctor = doctor;
    }

    public Register(Cat cat, Stylist stylist) {
        this.cat = cat;
        this.stylist = stylist;
    }

    public Register(Dog dog, Stylist stylist) {
        this.dog = dog;
        this.stylist = stylist;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public void setStylist(Stylist stylist) {
        this.stylist = stylist;
    }

    @Override
    public String toString() {
        return "Register{" +
                "cat=" + cat +
                ", doctor=" + doctor +
                '}';
    }
}

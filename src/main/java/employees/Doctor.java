package employees;

import static employees.DoctorAvaliable.DOCTORMW1;

public class Doctor extends Employee{
    public Doctor(String name, String surname) {
        super(name, surname);
    }


    DoctorAvaliable doctor = DOCTORMW1;
    public void Avaliable(){
        switch (doctor){
            case DOCTORMW1:
                System.out.println("");
        }
    }
}

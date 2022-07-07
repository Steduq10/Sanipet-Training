package employees;

public class Doctor extends Employee{
    public Doctor(String name, String surname) {
        super(name, surname);
    }


    DoctorAvaliable doctor;

    public Doctor(String name, String surname, DoctorAvaliable doctor) {
        super(name, surname);
        this.doctor = doctor;
    }

    public void Doctoris() {
        switch (doctor){
            case DOCTORMW1:
                System.out.println("Avaliable MONDAY - WEDNESDAY 8 AM - 7 PM");
                break;
            case DOCTORMW2:
                System.out.println("Avaliable MONDAY - WEDNESDAY 8 AM - 7 PM");
                break;
            case DOCTORTS:
                System.out.println("Avaliable THURSDAY - FRIDAY 8 AM - 7 PM, SATURDAY 9AM - 3 PM ");
                break;
            default:
                System.out.println("Please, insert a correct option");
    }


    }
}

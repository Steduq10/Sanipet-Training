package employees;

public class Stylist extends Employee {

    public Stylist(String name, String surname) {
        super(name, surname);
    }
    StylistAvaliable stylist;

    public void Stylistis() {
        switch (stylist){
            case STYLIST1:
                System.out.println("Avaliable MONDAY - FRIDAY 8AM - 4PM, SATURDAY 9AM - 3 PM");
                break;
            case STYLIST2:
                System.out.println("Avaliable MONDAY - FRIDAY 8AM - 4PM, SATURDAY 9AM - 3 PM");
                break;
            default:
                System.out.println("Please insert a correct option");
        }


    }
}

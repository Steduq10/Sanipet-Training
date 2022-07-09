package employee;

public class Stylist extends Employee {


    public Stylist(String name, String surname, int day) {
        super(name, surname, day);
        setSchedule();
    }

    private void setSchedule() {
        for(int i = 0; i <=5; i++){
            Schedule schedule = new Schedule("8AM", "4PM", i);
            this.schedules.add(schedule);
        }
        this.schedules.add(new Schedule("9AM","4PM",6));
    }
}

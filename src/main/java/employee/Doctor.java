package employee;

public class Doctor extends Employee {
    public Doctor(String name, String surname, int day) {
        super(name, surname, day);
        setSchedule();
    }
    public Doctor() {
    }
    public void setSchedule() {
        System.out.println("1. Monday to Wednesday");
        System.out.println("2. Thursday to Saturday");
        switch (day){
            case 1:
                Schedule monday = new Schedule("8AM", "7PM", 1);
                Schedule tuesday = new Schedule("8AM", "7PM", 2);
                Schedule wednesday = new Schedule("8AM", "7PM", 3);
                this.schedules.add(monday);
                this.schedules.add(tuesday);
                this.schedules.add(wednesday);
                break;
            case 2:
                Schedule thursday = new Schedule("8AM", "7PM", 4);
                Schedule friday = new Schedule("8AM", "7PM", 5);
                Schedule saturday = new Schedule("8AM", "7PM", 6);
                this.schedules.add(thursday);
                this.schedules.add(friday);
                this.schedules.add(saturday);
                break;
            case 3:

                    for(int i= 1 ; i<=5; i++){
                        Schedule schedule =  new Schedule("8AM","8AM", i);
                        this.schedules.add(schedule);
                    }
                    this.schedules.add(new Schedule("9AM","3PM",6));
        }
    }
}

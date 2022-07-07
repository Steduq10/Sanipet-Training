package employee;
import java.util.*;
public class Doctor extends Employee {


    public Doctor(String name, String surname, int day) {
        super(name, surname);
        setSchedule(day);
    }

    private void setSchedule(int day) {
        switch (day){
            case 1: {
                Schedule schedule1 = new Schedule("8AM", "7PM", 1);
                Schedule schedule2 = new Schedule("8AM", "7PM", 2);
                Schedule schedule3 = new Schedule("8AM", "7PM", 3);

                this.schedules.add(schedule1);
                this.schedules.add(schedule2);
                this.schedules.add(schedule3);
                break;
            }
            case 2: {
                Schedule schedule4 = new Schedule("8AM", "7PM", 4);
                Schedule schedule5 = new Schedule("8AM", "7PM", 5);
                Schedule schedule6 = new Schedule("8AM", "7PM", 6);

                this.schedules.add(schedule4);
                this.schedules.add(schedule5);
                this.schedules.add(schedule6);
                break;
            }
        }
    }
}

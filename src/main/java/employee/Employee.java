package employee;

import java.util.ArrayList;


public abstract class Employee {
    protected String name;
    protected String surname;
    protected int day;
    
    protected ArrayList<Schedule>schedules = new ArrayList<>();

    public Employee() {
    }

    public Employee(String name, String surname, int day) {
        this.name = name;
        this.surname = surname;
        this.day = day;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void getSchedules(){
        for ( Schedule schedule: schedules) {
            System.out.println(schedule.getDay() + " "+ schedule.getStartTime() +" "+ schedule.getEndTime() );
        }
    }

    public void setSchedules(ArrayList<Schedule> schedules) {
        this.schedules = schedules;
    }
}

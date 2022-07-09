package employee;

import java.util.ArrayList;


public abstract class Employee {
    protected String name;
    protected String surname;
    protected String day;
    
    protected ArrayList<Schedule>schedules = new ArrayList<>();

    public Employee() {
    }

    public Employee(String name, String surname, String day) {
        this.name = name;
        this.surname = surname;
        this.day = day;
    }

    public Employee(String name, String surname) {
        this.name = name;
        this.surname = surname;
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

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
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



    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", day='" + day + '\'' +
                ", schedules=" + schedules +
                '}';
    }
}

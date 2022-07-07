package employee;

import java.util.ArrayList;


public abstract class Employee {
    protected String name;
    protected String surname;

    protected ArrayList<Schedule>schedules = new ArrayList<>();
    public Employee(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
}

package employee;

import java.util.Scanner;

public class Doctor extends Employee {
    public Doctor(String name, String surname, String day) {
        super(name, surname, day);
        setSchedule();
    }
    public Doctor() {
    }

    public Doctor(String name, String surname) {
        super(name, surname);
    }

    public  void setSchedule() {
        System.out.println("Please, choose which day you want the date:\n" +
                "1. Monday to Wednesday\n" +
                "2. Thursday to Saturday ");
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        if(range == 1) {

                System.out.println("Specif the day:\n" +
                        "1. Monday\n" +
                        "2. Tuesday\n" +
                        "3. Wednesday");
              int date = sc.nextInt();
                if(date == 1) {
                        Schedule monday = new Schedule("8AM", "7PM", "Monday");
                        this.schedules.add(monday);
                    System.out.println("Date assigned on " + monday.getDay());
                        }
                else if(date == 2) {
                    Schedule tuesday = new Schedule("8AM", "7PM", "Tuesday");
                    this.schedules.add(tuesday);
                    System.out.println("Date assigned on " + tuesday.getDay());

            }

                else if(date == 3) {

                    Schedule wednesday = new Schedule("8AM", "7PM", "Wednesday");
                    this.schedules.add(wednesday);
                    System.out.println("Date assigned on " + wednesday.getDay());


                }else {
                    System.out.println("Insert a valid option");

                }

                }

            else if(range == 2){
                System.out.println("Specific the day:\n" +
                        "1. Thursday\n" +
                        "2. Friday\n" +
                        "3. Saturday");
               int date = sc.nextInt();
                if(date == 1) {
                    Schedule thursday = new Schedule("8AM", "7PM", "Thursday");
                    this.schedules.add(thursday);
                    System.out.println("Date assigned on " + thursday.getDay());
                    //System.out.println(thursday.toString());

                }
                    else if(date == 2) {
                    Schedule friday = new Schedule("8AM", "7PM", "Friday");
                    this.schedules.add(friday);
                    System.out.println("Date assigned on " + friday.getDay());
                }else if (date == 3) {
                    Schedule saturday = new Schedule("8AM", "7PM","Saturday");
                    this.schedules.add(saturday);
                    System.out.println("Date assigned on " + saturday.getDay());

                }
        }






    }
}

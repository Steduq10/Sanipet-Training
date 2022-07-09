package employee;

import java.util.Scanner;

public class Doctor extends Employee {
    public Doctor(String name, String surname, int day) {
        super(name, surname, day);
        setSchedule();
    }
    public Doctor() {
    }
    public void setSchedule() {
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
                        Schedule monday = new Schedule("8AM", "7PM", 1);
                        this.schedules.add(monday);
                        System.out.println("Date assigned");
                        }
                else if(date == 2) {
                    Schedule tuesday = new Schedule("8AM", "7PM", 2);
                    this.schedules.add(tuesday);
                    System.out.println("Date assigned");

            }

                else if(date == 3) {

                    Schedule wednesday = new Schedule("8AM", "7PM", 3);
                    this.schedules.add(wednesday);
                    System.out.println("Date assigned");


                }else {
                    System.out.println("Insert a valid option");

                }

                }

            else if(range == 2){
                System.out.println("Specif the day:\n" +
                        "1. Thursday\n" +
                        "2. Friday\n" +
                        "3. Saturday");
               int date = sc.nextInt();
                if(date == 1) {
                    Schedule thursday = new Schedule("8AM", "7PM", 4);
                    this.schedules.add(thursday);
                    System.out.println("Date assigned on" + getDay());

                }
                    else if(date == 2) {
                    Schedule friday = new Schedule("8AM", "7PM", 5);
                    this.schedules.add(friday);
                    System.out.println("Date assigned");
                }else if (date == 3) {


                }
        }




              /*
            case 3:

                    for(int i= 1 ; i<=5; i++){
                        Schedule schedule =  new Schedule("8AM","8AM", i);
                        this.schedules.add(schedule);
                    }
                    this.schedules.add(new Schedule("9AM","3PM",6));
        }

               */
    }
}

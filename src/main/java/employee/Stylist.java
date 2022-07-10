package employee;

import bussiness.BussinesImpl;
import bussiness.IBussiness;

import java.io.*;
import java.util.Scanner;

public class Stylist extends Employee {

    public Stylist() {
    }

    public Stylist(String name, String surname) {
        super(name, surname);
    }

    public Stylist(String name, String surname, String day) {
        super(name, surname, day);
        //setSchedule();
    }

    public void setSchedule() {

        Stylist stylist1 = new Stylist("Natasha","Sullivan");
        Stylist stylist2 = new Stylist("Sophia", "Lopez");

        System.out.println("*************************************");
        System.out.println("\tSTYLIST MENU");
        System.out.println("*************************************");
        System.out.println();
        System.out.println("Please, choose which day you want the date:\n" +
                "1. Monday to Friday\n" +
                "2. Saturday ");
        Scanner sc = new Scanner(System.in);

        int range = sc.nextInt();
        if (range == 1) {

            System.out.println("Specific the day:\n" +
                    "1. Monday\n" +
                    "2. Tuesday\n" +
                    "3. Wednesday\n" +
                    "4. Thursday\n" +
                    "5. Friday");
            int date = sc.nextInt();
            if (date == 1) {
                Schedule monday = new Schedule("8AM", "7PM", "Monday");
                this.schedules.add(monday);
                //System.out.println("Date assigned on " + monday.getDay());
                System.out.println("Which doctor would you like to see?\n" +
                        "1. Natasha Sullivan\n" +
                        "2. Sophia Lopez");
                int selection = sc.nextInt();
                if (selection == 1) {
                    System.out.println("Date assigned with the doctor: " + stylist1.getName() + " " + stylist1.getSurname() + " on " + monday.getDay());
                    IBussiness data = new BussinesImpl();
                    data.addStylist("history.txt",stylist1);
                    File file = new File("history.txt");
                    try {
                        BufferedReader obj = new BufferedReader(new FileReader(file));
                        String read;
                        while ((read = obj.readLine()) != null ){
                            System.out.println(read);
                        }
                    } catch (FileNotFoundException e) {
                        throw new RuntimeException(e);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                } else if (selection == 2) {
                    System.out.println("Date assigned with the doctor: " + stylist2.getName() + " " + stylist2.getSurname() + " on " + monday.getDay());
                    IBussiness data = new BussinesImpl();
                    data.addStylist("history.txt",stylist2);
                    File file = new File("history.txt");
                    try {
                        BufferedReader obj = new BufferedReader(new FileReader(file));
                        String read;
                        while ((read = obj.readLine()) != null ){
                            System.out.println(read);
                        }
                    } catch (FileNotFoundException e) {
                        throw new RuntimeException(e);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
            } else if (date == 2) {
                Schedule tuesday = new Schedule("8AM", "7PM", "Tuesday");
                this.schedules.add(tuesday);
                //System.out.println("Date assigned on " + tuesday.getDay());
                System.out.println("Which doctor would you like to see?\n" +
                        "1. Natasha Sullivan\n" +
                        "2. Sophia Lopez");
                int selection = sc.nextInt();
                if (selection == 1) {
                    System.out.println("Date assigned with the doctor: " + stylist1.getName() + " " + stylist1.getSurname() + " on " + tuesday.getDay());
                    IBussiness data = new BussinesImpl();
                    data.addStylist("history.txt",stylist1);
                    File file = new File("history.txt");
                    try {
                        BufferedReader obj = new BufferedReader(new FileReader(file));
                        String read;
                        while ((read = obj.readLine()) != null ){
                            System.out.println(read);
                        }
                    } catch (FileNotFoundException e) {
                        throw new RuntimeException(e);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                } else if (selection == 2) {
                    System.out.println("Date assigned with the doctor: " + stylist2.getName() + " " + stylist2.getSurname() + " on " + tuesday.getDay());
                    IBussiness data = new BussinesImpl();
                    data.addStylist("history.txt",stylist2);
                    File file = new File("history.txt");
                    try {
                        BufferedReader obj = new BufferedReader(new FileReader(file));
                        String read;
                        while ((read = obj.readLine()) != null ){
                            System.out.println(read);
                        }
                    } catch (FileNotFoundException e) {
                        throw new RuntimeException(e);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
            } else if (date == 3) {

                Schedule wednesday = new Schedule("8AM", "7PM", "Wednesday");
                this.schedules.add(wednesday);
               // System.out.println("Date assigned on " + wednesday.getDay());
                System.out.println("Which doctor would you like to see?\n" +
                        "1. Natasha Sullivan\n" +
                        "2. Sophia Lopez");
                int selection = sc.nextInt();
                if (selection == 1) {
                    System.out.println("Date assigned with the doctor: " + stylist1.getName() + " " + stylist1.getSurname() + " on " + wednesday.getDay());
                    IBussiness data = new BussinesImpl();
                    data.addStylist("history.txt",stylist1);
                    File file = new File("history.txt");
                    try {
                        BufferedReader obj = new BufferedReader(new FileReader(file));
                        String read;
                        while ((read = obj.readLine()) != null ){
                            System.out.println(read);
                        }
                    } catch (FileNotFoundException e) {
                        throw new RuntimeException(e);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                } else if (selection == 2) {
                    System.out.println("Date assigned with the doctor: " + stylist2.getName() + " " + stylist2.getSurname() + " on " + wednesday.getDay());
                    IBussiness data = new BussinesImpl();
                    data.addStylist("history.txt",stylist2);
                    File file = new File("history.txt");
                    try {
                        BufferedReader obj = new BufferedReader(new FileReader(file));
                        String read;
                        while ((read = obj.readLine()) != null ){
                            System.out.println(read);
                        }
                    } catch (FileNotFoundException e) {
                        throw new RuntimeException(e);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }

                }

            }
            else if (date == 4) {

                Schedule thursday = new Schedule("8AM", "7PM", "Thursday");
                this.schedules.add(thursday);
                //System.out.println("Date assigned on " + thursday.getDay());
                System.out.println("Which doctor would you like to see?\n" +
                        "1. Natasha Sullivan\n" +
                        "2. Sophia Lopez");
                int selection = sc.nextInt();
                if (selection == 1) {
                    System.out.println("Date assigned with the doctor: " + stylist1.getName() + " " + stylist1.getSurname() + " on " + thursday.getDay());
                    IBussiness data = new BussinesImpl();
                    data.addStylist("history.txt",stylist1);
                    File file = new File("history.txt");
                    try {
                        BufferedReader obj = new BufferedReader(new FileReader(file));
                        String read;
                        while ((read = obj.readLine()) != null ){
                            System.out.println(read);
                        }
                    } catch (FileNotFoundException e) {
                        throw new RuntimeException(e);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                } else if (selection == 2) {
                    System.out.println("Date assigned with the doctor: " + stylist2.getName() + " " + stylist2.getSurname() + " on " + thursday.getDay());
                    IBussiness data = new BussinesImpl();
                    data.addStylist("history.txt",stylist2);
                    File file = new File("history.txt");
                    try {
                        BufferedReader obj = new BufferedReader(new FileReader(file));
                        String read;
                        while ((read = obj.readLine()) != null ){
                            System.out.println(read);
                        }
                    } catch (FileNotFoundException e) {
                        throw new RuntimeException(e);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
            else if (date == 5) {

                Schedule friday = new Schedule("8AM", "7PM", "Friday");
                this.schedules.add(friday);
                //System.out.println("Date assigned on " + friday.getDay());
                System.out.println("Which doctor would you like to see?\n" +
                        "1. Natasha Sullivan\n" +
                        "2. Sophia Lopez");
                int selection = sc.nextInt();
                if (selection == 1) {
                    System.out.println("Date assigned with the doctor: " + stylist1.getName() + " " + stylist1.getSurname() + " on " + friday.getDay());
                    IBussiness data = new BussinesImpl();
                    data.addStylist("history.txt",stylist1);
                    File file = new File("history.txt");
                    try {
                        BufferedReader obj = new BufferedReader(new FileReader(file));
                        String read;
                        while ((read = obj.readLine()) != null ){
                            System.out.println(read);
                        }
                    } catch (FileNotFoundException e) {
                        throw new RuntimeException(e);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                } else if (selection == 2) {
                    System.out.println("Date assigned with the doctor: " + stylist2.getName() + " " + stylist2.getSurname() + " on " + friday.getDay());
                    IBussiness data = new BussinesImpl();
                    data.addStylist("history.txt",stylist2);
                    File file = new File("history.txt");
                    try {
                        BufferedReader obj = new BufferedReader(new FileReader(file));
                        String read;
                        while ((read = obj.readLine()) != null ){
                            System.out.println(read);
                        }
                    } catch (FileNotFoundException e) {
                        throw new RuntimeException(e);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
            else {
                System.out.println("Insert a valid option");
            }
        }
        else if (range == 2) {
            Schedule saturday = new Schedule("8AM", "7PM", "Saturday");
            this.schedules.add(saturday);
            //System.out.println("Date assigned on " + saturday.getDay());
            System.out.println("Which doctor would you like to see?\n" +
                    "1. Natasha Sullivan\n" +
                    "2. Sophia Lopez");
            int selection = sc.nextInt();
            if (selection == 1) {
                System.out.println("Date assigned with the doctor: " + stylist1.getName() + " " + stylist1.getSurname() + " on " + saturday.getDay());
                IBussiness data = new BussinesImpl();
                data.addStylist("history.txt",stylist1);
                File file = new File("history.txt");
                try {
                    BufferedReader obj = new BufferedReader(new FileReader(file));
                    String read;
                    while ((read = obj.readLine()) != null ){
                        System.out.println(read);
                    }
                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            } else if (selection == 2) {
                System.out.println("Date assigned with the doctor: " + stylist2.getName() + " " + stylist2.getSurname() + " on " + saturday.getDay());
                IBussiness data = new BussinesImpl();
                data.addStylist("history.txt",stylist2);
                File file = new File("history.txt");
                try {
                    BufferedReader obj = new BufferedReader(new FileReader(file));
                    String read;
                    while ((read = obj.readLine()) != null ){
                        System.out.println(read);
                    }
                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

}

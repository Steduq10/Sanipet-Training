package employee;

import bussiness.BussinesImpl;
import bussiness.IBussiness;

import java.io.*;
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
        //Doctor doctor = new Doctor();
        Doctor doctor1 = new Doctor("James", "Goodman");
        Doctor doctor2 = new Doctor("Sarah", "Taylor");
        Doctor doctor3 = new Doctor("Jhon", "Smith");

        System.out.println("*************************************");
        System.out.println("\tDOCTOR MENU");
        System.out.println("*************************************");
        System.out.println();
        System.out.println("Which service you want to select for your pet? :\n" +
                "1. General medicine\n" +
                "2. Surgery\n" +
                "0. Exit");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        while (option < 0 || option > 2) {
            System.out.println("Please select a valid option");
            System.out.println("Which service you want to select for your pet? :\n" +
                    "1. General medicine\n" +
                    "2. Surgery\n" +
                    "0. Exit");
            option = sc.nextInt();
        }
        switch (option) {
            case 1:
                System.out.println("*************************");
                System.out.println("General medicine menu");
                System.out.println("*************************");
                System.out.println("Please, choose which day you want the date:\n" +
                        "1. Monday to Wednesday\n" +
                        "2. Thursday to Saturday ");
                //Scanner sc = new Scanner(System.in);
                int range = sc.nextInt();
                if (range == 1) {

                    System.out.println("Specif the day:\n" +
                            "1. Monday\n" +
                            "2. Tuesday\n" +
                            "3. Wednesday");
                    int date = sc.nextInt();
                    if (date == 1) {
                        Schedule monday = new Schedule("8AM", "7PM", "Monday");
                        this.schedules.add(monday);
                        //System.out.println("Date assigned on " + monday.getDay());
                        System.out.println("Which doctor would you like to see?\n" +
                                "1. James Goodman\n" +
                                "2. Sarah Taylor");
                        int selection = sc.nextInt();
                        if (selection == 1) {
                            System.out.println("Date assigned with the doctor: " + doctor1.getName() + " " + doctor1.getSurname() + " on " + monday.getDay());
                            doctor1.setDay("Monday");
                            IBussiness data = new BussinesImpl();
                            data.addDoctor("history.txt",doctor1);
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
                            System.out.println("Date assigned with the doctor: " + doctor2.getName() + " " + doctor2.getSurname() + " on " + monday.getDay());
                            doctor2.setDay("Monday");
                            IBussiness data = new BussinesImpl();
                            data.addDoctor("history.txt",doctor2);
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
                                "1. James Goodman\n" +
                                "2. Sarah Taylor");
                        int selection = sc.nextInt();
                        if (selection == 1) {
                            System.out.println("Date assigned with the doctor: " + doctor1.getName() + " " + doctor1.getSurname() + " on " + tuesday.getDay());
                            doctor1.setDay("Tuesday");
                            IBussiness data = new BussinesImpl();
                            data.addDoctor("history.txt",doctor1);
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
                            System.out.println("Date assigned with the doctor: " + doctor2.getName() + " " + doctor2.getSurname() + " on " + tuesday.getDay());
                            doctor2.setDay("tuesday");
                            IBussiness data = new BussinesImpl();
                            data.addDoctor("history.txt",doctor2);
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
                        //System.out.println("Date assigned on " + wednesday.getDay());
                        System.out.println("Which doctor would you like to see?\n" +
                                "1. James Goodman\n" +
                                "2. Sarah Taylor");
                        int selection = sc.nextInt();
                        if (selection == 1) {
                            System.out.println("Date assigned with the doctor: " + doctor1.getName() + " " + doctor1.getSurname() + " on " + wednesday.getDay());
                            doctor1.setDay("Wednesday");
                            IBussiness data = new BussinesImpl();
                            data.addDoctor("history.txt",doctor1);
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
                            System.out.println("Date assigned with the doctor: " + doctor2.getName() + " " + doctor2.getSurname() + " on " + wednesday.getDay());
                            doctor2.setDay("Wednesday");
                            IBussiness data = new BussinesImpl();
                            data.addDoctor("history.txt",doctor2);
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


                    } else {
                        System.out.println("Insert a valid option");

                    }

                } else if (range == 2) {
                    System.out.println("Specific the day:\n" +
                            "1. Thursday\n" +
                            "2. Friday\n" +
                            "3. Saturday");
                    int date = sc.nextInt();
                    if (date == 1) {
                        Schedule thursday = new Schedule("8AM", "7PM", "Thursday");
                        this.schedules.add(thursday);
                        System.out.println("Date assigned with the doctor: " + doctor3.getName() + " " + doctor3.getSurname() + " on " + thursday.getDay());
                        doctor3.setDay("thursday");
                        IBussiness data = new BussinesImpl();
                        data.addDoctor("history.txt",doctor3);
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

                    } else if (date == 2) {
                        Schedule friday = new Schedule("8AM", "7PM", "Friday");
                        this.schedules.add(friday);
                        //System.out.println("Date assigned on " + friday.getDay());
                        System.out.println("Date assigned with the doctor: " + doctor3.getName() + " " + doctor3.getSurname() + " on " + friday.getDay());
                        doctor3.setDay("Friday");
                        IBussiness data = new BussinesImpl();
                        data.addDoctor("history.txt",doctor3);
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
                    } else if (date == 3) {
                        Schedule saturday = new Schedule("8AM", "7PM", "Saturday");
                        this.schedules.add(saturday);
                        //System.out.println("Date assigned on " + saturday.getDay());
                        System.out.println("Date assigned with the doctor: " + doctor3.getName() + " " + doctor3.getSurname() + " on " + saturday.getDay());
                        doctor3.setDay("Saturday");
                        IBussiness data = new BussinesImpl();
                        data.addDoctor("history.txt",doctor3);
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
                break;
            case 2:
                System.out.println("*************************");
                System.out.println("General Surgery menu");
                System.out.println("*************************");
                System.out.println("Please, choose which day you want the date:\n" +
                        "1. Monday to Wednesday\n" +
                        "2. Thursday to Saturday ");
                //Scanner sc = new Scanner(System.in);
                range = sc.nextInt();
                if (range == 1) {

                    System.out.println("Specif the day:\n" +
                            "1. Monday\n" +
                            "2. Tuesday\n" +
                            "3. Wednesday");
                    int date = sc.nextInt();
                    if (date == 1) {
                        Schedule monday = new Schedule("8AM", "7PM", "Monday");
                        this.schedules.add(monday);
                        //System.out.println("Date assigned on " + monday.getDay());
                        System.out.println("Which doctor would you like to see?\n" +
                                "1. James Goodman" +
                                "2. Sarah Taylor");
                        int selection = sc.nextInt();
                        if (selection == 1) {
                            System.out.println("Date assigned with the doctor: " + doctor1.getName() + " " + doctor1.getSurname() + " on " + monday.getDay());
                            doctor1.setDay("Monday");
                            IBussiness data = new BussinesImpl();
                            data.addDoctor("history.txt",doctor1);
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
                            System.out.println("Date assigned with the doctor: " + doctor2.getName() + " " + doctor2.getSurname() + " on " + monday.getDay());
                            doctor2.setDay("Monday");
                            IBussiness data = new BussinesImpl();
                            data.addDoctor("history.txt",doctor2);
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
                                "1. James Goodman" +
                                "2. Sarah Taylor");
                        int selection = sc.nextInt();
                        if (selection == 1) {
                            System.out.println("Date assigned with the doctor: " + doctor1.getName() + " " + doctor1.getSurname() + " on " + tuesday.getDay());
                            doctor1.setDay("tuesday");
                            IBussiness data = new BussinesImpl();
                            data.addDoctor("history.txt",doctor1);
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
                            System.out.println("Date assigned with the doctor: " + doctor2.getName() + " " + doctor2.getSurname() + " on " + tuesday.getDay());
                            doctor2.setDay("tuesday");
                            IBussiness data = new BussinesImpl();
                            data.addDoctor("history.txt",doctor2);
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
                        //System.out.println("Date assigned on " + wednesday.getDay());
                        System.out.println("Which doctor would you like to see?\n" +
                                "1. James Goodman" +
                                "2. Sarah Taylor");
                        int selection = sc.nextInt();
                        if (selection == 1) {
                            System.out.println("Date assigned with the doctor: " + doctor1.getName() + " " + doctor1.getSurname() + " on " + wednesday.getDay());
                            doctor1.setDay("Wednesday");
                            IBussiness data = new BussinesImpl();
                            data.addDoctor("history.txt",doctor1);
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
                            System.out.println("Date assigned with the doctor: " + doctor2.getName() + " " + doctor2.getSurname() + " on " + wednesday.getDay());
                            doctor2.setDay("Wednesday");
                            IBussiness data = new BussinesImpl();
                            data.addDoctor("history.txt",doctor2);
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


                    } else {
                        System.out.println("Insert a valid option");

                    }

                } else if (range == 2) {
                    System.out.println("Specific the day:\n" +
                            "1. Thursday\n" +
                            "2. Friday\n" +
                            "3. Saturday");
                    int date = sc.nextInt();
                    if (date == 1) {
                        Schedule thursday = new Schedule("8AM", "7PM", "Thursday");
                        this.schedules.add(thursday);
                        //System.out.println("Date assigned on " + thursday.getDay());
                        System.out.println("Date assigned with the doctor: " + doctor3.getName() + " " + doctor3.getSurname() + " on " + thursday.getDay());
                        doctor3.setDay("Thursday");
                        IBussiness data = new BussinesImpl();
                        data.addDoctor("history.txt",doctor3);
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
                    } else if (date == 2) {
                        Schedule friday = new Schedule("8AM", "7PM", "Friday");
                        this.schedules.add(friday);
                        //System.out.println("Date assigned on " + friday.getDay());
                        System.out.println("Date assigned with the doctor: " + doctor3.getName() + " " + doctor3.getSurname() + " on " + friday.getDay());
                        doctor3.setDay("Friday");
                        IBussiness data = new BussinesImpl();
                        data.addDoctor("history.txt",doctor3);
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
                    } else if (date == 3) {
                        Schedule saturday = new Schedule("8AM", "7PM", "Saturday");
                        this.schedules.add(saturday);
                        //System.out.println("Date assigned on " + saturday.getDay());
                        System.out.println("Date assigned with the doctor: " + doctor3.getName() + " " + doctor3.getSurname() + " on " + saturday.getDay());
                        doctor3.setDay("Saturday");
                        IBussiness data = new BussinesImpl();
                        data.addDoctor("history.txt",doctor3);
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

    @Override
    public String toString() {
        return "Doctor{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", day='" + day + '\'' +
                '}';
    }
}

package main;

import employee.Doctor;
import employee.Stylist;
import patient.Cat;
import patient.Dog;
import patient.Owner;
import patient.Patient;

import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class Menu {
      public static void generalMenu (){
          System.out.println();
          System.out.println("*****************************************");
          System.out.println("Welcome to Sanipet Veterinary Care Center");
          System.out.println("*****************************************");
          System.out.println();
          System.out.println("Insert one of the following options:\n" +
                  "1. Register patient\n" +
                  "2. Appointments\n" +
                  "3. Billing\n" +
                  "4. Medicine stock\n" +
                  "5. Exit");
          System.out.println();
          Scanner sc = new Scanner(System.in);
          int option = sc.nextInt();
          switch (option){
              case 1:
                   ownersInformation();
                  break;
              case 2:
                    appointmentMenu();
                  break;
              case 5:
                  System.out.println("Thank you for visiting");
                  System.exit(0);
          }
      }
      public static Owner ownersInformation(){
          System.out.println("********************************");
          System.out.println("\t\tOWNER REGISTRATION");
          System.out.println("********************************");
          System.out.println("What's the owner's age?: ");
          Owner owner = new Owner();
          Scanner sc = new Scanner(System.in);
          String response;
          int age = sc.nextInt();
          if (age >= 18) {
              owner.setAge(age);
              System.out.println();
              System.out.println("What's the owner's DNI?: ");
              String DNI = sc.nextLine();
              response = sc.nextLine();
              while (response.length() >= 11) {
                  System.out.println("DNI must be 10 digits long ");
                  System.out.println("What's the owner's DNI?: ");
                  response = sc.nextLine();
              }
              owner.setDNI(response);
              System.out.println();
              System.out.println("What's the owner's cellphone?: ");
              String cellphone = sc.nextLine();
              while (cellphone.length() != 10) {
                  System.out.println("Cellphone must be 10 digits long ");
                  System.out.println("What's the owner's cellphone?: ");
                  cellphone = sc.nextLine();
              }
              owner.setCellphone(response);
              System.out.println();
              System.out.println("What's the owner's name?: ");
              response = sc.nextLine();
              owner.setName(response);
              System.out.println();
              System.out.println("What's the owner's surnname?: ");
              response = sc.nextLine();
              owner.setSurname(response);
              System.out.println(owner.toString());
              System.out.println();
              petSelection();
          }
          return owner;
      }
      public static void petSelection(){
          System.out.println("Please select an option down below");
          Scanner sc = new Scanner(System.in);
          int response = 0;
          do {
              System.out.println("1. Cat");
              System.out.println("2. Dog");
              System.out.println("0. Exit");
              response = Integer.valueOf(sc.nextLine());
              switch (response){

                  case 1:
                      catMenu();
                      break;
                  case 2:
                      dogMenu();
                      break;
                  case 0:
                      System.out.println("Thank you for you visit");
                      break;
                  default:
                      System.out.println("Please select a correct answer");
                }
          }while (response != 0);
    }
    public static void catMenu(){
        Patient cat = new Cat();
        Scanner sc = new Scanner(System.in);
        System.out.println("********************************");
        System.out.println("\t\t\tCAT MENU");
        System.out.println("********************************");
        System.out.println("What's your cat's name?: ");
        String name = sc.nextLine();
        cat.setName(name);
        System.out.println("\n");
        System.out.println("What's your cat's breed?: ");
        String breed = sc.nextLine();
        cat.setBreed(breed);
        System.out.println("\n");
        System.out.println("Is your cat vaccinated? Y/N: ");
        String statusVaccines = sc.nextLine();
        cat.setStatusVaccines(statusVaccines);
        cat.setClinicNumber();
        System.out.println(cat.toString());
        //Owner owner = new Owner();
        //owner.toString();
        cat.toString();
        generalMenu();
    }
    public static void dogMenu(){
          Patient dog = new Dog();
          Scanner sc = new Scanner(System.in);
          String name = sc.nextLine();
          System.out.println("********************************");
          System.out.println("\t\t\tDOG MENU");
          System.out.println("********************************");
          System.out.println("What's your cat's name?: ");
          dog.setName(name);
          System.out.println("\n");
          System.out.println("What's your cat's breed?: ");
          String breed = sc.nextLine();
          dog.setBreed(breed);
          System.out.println("\n");
          System.out.println("Is your cat vaccinated? Y/N: ");
          String statusVaccines = sc.nextLine();
          dog.setStatusVaccines(statusVaccines);
          System.out.println();
          System.out.println(dog.toString());
          System.out.println();
          dog.setClinicNumber();
          generalMenu();
    }
    public static void appointmentMenu(){
         System.out.println("*************************************");
         System.out.println("\t\tAPPOINTMENTS MENU");
         System.out.println("*************************************");
         System.out.println();
         Scanner sc = new Scanner(System.in);

         System.out.println("Which specialist you want to consult today? :\n" +
                 "1. Doctor\n" +
                 "2. Stylist\n" +
                 "3. Main menu\n" +
                 "0. Exit");
             int option = sc.nextInt();
        while(option < 0|| option > 3){
            System.out.println("Please select a valid option");
            System.out.println("Which specialist you want to consult today? :\n" +
                    "1. Doctor\n" +
                    "2. Stylist\n" +
                    "3. Main menu\n" +
                    "0. Exit");
            option = sc.nextInt();
        }

        switch(option){
            case 1:
                doctorAppointment();
                break;
            case 2:
                stylistAppointment();
                break;
            case 3:
                generalMenu();
                break;
            case 4:
                System.out.println("Thank you for you visit");
                System.exit(0);
                break;
            default:
                System.out.println("Please select a valid option");
        }

    }
    public static void doctorAppointment(){
          Doctor doctor = new Doctor();
        Stylist stylist = new Stylist();
        Doctor doctor1 = new Doctor("James","Goodman");
        Doctor doctor2 = new Doctor("Sarah", "Taylor");
          
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
        while(option < 0|| option > 3){
            System.out.println("Please select a valid option");
            System.out.println("Which service you want to select for your pet? :\n" +
                    "1. General medicine\n" +
                    "2. Surgery\n" +
                    "0. Exit");
            option = sc.nextInt();
        }
        switch (option){
            case 1:
                doctor1.setSchedule();
                System.out.println("Date assigned with the doctor: " + doctor1.getName() + " " + doctor1.getSurname() );
                break;
            case 2:
                doctor2.setSchedule();
                System.out.println("Date assigned with the doctor: " + doctor2.getName() + " " + doctor2.getSurname() );
                break;
            case 3:
                generalMenu();
                break;
            default:
                break;
        }
    }
    public static void stylistAppointment(){
    }
}

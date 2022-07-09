package main;

import employee.Doctor;
import employee.Stylist;
import appointments.Medicine;
import patient.*;

import java.awt.desktop.SystemEventListener;
import java.time.LocalDate;
import java.util.Scanner;

import static appointments.Medicine.StockMedicine;

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
      public static void ownersInformation() {
          System.out.println("********************************");
          System.out.println("\t\tOWNER REGISTRATION");
          System.out.println("********************************");
          System.out.println("What's the owner's age?: ");
          //Owner owner = new Owner();
          Scanner sc = new Scanner(System.in);
          String response;
          int age = sc.nextInt();
          if (age >= 18) {
              // owner.setAge(age);
              System.out.println();
              System.out.println("What's the owner's DNI?: ");
              String DNI = sc.nextLine();
              response = sc.nextLine();
              while (response.length() >= 11) {
                  System.out.println("DNI must be 10 digits long ");
                  System.out.println("What's the owner's DNI?: ");
                  response = sc.nextLine();
              }
              //owner.setDNI(response);
              System.out.println();
              System.out.println("What's the owner's cellphone?: ");
              String cellphone = sc.nextLine();
              while (cellphone.length() != 10) {
                  System.out.println("Cellphone must be 10 digits long ");
                  System.out.println("What's the owner's cellphone?: ");
                  cellphone = sc.nextLine();
              }
              //owner.setCellphone(response);
              System.out.println();
              System.out.println("What's the owner's name?: ");
              String name = sc.nextLine();
              // owner.setName(name);
              System.out.println();
              System.out.println("What's the owner's surnname?: ");
              String surname = sc.nextLine();
              //owner.setSurname(surname);

              Owner owner = new Owner(DNI, name, surname, cellphone, age);
              owner.setDNI(response);
              owner.setName(name);
              owner.setSurname(surname);
              owner.setCellphone(cellphone);
              owner.setAge(age);


              //System.out.println(owner.toString());
              System.out.println();
              //petSelection();
              System.out.println("********************************");
              System.out.println("\t\tPATIENT REGISTRATION");
              System.out.println("********************************");
              System.out.println("Please select an option down below");
              //Scanner sc = new Scanner(System.in);
              int select = 0;
              do {
                  System.out.println("1. Cat");
                  System.out.println("2. Dog");
                  System.out.println("0. Exit");
                  select = Integer.valueOf(sc.nextLine());
                  switch (select) {

                      case 1:
                          Cat cat = new Cat();
                          //Scanner sc = new Scanner(System.in);
                          System.out.println("********************************");
                          System.out.println("\t\t\tCAT MENU");
                          System.out.println("********************************");
                          System.out.println("What's your cat's name?: ");
                          String nameCat = sc.nextLine();
                          cat.setName(nameCat);
                          System.out.println("\n");
                          System.out.println("What's your cat's breed?: ");
                          String breed = sc.nextLine();
                          cat.setBreed(breed);
                          System.out.println("\n");
                          System.out.println("Is your cat vaccinated? Y/N: ");
                          String statusVaccines = sc.nextLine();
                          cat.setStatusVaccines(statusVaccines);
                          String generateClinicNumber = cat.getClinicNumber();
                          System.out.println("Last date of deparasitization: ");
                          System.out.println("Day: ");
                          int day = sc.nextInt();
                          System.out.println("Month: ");
                          int month = sc.nextInt();
                          System.out.println("Year: ");
                          int year = sc.nextInt();
                          LocalDate date = LocalDate.of(year, month, day);
                          cat.setdeworming(date);
                          cat.setClinicNumber(generateClinicNumber);
                          cat.setOwner(owner);
                          //owner.toString();
                          System.out.println(cat.toString());
                          //generalMenu();


                          System.out.println("*************************************");
                          System.out.println("\t\tAPPOINTMENTS MENU");
                          System.out.println("*************************************");
                          System.out.println();
                          //Scanner sc = new Scanner(System.in);

                          System.out.println("Which specialist you want to consult today? :\n" +
                                  "1. Doctor\n" +
                                  "2. Stylist\n" +
                                  "3. Main menu\n" +
                                  "0. Exit");
                          int option = sc.nextInt();
                          while (option < 0 || option > 3) {
                              System.out.println("Please select a valid option");
                              System.out.println("Which specialist you want to consult today? :\n" +
                                      "1. Doctor\n" +
                                      "2. Stylist\n" +
                                      "3. Main menu\n" +
                                      "0. Exit");
                              option = sc.nextInt();
                          }
                          if(option ==1){
                              Doctor doctor = new Doctor();
                              doctor.setSchedule();
                              Register register = new Register();
                              register.setCat(cat);
                              register.toString();
                              //doctorAppointment();
                          }else if(option == 2) {
                              stylistAppointment();
                          }else if (option == 3) {
                              generalMenu();
                          }else if (option == 4) {
                              System.out.println("Thank you for you visit");
                              System.exit(0);
                          }else {

                              System.out.println("Please select a valid option");
                          }
                          break;
                      case 2:
                          Dog dog = new Dog();
                          //Scanner sc = new Scanner(System.in);
                          System.out.println("********************************");
                          System.out.println("\t\t\tDOG MENU");
                          System.out.println("********************************");
                          System.out.println("What's your dog's name?: ");
                          String nameDog = sc.nextLine();
                          dog.setName(nameDog);
                          System.out.println("\n");
                          System.out.println("What's your dog's breed?: ");
                          breed = sc.nextLine();
                          dog.setBreed(breed);
                          System.out.println("\n");
                          System.out.println("Is your dog vaccinated? Y/N: ");
                          statusVaccines = sc.nextLine();
                          dog.setStatusVaccines(statusVaccines);
                          System.out.println("Last date of deparasitization: ");
                          System.out.println("Day: ");
                          day = sc.nextInt();
                          System.out.println("Month: ");
                          month = sc.nextInt();
                          System.out.println("Year: ");
                          year = sc.nextInt();
                          date = LocalDate.of(year, month, day);
                          dog.setdeworming(date);
                          generateClinicNumber = dog.getClinicNumber();
                          dog.setClinicNumber(generateClinicNumber);
                          dog.setOwner(owner);
                          //owner.toString();
                          System.out.println(dog.toString());
                          //generalMenu();

                          //dogMenu();


                          System.out.println("*************************************");
                          System.out.println("\t\tAPPOINTMENTS MENU");
                          System.out.println("*************************************");
                          System.out.println();
                          //Scanner sc = new Scanner(System.in);

                          System.out.println("Which specialist you want to consult today? :\n" +
                                  "1. Doctor\n" +
                                  "2. Stylist\n" +
                                  "3. Main menu\n" +
                                  "0. Exit");
                          option = sc.nextInt();
                          while (option < 0 || option > 3) {
                              System.out.println("Please select a valid option");
                              System.out.println("Which specialist you want to consult today? :\n" +
                                      "1. Doctor\n" +
                                      "2. Stylist\n" +
                                      "3. Main menu\n" +
                                      "0. Exit");
                              option = sc.nextInt();
                          }
                          if(option ==1){
                              Doctor doctor = new Doctor();
                              doctor.setSchedule();
                              Register register = new Register();
                              register.setDog(dog);
                              register.toString();
                              //doctorAppointment();
                          }else if(option == 2) {
                              stylistAppointment();
                          }else if (option == 3) {
                              generalMenu();
                          }else if (option == 4) {
                              System.out.println("Thank you for you visit");
                              System.exit(0);
                          }else {

                              System.out.println("Please select a valid option");
                          }
                          break;

                      case 0:
                          System.out.println("Thank you for you visit");
                          break;
                      default:
                          System.out.println("Please select a correct answer");
                          break;
                  }
/*
                  System.out.println("*************************************");
                  System.out.println("\t\tAPPOINTMENTS MENU");
                  System.out.println("*************************************");
                  System.out.println();
                  //Scanner sc = new Scanner(System.in);

                  System.out.println("Which specialist you want to consult today? :\n" +
                          "1. Doctor\n" +
                          "2. Stylist\n" +
                          "3. Main menu\n" +
                          "0. Exit");
                  int option = sc.nextInt();
                  while (option < 0 || option > 3) {
                      System.out.println("Please select a valid option");
                      System.out.println("Which specialist you want to consult today? :\n" +
                              "1. Doctor\n" +
                              "2. Stylist\n" +
                              "3. Main menu\n" +
                              "0. Exit");
                      option = sc.nextInt();
                  }
                  if(option ==1){
                      Doctor doctor = new Doctor();
                      doctor.setSchedule();
                      //Register register = new Register();
                      //register.setCat(cat);
                      doctorAppointment();
                  }else if(option == 2) {
                      stylistAppointment();
                  }else if (option == 3) {
                      generalMenu();
                  }else if (option == 4) {
                      System.out.println("Thank you for you visit");
                      System.exit(0);
                  }else {

                      System.out.println("Please select a valid option");
                  }
*/
              } while (select != 0);

          }


      }





      /*
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

       */
    /*
    public static void catMenu(){
        Patient cat = new Cat();
                          //Scanner sc = new Scanner(System.in);
                          System.out.println("********************************");
                          System.out.println("\t\t\tCAT MENU");
                          System.out.println("********************************");
                          System.out.println("What's your cat's name?: ");
                          String nameCat = sc.nextLine();
                          cat.setName(nameCat);
                          System.out.println("\n");
                          System.out.println("What's your cat's breed?: ");
                          String breed = sc.nextLine();
                          cat.setBreed(breed);
                          System.out.println("\n");
                          System.out.println("Is your cat vaccinated? Y/N: ");
                          String statusVaccines = sc.nextLine();
                          cat.setStatusVaccines(statusVaccines);
                          String generateClinicNumber = cat.getClinicNumber();
                          cat.setClinicNumber(generateClinicNumber);
                          cat.setOwner(owner);
                          //owner.toString();
                          System.out.println(cat.toString());
                          generalMenu();

    }*/
    /*
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

     */
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

                Register register = new Register();
                System.out.println(register.toString());
                generalMenu();
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
        doctor.setSchedule();
        //generalMenu();
    }
    public static void stylistAppointment() {
              Stylist stylist = new Stylist();
              stylist.setSchedule();
              generalMenu();
    }

    public static void medicine(){
            StockMedicine();
        }
        
}

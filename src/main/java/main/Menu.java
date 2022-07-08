package main;

import patient.Cat;
import patient.Dog;
import patient.Owner;
import patient.Patient;
import java.util.Scanner;

public class Menu {
      static Owner ownerInformation() {
            Scanner sc = new Scanner(System.in);
            System.out.println("*************************************");
            System.out.println("Welcome to Sanipet Veterinary care center");
            System.out.println("*************************************");
            System.out.println();
            String response;
            Owner owner = new Owner();
            System.out.println("What's the owner's age?: ");
            int age = sc.nextInt();
            if (age >= 18) {
                owner.setAge(age);
                System.out.println("\n");
                System.out.println("What's the owner's DNI?: ");
                String DNI = sc.nextLine();
                response = sc.nextLine();
                while (response.length() >= 11) {
                    System.out.println("DNI must be 10 digits long ");
                    System.out.println("What's the owner's DNI?: ");
                    response = sc.nextLine();
                }
                owner.setDNI(response);
                System.out.println("\n");
                System.out.println("What's the owner's cellphone?: ");
                String cellphone = sc.nextLine();
                while (cellphone.length() != 10) {
                    System.out.println("Cellphone must be 10 digits long ");
                    System.out.println("What's the owner's cellphone?: ");
                    cellphone = sc.nextLine();
                }
                owner.setCellphone(response);
                System.out.println("\n");
                System.out.println("What's the owner's name?: ");
                response = sc.nextLine();
                owner.setName(response);
                System.out.println("\n");
                System.out.println("What's the owner's surnname?: ");
                response = sc.nextLine();
                owner.setSurname(response);
                System.out.println(owner.toString());
                petMenu();

        }
          return owner;
      }

    public static void petMenu(){
        System.out.println("Please select an option down below");
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
              System.out.println(cat.toString());
              String number = "000000";
              cat.setClinicNumber(number);

              cat.setOwner(owner);
        }
        public static void dogMenu(){

              Patient dog = new Dog();
              Scanner sc = new Scanner(System.in);
              String name = sc.nextLine();
              System.out.println("********************************");
              System.out.println("\t\t\tCAT MENU");
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
              System.out.println(dog.toString());
              String number = "000000";
              dog.setClinicNumber(number);
              dog.setOwner(ownerInformation());
        } /*do {
                      System.out.println("\n\n");
                      System.out.println("Please type the ");
                      System.out.println("1. Book an appointment");
                      System.out.println("2. My appointments");
                      System.out.println("0. Return");

                      Scanner sc = new Scanner(System.in);
                      response = Integer.valueOf(sc.nextLine());

                      switch (response){
                          case 1:
                              System.out.println("::Book an appointment");
                              for (int i = 1; i < 4; i++) {
                                  System.out.println(i + ". " + MONTHS[i]);
                              }
                              break;
                          case 2:
                              System.out.println("::My appointments");
                              break;
                          case 0:
                              showMenu();
                              break;
                      }
                  }while (response != 0);
              }*/



}

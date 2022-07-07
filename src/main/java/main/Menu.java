package main;

import patient.Owner;

import java.util.Scanner;

public class Menu {
      Scanner sc = new Scanner(System.in);
      public static void showMenu(){
            System.out.println("*************************************");
            System.out.println("Welcome to Veterinary care center");
            System.out.println("*************************************");
            System.out.println();
            System.out.println("Please select an option down below");


            int response = 0;
            do {
                System.out.println("1. Cat");
                System.out.println("2. Dog");
                System.out.println("0. Exit");

                Scanner sc = new Scanner(System.in);
                response = Integer.valueOf(sc.nextLine());

                switch (response){
                    case 1:
                        System.out.println("********************************");
                        System.out.println("\t\t\tCAT MENU");
                        System.out.println("********************************");
                        ownerInformation();
                        break;
                    case 2:
                        response = 0;
                        //showPatientMenu();

                        break;
                    case 0:
                        System.out.println("Thank you for you visit");
                        break;
                    default:
                        System.out.println("Please select a correct answer");
                }
            }while (response != 0);
        }

         static void ownerInformation() {
             String response;
             Owner owner = new Owner();
             Scanner sc = new Scanner(System.in);
             System.out.println("What's the owner's age?: ");
             int age = sc.nextInt();
             if(age >= 18){
                   owner.setAge(age);
                   System.out.println("\n");
                   System.out.println("What's the owner's DNI?: ");
                   String DNI = sc.nextLine();
                   response = sc.nextLine();
                   if(DNI.length() <= 10){
                         owner.setDNI(response);
                         System.out.println("\n");
                         System.out.println("What's the owner's cellphone?: ");
                         String cellphone = sc.nextLine();
                         if(cellphone.length() == 10){
                               owner.setCellphone(response);
                               System.out.println("\n");
                               System.out.println("What's the owner's name?: ");
                               response = sc.nextLine();
                               owner.setName(response);
                               System.out.println("\n");
                               System.out.println("What's the owner's surnname?: ");
                               response = sc.nextLine();
                               owner.setSurname(response);
                         }else{
                               System.out.println("Cellphone must be 10 digits long ");
                               System.exit(0);
                         }
                   }else{
                         System.out.println("DNI must be 10 digits long ");
                         System.exit(0);
                   }       
             }else{
                 System.out.println("You must be 18 years old ");
                 System.exit(0);
             }
             System.out.println(owner.toString());

      }
      /*do {
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

package main;

import patient.Cat;
import patient.Owner;
import patient.Patient;

import java.sql.SQLOutput;
import java.util.*;

import java.awt.geom.Path2D;
import java.util.Scanner;

public class Main {
    /*public static void CatPatient(){

        System.out.println("What is the name of your cat?: ");
        Scanner scan = new Scanner(System.in);
        String nombre = scan.nextLine();
        System.out.println("Welcome " + nombre);

    }

    public static void DogPatient(){
        System.out.println("What is the name of your dog?: ");
        Scanner scan = new Scanner(System.in);
        String nombre = scan.nextLine();
        System.out.println("Welcome " + nombre);

    }*/
    public static void main(String[] args) {
        /*System.out.println("*************************************");
        System.out.println("Welcome to Veterinary care center");
        System.out.println("*************************************");
        System.out.println();


        /*
        Owner owner2 = new Owner("1216719011","Steven", "3014707469", 26, "Duque");
        System.out.println(owner2.toString());


        boolean valid = false;

        while (valid == false){
            System.out.println("The patient is a cat or a dog?: ");
            Scanner scan = new Scanner(System.in);
            String patient = scan.nextLine();
            if(patient.equalsIgnoreCase("cat")){
                System.out.println("What is the name of your cat?: ");
                //Scanner scan = new Scanner(System.in);
                String name = scan.nextLine();
                System.out.println("Breed?: ");
                String breed = scan.nextLine();
                System.out.println("Vaccinated? Y/N: ");
                String statusVaccines = scan.nextLine();


               // Scanner scan = new Scanner(System.in);
                System.out.println("What's the owner's name?: ");
                String ownerName = scan.nextLine();

                while (ownerAge <18){
                    System.out.println("You must be 18 years old or more");
                    System.out.println("What's the owner's age?: ");
                    ownerAge = scan.nextInt();

                }

                Owner owner  = new Owner(ownerDNI,ownerName, ownerPhone, ownerAge, ownerSurName);
                owner.setDNI(ownerDNI);
                owner.setName(ownerName);
                owner.setCellphone(ownerPhone);
                owner.setAge(ownerAge);
                owner.setSurname(ownerSurName);

                ArrayList<Owner> owners = new ArrayList<Owner>();
                owners.add(owner);

                Patient pet = new Cat();
                String historyNumber = pet.generateNumber();
                Date date = new Date(117,6,25);
                pet.setClinicNumber(historyNumber);
                pet.setName(name);
                pet.setBreed(breed);
                pet.setOwner(owner);
                pet.setStatusVaccines(true);
                pet.setDesparasization(date);
                System.out.println(pet.toString());
                valid = true;



            }
            else if(patient.equalsIgnoreCase("dog")){
                DogPatient();
                valid = true;
            }else {
                System.out.println("Introduce a valid option");
                valid = false;
            }

        }(/
*/
            Menu m = new Menu();
            m.ownerInformation();
        }
}





package appointments;

import java.util.Scanner;

public class Medicine {
    private static String name;
    private static String presentation;
    private static String usage;
    private static String dose;
    private static int stock;

    private static int price;
    public Medicine() {
    }

    public Medicine(String name, int stock) {
        this.name = name;
        this.stock = stock;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
    public static int getPrice() {
        return price;
    }
    public static void setPrice(int price) {
        Medicine.price = price;
    }
    public void GlobalStock (){

        Medicine Marboquin      = new Medicine();
        Medicine Ibuprofeno     = new Medicine();
        //Medicine Bismopet       = new Medicine(  "Bismopet"       , "Syrup"    , "Veterinarian" , "3 mg"   , 10,5);
        //Medicine Benzodiazepina = new Medicine(  "Benzodiazepina" , "Syrup"    , "Human"        , "50 ml"  , 10,5);
        //Medicine Aminomix       = new Medicine(  "Aminomix"       , "Pills"    , "Veterinarian" , "100 mg" , 10,5);
        //Medicine ArtriTabs      = new Medicine(  "Artri-Tabs"     , "Pills"    , "Veterinarian" , "100 mg" , 10,5);
        //Medicine Asuntol        = new Medicine(  "Asuntol"        , "Pet-care" , "Veterinarian" , "120 g"  , 10,5);
        //Medicine Dinki          = new Medicine(  "Dinki"          , "Pet-care" , "Veterinarian" , "200 ml" , 10,5);
        Marboquin.setName("Marboquin");
        Marboquin.setStock(10);
        Ibuprofeno.setName("Ibuprofeno");
        Ibuprofeno.setStock(10);
        Scanner sc = new Scanner(System.in);
        System.out.println("Which type of medicine do you need:\n" +
                "1. Pills\n" +
                "2. Syrup\n" +
                "3. Pet-care");
        int type = sc.nextInt();
        switch (type){
            case 1:
                System.out.println("Choose the pills that you need:\n" +
                        "1. Marboquin\n" +
                        "2. Ibuprofeno\n" +
                        "3. Aminomix\n" +
                        "4. AtriTabs\n" +
                        "");
                int pill = sc.nextInt();
                if (pill == 1){
                    System.out.println("How much "+ Marboquin.getName() + " quantity in stock do you need?:\n ");
                    int quantity = sc.nextInt();
                    if(quantity <= Marboquin.getStock()) {
                        System.out.println("You bougth " + quantity + " units of " + Marboquin.getName());
                        int marboStock = Marboquin.getStock() - quantity;
                        Marboquin.setStock(marboStock);
                        System.out.println(Marboquin.getStock() + " Marboquin remaining in stock");

                    }else{
                        System.out.println("The stock is insufficient. There are: " + Marboquin.getStock() + "units");
                    }
                }else if(pill == 2) {
                    System.out.println("How much "+ Ibuprofeno.getName() + " quantity in stock do you need?:\n");
                    int quantity = sc.nextInt();
                    if (quantity <= Ibuprofeno.getStock()){
                        System.out.println("You bougth " + quantity + " units of " + Ibuprofeno.getName() );
                        int stock = Ibuprofeno.getStock() - quantity;
                        Ibuprofeno.setStock(stock);
                        System.out.println(Ibuprofeno.getStock() + " Ibuprofeno remaining in stock");
                    }else{
                        System.out.println("The stock is insufficient. There are: " + Ibuprofeno.getStock() + "units");
                    }/*
                }else if (pill == 3) {
                    System.out.println("What quantity of stock do you need?:\n ");
                    int quantity = sc.nextInt();
                    if (quantity <= Aminomix.getStock()){
                        System.out.println("You bougth " + quantity + " units of " + Aminomix.getName() );
                        int stock = Aminomix.getStock() - quantity;
                        Aminomix.setStock(stock);
                        System.out.println(Aminomix.getStock() + " Aminomix remaining in stock");
                    }else{
                        System.out.println("The stock is insufficient. There are: " + Aminomix.getStock() + "units");
                    }
                }else if (pill == 4) {
                    System.out.println("What quantity of stock do you need?:\n ");
                    int quantity = sc.nextInt();
                    if (quantity <= ArtriTabs.getStock()){
                        System.out.println("You bougth " + quantity + " units of " + ArtriTabs.getName() );
                        int stock = ArtriTabs.getStock() - quantity;
                        ArtriTabs.setStock(stock);
                        System.out.println(ArtriTabs.getStock() + " ArtriTabs remaining in stock");
                    }else{
                        System.out.println("The stock is insufficient. There are: " + ArtriTabs.getStock() + "units");
                    }
                }
                break;
            case 2:
                System.out.println("Choose the syrup that you need:\n" +
                        "1. Bismopet\n" +
                        "2. Benzodiazepina\n" +
                        "");
                int syrup = sc.nextInt();
                if (syrup == 1){
                    System.out.println("What quantity of stock do you need?:\n ");
                    int quantity = sc.nextInt();
                    if(quantity <= Bismopet.getStock()) {
                        System.out.println("You bougth " + quantity + " units of " + Bismopet.getName());
                        int stock = Bismopet.getStock() - quantity;
                        Marboquin.setStock(stock);
                        System.out.println(Bismopet.getStock() + " Marboquin remaining in stock");
                    }else{
                        System.out.println("The stock is insufficient. There are: " + Marboquin.getStock() + "units");
                    }
                }else if(syrup == 2) {
                    System.out.println("What quantity of stock do you need?:\n ");
                    int quantity = sc.nextInt();
                    if (quantity <= Benzodiazepina.getStock()){
                        System.out.println("You bougth " + quantity + " units of " + Benzodiazepina.getName() );
                        int stock = Benzodiazepina.getStock() - quantity;
                        Benzodiazepina.setStock(stock);
                        System.out.println(Benzodiazepina.getStock() + " Benzodiazepina remaining in stock");

                    }else{
                        System.out.println("The stock is insufficient. There are: " + Benzodiazepina.getStock() + "units");
                    }
                }
                break;
            case 3:
                System.out.println("Choose the pills that you need:\n" +
                        "1. Asuntol\n" +
                        //"2. Dinki\n" +
                        "");
                int care = sc.nextInt();
                if (care == 1){
                    System.out.println("What quantity of stock do you need?:\n ");
                    int quantity = sc.nextInt();
                    if(quantity <= Asuntol.getStock()) {
                        System.out.println("You bougth " + quantity + " units of " + Asuntol.getName());
                        int stock = Asuntol.getStock() - quantity;
                        Asuntol.setStock(stock);
                        System.out.println(Asuntol.getStock() + " Asuntol remaining in stock");
                    }else{
                        System.out.println("The stock is insufficient. There are: " + Asuntol.getStock() + "units");
                    }
                }if (care == 2){
                System.out.println("What quantity of stock do you need?:\n ");
                int quantity = sc.nextInt();
                if(quantity <= Dinki.getStock()) {
                    System.out.println("You bougth " + quantity + " units of " + Dinki.getName());
                    int stock = Dinki.getStock() - quantity;
                    Dinki.setStock(stock);
                    System.out.println(Dinki.getStock() + " Dinki remaining in stock");

                }else{
                    System.out.println("The stock is insufficient. There are: " + Dinki.getStock() + "units");
                }
            }*/
        }
        System.out.println("********************************");
        System.out.println("\t\tTOTAL EXISTING STOCK");
        System.out.println("********************************");
        System.out.println("Marboquin = " + Marboquin.getStock());
        System.out.println("Ibuprofeno = " +Ibuprofeno.getStock());
        /*System.out.println("Bismopet = " + Bismopet.getStock());
        System.out.println("Benzodiazepina = " + Benzodiazepina.getStock());
        System.out.println("ArtriTabs = " + ArtriTabs.getStock());
        System.out.println("Asuntol = " + Asuntol.getStock());
        System.out.println("Dinki = " + Dinki.getStock());*/
    }}

    public void marboquin(){
        presentation = "Pills";
        usage = "Veterinarian";
        dose= "25 mg";
        price = 20000;
    }
    public void ibuprofeno(){
        presentation = "Pills";
        usage = "Human";
        dose= "3 mg";
        price = 8000;
    }
    /*public String toString() {
            return "Medicine{" +
                    "name='" + name + '\'' +
                    ", presentation='" + presentation + '\'' +
                    ", usage='" + usage + '\'' +
                    ", dose=" + dose +
                    ", stock=" + stock +
                    '}';*/
    }


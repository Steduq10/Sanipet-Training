package appointments;

import java.util.Scanner;

public class Medicine {
    private static String name;
    private static String presentation;
    private static String usage;
    private static String dosis;
    private static int stock;

    private static int price;
    public Medicine() {
    }

    public Medicine(String name, String presentation, String usage, String dosis, int stock, int price) {
        this.name = name;
        this.presentation = presentation;
        this.usage = usage;
        this.dosis = dosis;
        this.stock = stock;
        this.price = price;
    }

    public void decreaseStock(int decreaseBy){
        this.stock -= decreaseBy;
    }

    public void increaseStock(int increaseBy){
        this.stock += increaseBy;
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
        Medicine Marboquin      = new Medicine(  "Marboquin"      , "Pills"    , "Veterinarian" , "25 mg"  , 10,5);
        Medicine Ibuprofeno     = new Medicine(  "Ibuprofeno"     , "Pills"    , "Human"        , "3 mg"   , 10,5);
        Medicine Bismopet       = new Medicine(  "Bismopet"       , "Syrup"    , "Veterinarian" , "3 mg"   , 10,5);
        Medicine Benzodiazepina = new Medicine(  "Benzodiazepina" , "Syrup"    , "Human"        , "50 ml"  , 10,5);
        Medicine Aminomix       = new Medicine(  "Aminomix"       , "Pills"    , "Veterinarian" , "100 mg" , 10,5);
        Medicine ArtriTabs      = new Medicine(  "Artri-Tabs"     , "Pills"    , "Veterinarian" , "100 mg" , 10,5);
        Medicine Asuntol        = new Medicine(  "Asuntol"        , "Pet-care" , "Veterinarian" , "120 g"  , 10,5);
        Medicine Dinki          = new Medicine(  "Dinki"          , "Pet-care" , "Veterinarian" , "200 ml" , 10,5);
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
                    System.out.println("What quantity of stock do you need?:\n ");
                    int quantity = sc.nextInt();
                    if(quantity <= Marboquin.getStock()) {
                        System.out.println("You bougth " + quantity + " units of " + Marboquin.getName());
                        int stock = Marboquin.getStock() - quantity;
                        Marboquin.setStock(stock);
                        System.out.println(Marboquin.getStock());
                    }else{
                        System.out.println("The stock is insufficient. There are: " + Marboquin.getStock() + "units");
                    }
                }else if(pill == 2) {
                    System.out.println("What quantity of stock do you need?:\n ");
                    int quantity = sc.nextInt();
                    if (quantity <= Ibuprofeno.getStock()){
                        System.out.println("You bougth " + quantity + "units of " + Ibuprofeno.getName() );
                        int stock = Ibuprofeno.getStock() - quantity;
                        Ibuprofeno.setStock(stock);
                    }else{
                        System.out.println("The stock is insufficient. There are: " + Ibuprofeno.getStock() + "units");
                    }
                }else if (pill == 3) {
                    System.out.println("What quantity of stock do you need?:\n ");
                    int quantity = sc.nextInt();
                    if (quantity <= Aminomix.getStock()){
                        System.out.println("You bougth " + quantity + "units of " + Aminomix.getName() );
                        int stock = Aminomix.getStock() - quantity;
                        Aminomix.setStock(stock);
                    }else{
                        System.out.println("The stock is insufficient. There are: " + Aminomix.getStock() + "units");
                    }
                }else if (pill == 4) {
                    System.out.println("What quantity of stock do you need?:\n ");
                    int quantity = sc.nextInt();
                    if (quantity <= ArtriTabs.getStock()){
                        System.out.println("You bougth " + quantity + "units of " + ArtriTabs.getName() );
                        int stock = ArtriTabs.getStock() - quantity;
                        ArtriTabs.setStock(stock);
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
                        System.out.println("You bougth " + quantity + "units of " + Bismopet.getName());
                        int stock = Bismopet.getStock() - quantity;
                        Marboquin.setStock(stock);
                    }else{
                        System.out.println("The stock is insufficient. There are: " + Marboquin.getStock() + "units");
                    }
                }else if(syrup == 2) {
                    System.out.println("What quantity of stock do you need?:\n ");
                    int quantity = sc.nextInt();
                    if (quantity <= Benzodiazepina.getStock()){
                        System.out.println("You bougth " + quantity + "units of " + Benzodiazepina.getName() );
                        int stock = Benzodiazepina.getStock() - quantity;
                        Benzodiazepina.setStock(stock);
                    }else{
                        System.out.println("The stock is insufficient. There are: " + Benzodiazepina.getStock() + "units");
                    }
                }
                break;
            case 3:
                System.out.println("Choose the pills that you need:\n" +
                        "1. Asuntol\n" +
                        "2. Dinki\n" +
                        "");
                int care = sc.nextInt();
                if (care == 1){
                    System.out.println("What quantity of stock do you need?:\n ");
                    int quantity = sc.nextInt();
                    if(quantity <= Asuntol.getStock()) {
                        System.out.println("You bougth " + quantity + " units of " + Asuntol.getName());
                        int stock = Asuntol.getStock() - quantity;
                        Asuntol.setStock(stock);
                        System.out.println(Asuntol.getStock() + " units left in the stock");
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
                    System.out.println(Dinki.getStock() + " units left in the stock");
                }else{
                    System.out.println("The stock is insufficient. There are: " + Dinki.getStock() + "units");
                }
            }
        }
    }
    public String toString() {
        return "Medicine{" +
                "name='" + name + '\'' +
                ", presentation='" + presentation + '\'' +
                ", usage='" + usage + '\'' +
                ", dosis=" + dosis +
                ", stock=" + stock +
                '}';
    }
}

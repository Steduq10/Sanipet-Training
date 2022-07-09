package appointments;

public class Medicine {
    private static String name;
    private static String presentation;
    private static String usage;
    private static String dosis;
    private static int stock;

    public Medicine() {
    }

    public Medicine(String name, String presentation, String usage, String dosis, int stock) {
        this.name = name;
        this.presentation = presentation;
        this.usage = usage;
        this.dosis = dosis;
        this.stock = stock;
    }

    public void decreaseStock(int decreaseBy){
        this.stock -= decreaseBy;
    }

    public void increaseStock(int increaseBy){
        this.stock += increaseBy;
    }

    public static void stockGeneral(){
        Medicine Marboquin      = new Medicine(  "Marboquin"      , "Pills", "Veterinarian" , "25 mg"  , 10);
        Medicine Ibuprofeno     = new Medicine(  "Ibuprofeno"     , "Pills", "Human"        , "3 mg"   , 10);
        System.out.println(Marboquin.toString());
        System.out.println(Ibuprofeno.toString());
    }
    public static void stockSurgeryl(){
        Medicine Bismopet       = new Medicine(  "Bismopet"       , "Syrup", "Veterinarian" , "3 mg"   , 10);
        Medicine Benzodiazepina = new Medicine(  "Benzodiazepina" , "Syrup", "Human"        , "50 ml"  , 10);
    }

    public static void stockPetCare(){
        Medicine Aminomix       = new Medicine(  "Aminomix"       , "Pills", "Veterinarian" , "100 mg" , 10);
        Medicine ArtriTabs      = new Medicine(  "Artri-Tabs"     , "Pills", "Veterinarian" , "100 mg" , 10);
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
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

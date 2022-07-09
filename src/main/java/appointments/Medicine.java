package appointments;

public class Medicine {
    private String name;
    private String presentation;
    private String usage;
    private String dosis;
    private int stock;

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

    public static void StockMedicine(){
        Medicine Marboquin      = new Medicine(  "Marboquin"      , "Pills", "Veterinarian" , "25 mg"  , 10);
        Medicine Ibuprofeno     = new Medicine(  "Ibuprofeno"     , "Pills", "Human"        , "3 mg"   , 10);
        Medicine Bismopet       = new Medicine(  "Bismopet"       , "Syrup", "Veterinarian" , "3 mg"   , 10);
        Medicine Benzodiazepina = new Medicine(  "Benzodiazepina" , "Syrup", "Human"        , "50 ml"  , 10);
        Medicine Aminomix       = new Medicine(  "Aminomix"       , "Pills", "Veterinarian" , "100 mg" , 10);
        Medicine ArtriTabs      = new Medicine(  "Artri-Tabs"     , "Pills", "Veterinarian" , "100 mg" , 10);
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
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

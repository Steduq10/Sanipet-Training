package appointments;

public class Medicine {
    private String name;
    private Presentation presentation;
    private String usage;
    private int dosis;
    private int stock;

    public Medicine(String name, Presentation presentation, String usage, int dosis, int stock) {
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
package patient;

public class Owner {
    private String DNI;
    private String name;
    private String surname;
    private String cellphone;
    private int age;

    public Owner() {
    }

    public Owner(String DNI, String name, String cellphone, int age, String surname) {
        this.DNI = DNI;
        this.name = name;
        this.cellphone = cellphone;
        this.age = age;
        this.surname = surname;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
         if(DNI.length() == 10){
             this.DNI = DNI;
         }else{
         System.out.println("DNI must be 10 digits long");
         }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        if(cellphone.length() == 10){
            this.cellphone = cellphone;
        }else{
            System.out.println("Cellphone number must be 10 digits");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "DNI='" + DNI + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", cellphone='" + cellphone + '\'' +
                ", age=" + age +
                '}';
    }
}

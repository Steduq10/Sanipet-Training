package patient;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
public class Owner {
    private String DNI;
    private String name;
    private String surname;
    private String completeName;
    private String cellphone;
    private int age;

    public Owner() {
    }


    public Owner(String DNI, String name, String surname, String completeName, String cellphone, int age) {
        this.DNI = DNI;
        this.name = name;
        this.surname = surname;
        this.completeName = completeName;
        this.cellphone = cellphone;
        this.age = age;
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
        String ownerInformation = null;
        try {
            ownerInformation = "Owner [" +
                    "DNI = " + DNI +
                    " , Name = " + name + " " +
                    ", Surname = " + surname + " " +
                    ", Cellphone = " + cellphone + " " +
                    ", Age = " + age +
                    " ]";
            String route = "E:\\Documents\\Documents\\SOFKADEV\\Sanipet-Training\\ownerInformation.txt";
            File file = new File(route);
            // Si el archivo no existe es creado
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("Owner Register Information\n");
            bw.write(ownerInformation);
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ownerInformation;
    }
}

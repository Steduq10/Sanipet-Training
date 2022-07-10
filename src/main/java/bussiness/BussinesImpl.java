package bussiness;

import DataAccess.DataAccessImpl;
import DataAccess.IDataAccess;
import employee.Doctor;
import employee.Stylist;
import exceptions.DataAccessEx;
import exceptions.DataReadingEx;
import patient.Cat;
import patient.Dog;

public class BussinesImpl implements IBussiness {
    private final IDataAccess data;

    @Override
    public void addCat(String FILE_NAME, Cat cat) {
        boolean attach = false;
        try {
            attach = data.exists(FILE_NAME);
            data.writeFile(FILE_NAME, cat, attach);
        } catch (DataAccessEx e) {
            System.out.println("Data access error");
            e.printStackTrace(System.out);;
        }

    }

    @Override
    public void addDog(String FILE_NAME, Dog dog) {
        boolean attach = false;
        try {
            attach = data.exists(FILE_NAME);
            data.writeFile(FILE_NAME, dog, attach);
        } catch (DataAccessEx e) {
            System.out.println("Data access error");
            e.printStackTrace(System.out);;
        }
    }

    @Override
    public void addDoctor(String FILE_NAME, Doctor doctor) {
        boolean attach = false;
        try {
            attach = data.exists(FILE_NAME);
            data.writeFile(FILE_NAME, doctor, attach);
        } catch (DataAccessEx e) {
            System.out.println("Data access error");
            e.printStackTrace(System.out);;
        }
    }

    @Override
    public void addStylist(String FILE_NAME, Stylist stylist) {
        boolean attach = false;
        try {
            attach = data.exists(FILE_NAME);
            data.writeFile(FILE_NAME, stylist, attach);
        } catch (DataAccessEx e) {
            System.out.println("Data access error");
            e.printStackTrace(System.out);;
        }
    }

    public BussinesImpl() {
        this.data = new DataAccessImpl();
    }

    @Override
    public void list() {
        try {
            var cats = this.data.list(FILE_NAME);
            for (var cat: cats){
                System.out.println(cat);
            }
        } catch (DataReadingEx e) {
            System.out.println("Data access error");
            e.printStackTrace(System.out);
        }
    }

    @Override
    public void starthistory() {
        try {
            if(this.data.exists(FILE_NAME)){
                data.remove(FILE_NAME);
                data.create(FILE_NAME);

            }else {
                data.create(FILE_NAME);
            }
        } catch (DataAccessEx e) {
            System.out.println("Error starting history");
            e.printStackTrace(System.out);
        }
    }
}

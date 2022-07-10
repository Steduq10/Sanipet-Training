package DataAccess;

import employee.Doctor;
import employee.Stylist;
import exceptions.DataAccessEx;
import exceptions.DataReadingEx;
import exceptions.DataWritingEx;
import patient.Cat;
import patient.Patient;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DataAccessImpl implements IDataAccess {

    @Override
    public boolean exists(String filename) throws DataAccessEx {
        var file = new File(filename);
        return file.exists();
    }

    @Override
    public void createFile(String fileName) throws DataAccessEx {
        var file = new File(fileName);
        try {
            var out = new PrintWriter(new FileWriter(file));
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
            throw new DataAccessEx("Exception:" + e.getMessage());
        }
    }

    @Override
    public void writeFile(String filename, Patient patient, boolean attach) throws DataWritingEx {
    var file = new File(filename);
        try {
            var out = new PrintWriter(new FileWriter(file, attach));
            out.println(patient.toString());
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
           throw new DataWritingEx("Exception:" + e.getMessage());
        }
    }

    @Override
    public void writeFile(String filename, Stylist stylist, boolean attach) throws DataWritingEx {
        var file = new File(filename);
        try {
            var out = new PrintWriter(new FileWriter(file, attach));
            out.println(stylist.toString());
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
            throw new DataWritingEx("Exception:" + e.getMessage());
        }
    }

    @Override
    public void writeFile(String filename, Doctor doctor, boolean attach) throws DataWritingEx {
        var file = new File(filename);
        try {
            var out = new PrintWriter(new FileWriter(file, attach));
            out.println(doctor.toString());
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
            throw new DataWritingEx("Exception:" + e.getMessage());
        }
    }

    @Override
    public List<Cat> list(String fileName) throws DataReadingEx {
        var file = new File(fileName);
        List<Cat> cats = new ArrayList<Cat>();
        try {
            BufferedReader input = new BufferedReader(new FileReader(file));
            String clinicNumber;
            clinicNumber = input.readLine();
            while (clinicNumber != null){
                var cat = new Cat();
            }
            input.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            try {
                throw new DataWritingEx("Exception:" + e.getMessage());
            } catch (DataWritingEx ex) {
                throw new RuntimeException(ex);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return cats;
    }

    @Override
    public void create(String fileName) throws DataAccessEx {
        var file = new File(fileName);
        try {
            var out = new PrintWriter(new FileWriter(file));
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
            throw new DataAccessEx("Excepcion al crear el historial:" + e.getMessage());
        }
    }

    @Override
    public void remove(String fileName) throws DataAccessEx {
        var file = new File(fileName);
        if (file.exists()) {
            file.delete();
        }
    }

}

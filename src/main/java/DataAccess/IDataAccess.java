package DataAccess;

import employee.Doctor;
import employee.Stylist;
import exceptions.DataAccessEx;
import exceptions.DataReadingEx;
import exceptions.DataWritingEx;
import patient.Cat;
import patient.Patient;

import java.util.List;

public interface IDataAccess {

    boolean exists(String filename) throws DataAccessEx;
    void createFile(String fileName) throws DataAccessEx;
    void writeFile(String nombreArchivo, Patient patient, boolean anexar) throws DataWritingEx;
    void writeFile(String nombreArchivo, Stylist stylist, boolean anexar) throws DataWritingEx;
    void writeFile(String nombreArchivo, Doctor doctor, boolean anexar) throws DataWritingEx;
    List<Cat> list (String fileName) throws DataReadingEx;
    void create(String nombreArchivo) throws DataAccessEx;

    void remove (String nombreArchivo) throws DataAccessEx;
}

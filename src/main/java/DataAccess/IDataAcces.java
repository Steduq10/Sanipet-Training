package DataAccess;

import employee.Doctor;
import employee.Stylist;
import exceptions.DataAccessEx;
import exceptions.DataWritingEx;
import patient.Owner;
import patient.Patient;

abstract interface IDataAccess {


        boolean exist(String filename) throws DataAccessEx;
        void createFile(String filename) throws DataAccessEx;
        void writeFile(String filename, Owner owner, boolean attach) throws DataWritingEx;
        void writeFile(String filename, Patient patient, boolean attach) throws DataWritingEx;
        void writeFile(String filename, Doctor doctor, boolean attach) throws DataWritingEx;
        void writeFile(String filename, Stylist stylist, boolean attach) throws DataWritingEx;
        //List<Jugador> listar (String nombreArchivo) throws LecturaDatosEx;
        //void crear(String nombreArchivo) throws AccesoDatosEx;

        void remove(String nombreArchivo) throws DataAccessEx;

    }

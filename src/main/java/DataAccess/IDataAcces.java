package DataAccess;

import exceptions.DataAccessEx;
import exceptions.DataWritingEx;
import patient.Owner;

public interface IDataAcces {


        boolean exist(String filename) throws DataAccessEx;
        void createFile(String filename) throws DataAccessEx;
        void writeFile(String filename, Owner owner, boolean attach) throws DataWritingEx;
        void writeFile(String filename, Patient pati, boolean attach) throws DataWritingEx;
        //List<Jugador> listar (String nombreArchivo) throws LecturaDatosEx;
        //void crear(String nombreArchivo) throws AccesoDatosEx;

        void remove(String nombreArchivo) throws DataAccessEx;

    }

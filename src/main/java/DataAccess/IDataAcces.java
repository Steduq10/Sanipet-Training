package DataAccess;

import exceptions.DataAccessEx;

public interface IDataAcces {


        boolean exist(String filename) throws DataAccessEx;
        void createFile(String filename) throws DataAccessEx;
        //void writeFile(String nombreArchivo, Jugador jugador, boolean anexar) throws EscrituraDatosEx;
        //List<Jugador> listar (String nombreArchivo) throws LecturaDatosEx;
        //void crear(String nombreArchivo) throws AccesoDatosEx;

        void remove(String nombreArchivo) throws DataAccessEx;

    }

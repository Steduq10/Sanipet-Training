package DataAccess;

import exceptions.DataAccessEx;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public abstract class DataAccessImpl implements IDataAccess{

    /*@Override
    public boolean exist(String filename) throws DataAccessEx {
        var file = new File(filename);
        return file.exists();
    }

    @Override
    public void createFile(String filename) throws DataAccessEx {
    var file = new File(filename);
            try {
                var out = new PrintWriter(new FileWriter(file));
                out.close();
              
            } catch (IOException ex) {
                ex.printStackTrace();
                throw new DataAccessEx("Exception :" + ex.getMessage());
            }
    }
    @Override
        public void writeFile(String filename, Owner owner, boolean anexar) throws EscrituraDatosEx {
            var archivo = new File(nombreArchivo);
            try {
                var salida = new PrintWriter(new FileWriter(archivo, anexar));
                salida.println(jugador.toString());
                salida.close();
              //  System.out.println("Se ha escrito informacion al archivo: " + jugador);
            } catch (IOException ex) {
                ex.printStackTrace();
                throw new EscrituraDatosEx("Excepcion al escribir información:" + ex.getMessage());
            }
        }

    @Override
    public void remove(String nombreArchivo) throws DataAccessEx {

    }*/

}

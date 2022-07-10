package DataAccess;

import exceptions.DataAccessEx;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class DataAccessImpl implements IDataAcces{

    @Override
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
              //  System.out.println("Se ha creado el archivo");
            } catch (IOException ex) {
                ex.printStackTrace();
                throw new DataAccessEx("Exception :" + ex.getMessage());
            }
    }

    @Override
    public void remove(String nombreArchivo) throws DataAccessEx {

    }
}

package DataAccess;

import exceptions.DataAccessEx;

import java.io.File;

public class DataAccessImpl implements IDataAcces{

    @Override
    public boolean exist(String filename) throws DataAccessEx {
        var file = new File(filename);
        return file.exists();
    }

    @Override
    public void createFile(String filename) throws DataAccessEx {

    }

    @Override
    public void remove(String nombreArchivo) throws DataAccessEx {

    }
}

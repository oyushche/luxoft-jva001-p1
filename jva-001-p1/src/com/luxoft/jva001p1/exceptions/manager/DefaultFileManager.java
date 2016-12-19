package com.luxoft.jva001p1.exceptions.manager;

import java.io.FileNotFoundException;
import java.io.IOException;

public class DefaultFileManager implements FileManager
{
    @Override
    public boolean openFile()
    {
        return false;
    }

    @Override
    public boolean readFile()
    {
        return false;
    }

    @Override
    public boolean closeFile()
    {
        return false;
    }

    public static void main(String[] args)
    {
        FileManager manager = new DefaultFileManager();
        try
        {
            manager.openFile();
            manager.readFile();
            manager.closeFile();
        }
        catch (FileNotFoundException e) { System.out.println("Can't open the file."); }

        catch (IOException e) { System.out.println("Can't read from file."); }

        catch (FileCloseException e) { System.out.println("Can't close the file."); }
    }
}

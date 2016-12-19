package com.luxoft.jva001p1.exceptions.manager;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface FileManager
{
    boolean openFile() throws FileNotFoundException;

    boolean readFile() throws IOException;

    boolean closeFile() throws FileCloseException;
}

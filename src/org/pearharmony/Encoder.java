package org.pearharmony;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class Encoder {
    public byte[] textEncode(String _string)
    {
        return (_string+"[eof]").getBytes();
    }
    public byte[] pictureEncode(File _fi)
    {
        byte[] fileContent;
        try {
            fileContent = Files.readAllBytes(_fi.toPath());
            return fileContent;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}

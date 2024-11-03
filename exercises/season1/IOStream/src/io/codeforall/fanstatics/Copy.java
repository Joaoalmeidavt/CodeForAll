package io.codeforall.fanstatics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copy {
    private String filename;

    public Copy(String filename){
        this.filename = filename;
    }

    public void copy() throws IOException {
        FileInputStream inputStream = new FileInputStream(this.filename);
        FileOutputStream outputStream = new FileOutputStream(this.filename + "_copy");

        int bytesRead = 1024;
        byte[] buffer = new byte[bytesRead];

        while ((bytesRead = inputStream.read(buffer)) != -1) {
            outputStream.write(buffer, 0, bytesRead);  // Write only the bytes that were read
        }

        inputStream.close();
        outputStream.close();
    }
}

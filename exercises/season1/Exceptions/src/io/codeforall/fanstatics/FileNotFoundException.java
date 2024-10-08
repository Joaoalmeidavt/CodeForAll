package io.codeforall.fanstatics;

public class FileNotFoundException extends FileException {

    public FileNotFoundException(){
        System.out.println("File Not Found exception");
    }

    public FileNotFoundException(String s){
        super(s);
    }
}

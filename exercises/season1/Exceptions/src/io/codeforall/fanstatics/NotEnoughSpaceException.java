package io.codeforall.fanstatics;

public class NotEnoughSpaceException extends FileException {
    public NotEnoughSpaceException(){
        System.out.println("Not enough permissions");
    }

    public NotEnoughSpaceException(String s){
       super(s);
    }
}

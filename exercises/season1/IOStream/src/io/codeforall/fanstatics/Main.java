package io.codeforall.fanstatics;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Copy copyFile = new Copy("rsc/bohemianRhapsody.txt");
        try {
            copyFile.copy();
        } catch (IOException ex){
            ex.getMessage();
        }
    }
}

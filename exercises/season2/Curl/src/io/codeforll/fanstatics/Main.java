package io.codeforll.fanstatics;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.net.URL;

public class Main {
    public static void main(String[] args) throws Exception {

        String urlStr = "https://www.google.com";
        URL url = new URL(urlStr);

        InputStream inputStream = url.openStream();
        BufferedInputStream reader = new BufferedInputStream(inputStream);

        int c;
        while((c = reader.read()) != -1){
            System.out.print((char) c);
        }


    }
}

package io.codeforall.fanstatics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        String hostname = "localhost";
        int port = 8080;

        Socket clientSocket = new Socket(hostname, port);

        PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String userInput = reader.readLine();
            out.println(userInput);
            if(userInput.equalsIgnoreCase("bye")){
                System.out.println("Disconnected from server");
                break;
            }
        }

        in.close();
        out.close();
        clientSocket.close();
    }

}

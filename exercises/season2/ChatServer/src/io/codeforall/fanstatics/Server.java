package io.codeforall.fanstatics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        int port = 8080;

        ServerSocket serverSocket = new ServerSocket(port);
        Socket clientSocket = serverSocket.accept();
        System.out.println("Connection established");

        PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

        while(true){
            System.out.println("Waiting for new message");
            String input = in.readLine();
            if( input == null || input.equalsIgnoreCase("bye")){
                System.out.println("Client disconnected");
                break;
            }
            System.out.println(input);
        }

        in.close();
        out.close();
        clientSocket.close();
        serverSocket.close();
    }
}

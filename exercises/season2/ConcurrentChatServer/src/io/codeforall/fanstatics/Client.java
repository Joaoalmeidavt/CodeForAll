package io.codeforall.fanstatics;

import java.io.*;
import java.net.Socket;
import java.util.ArrayList;

public class Client implements Runnable {
    private final Socket clientSocket;
    private final ArrayList<Client> clients;
    private BufferedReader in;
    private PrintWriter out;
    private String name;

    public Client(Socket clientSocket, ArrayList<Client> clients) throws IOException {
        this.clients = clients;
        this.clientSocket = clientSocket;
        this.in = new BufferedReader(new InputStreamReader(this.clientSocket.getInputStream()));
        this.out = new PrintWriter(this.clientSocket.getOutputStream());
    }

    @Override
    public void run() {
        String line;
        try {
            // Client enters the chat and enters name
            out.println("Please enter your name.");
            out.flush();
            this.name = in.readLine();
            System.out.println(name + " has entered the chat.");
            this.broadcast(" has entered the chat.");

            while (true) {
                // Client input
                line = in.readLine();
                System.out.println(line);

                String command = line.split(" ")[0];
                line = line.replaceFirst(command + " ", "");
                System.out.println(command);

                if(command.equals("/list") || command.equals("/help")){
                    this.list();
                } else if (command.equals("/broadcast")) {
                    this.broadcast(line);
                } else if (command.equals("/whisper")) {
                    String destName = line.split(" ")[0];
                    line = line.replaceFirst(destName, "");
                    this.whisper(destName, line);
                } else if (line.equals("/quit")) {
                    break;
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        // Close the socket
        try {
            out.println("Connection closed.");
            out.flush();
            System.out.println("Connection closed.");
            this.clientSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void broadcast(String message) {
        for (Client client : this.clients) {
            if (client != this) {
                client.out.println(this.name + ":" + message);
                client.out.flush();
            }
        }
    }

    public void whisper(String destName, String message) {
        for (Client client : this.clients) {
            if (client.name.equals(destName)) {
                client.out.println("(" + this.name + "):" + message);
                client.out.flush();
            }
        }
    }

    public void list(){
        this.out.println("Available commands:");
        this.out.println("/broadcast <message> - Sends the message to everyone.");
        this.out.println("/whisper <destination> <message> - Sends the message only to destination user.");
        this.out.println("/list or /help - List available chat commands.");
        this.out.println("/quit - Quits the chat.");
        this.out.flush();
    }
}

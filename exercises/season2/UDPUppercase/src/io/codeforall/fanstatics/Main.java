package io.codeforall.fanstatics;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Main {
    public static void main(String[] args) {
        String hostname = "localhost";
        int port = 50000;

        byte[] receiveBuffer = new byte[1024];
        byte[] sendBuffer;

        try (DatagramSocket socket = new DatagramSocket(port)){
            while (true) {
                DatagramPacket receivePacket = new DatagramPacket(receiveBuffer, receiveBuffer.length);
                socket.receive(receivePacket);

                int length = receivePacket.getLength();
                String string = new String(receiveBuffer, 0, length).toUpperCase();
                sendBuffer = string.getBytes();

                InetAddress clientAddress = receivePacket.getAddress();
                int clientPort = receivePacket.getPort();

                DatagramPacket sendPacket = new DatagramPacket(sendBuffer, sendBuffer.length, clientAddress, clientPort);
                socket.send(sendPacket);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

package io.codeforall.fanstatics;

import java.net.InetAddress;

public class Main {
    public static void main(String[] args) {
        String host = "www.google.com";

        try {
            InetAddress address = InetAddress.getByName(host);
            System.out.println(address.getHostAddress());
            System.out.println(address.isLoopbackAddress());
            boolean isReachable = address.isReachable(5000);
            if(isReachable){
                System.out.println("The host is reachable.");
            } else {
                System.out.println("Can't reach the host.");
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}

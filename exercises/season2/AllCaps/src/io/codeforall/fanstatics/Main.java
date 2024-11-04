package io.codeforall.fanstatics;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        String message = "I'll send an SOS to the garbage world. " +
                "I hope that someone garbage gets my message in a garbage bottle.";

        System.out.println(String.join(" ", Stream.of(message.split(" ")).map(String::toUpperCase).toList()));
    }
}

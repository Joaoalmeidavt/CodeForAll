package io.codeforall.fanstatics;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        String message = "I'll send an SOS to the garbage world. " +
                "I hope that someone garbage gets my message in a garbage bottle.";

        System.out.println(Stream.of(message.split(" "))
                .filter(word -> !word.equalsIgnoreCase("garbage"))
                .map(String::toUpperCase)
                .reduce("", (s1, s2) -> s1 + " " + s2)
                .trim());
    }
}

package io.codeforall.fanstatics;

public class Main {

    public static void main(String[] args) {
        String STRING = "rui rui rui campelo campelo campelo test abc";

        UniqueWord wc = new UniqueWord(STRING);
        for(String word : wc){
            System.out.println(word);
        }
    }
}

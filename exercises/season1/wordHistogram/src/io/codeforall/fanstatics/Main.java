package io.codeforall.fanstatics;

public class Main {

    public static final String STRING = "test test word words test 1 10 1";


    public static void main(String[] args) {
        WordHistogramComp wordHistogramComp = new WordHistogramComp(STRING);
        WordHistogramInherit wordHistogramInherit = new WordHistogramInherit(STRING);
        System.out.println("MAP has " + wordHistogramComp.size() + " distinct words");

        for(String word: wordHistogramComp){
            System.out.println(word + " : " + wordHistogramComp.get(word));
        }

        for(String word: wordHistogramInherit){
            System.out.println(word + " : " + wordHistogramInherit.get(word));
        }
    }
}

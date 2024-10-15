package io.codeforall.fanstatics;

import java.util.HashMap;
import java.util.Iterator;

public class WordHistogramInherit extends HashMap<String, Integer> implements Iterable<String> {
    public WordHistogramInherit(String string){
        super();
        String[] words = string.split(" ");
        for(String word : words){
            try {
                super.put(word, super.get(word) + 1);
            } catch (Exception ex){
                super.put(word, 1);
            }
        }
    }

    public int size(){
        return super.keySet().size();
    }

    public int get(String word){
        return super.get(word);
    }

    @Override
    public Iterator<String> iterator() {
        return super.keySet().iterator();
    }
}

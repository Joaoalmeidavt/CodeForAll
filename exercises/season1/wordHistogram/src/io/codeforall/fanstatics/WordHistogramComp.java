package io.codeforall.fanstatics;

import java.util.HashMap;
import java.util.Iterator;

public class WordHistogramComp implements Iterable<String> {
    private HashMap<String, Integer> wordHistogram;

    public WordHistogramComp(String string){
        this.wordHistogram = new HashMap<>();
        String[] words = string.split(" ");
        for(String word : words){
            try  {
                this.wordHistogram.put(word, this.wordHistogram.get(word) + 1);
            } catch (Exception ex) {
                this.wordHistogram.put(word, 1);
            }
        }
    }

    @Override
    public Iterator<String> iterator(){
        return this.wordHistogram.keySet().iterator();
    }

    public int size(){
        return this.wordHistogram.keySet().size();
    }

    public int get(String word){
        return this.wordHistogram.get(word);
    }
}

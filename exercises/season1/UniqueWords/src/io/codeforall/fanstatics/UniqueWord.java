package io.codeforall.fanstatics;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class UniqueWord implements Iterable<String> {
    private HashSet<String> set;

    public UniqueWord(String string){
        this.set = new HashSet<>();
        this.set.addAll(Arrays.stream(string.split(" ")).toList());
    }


    @Override
    public Iterator<String> iterator() {
        return this.set.iterator();
    }
}

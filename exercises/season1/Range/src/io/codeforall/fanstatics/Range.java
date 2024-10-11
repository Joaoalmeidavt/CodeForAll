package io.codeforall.fanstatics;

import java.util.Iterator;
import java.util.LinkedList;

public class Range implements Iterable<Integer> {
    private Integer min;
    private Integer max;
    public boolean[] collection;
    public Range(int min, int max) {
        this.min = min;
        this.max = max;

        boolean[] collection = new boolean[max + 1];


        this.collection = new boolean[max - min + 1];

        System.out.println(this.collection.length);
    }

    public Integer getMin() {
        return min;
    }

    public Integer getMax() {
        return max;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new MyIterator(this);
    }
}

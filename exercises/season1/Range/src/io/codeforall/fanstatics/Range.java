package io.codeforall.fanstatics;

import java.util.Arrays;
import java.util.Iterator;

public class Range implements Iterable<Integer> {
    private Integer min;
    private Integer max;
    public boolean[] collection;

    public Range(int min, int max) {
        this.min = min;
        this.max = max;
        this.collection = new boolean[max - min + 1];

        Arrays.fill(this.collection, true);
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

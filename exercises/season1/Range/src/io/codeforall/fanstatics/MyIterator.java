package io.codeforall.fanstatics;

import java.util.Iterator;

public class MyIterator implements Iterator<Integer> {
    private Range range;
    private int index;
    private int element;

    public MyIterator(Range range) {
        this.range = range;
        this.index = 0;
        this.element = range.getMin();
    }

    @Override
    public boolean hasNext() {
        return this.element < range.getMax()+1;
    }

    @Override
    public Integer next() {
        if(this.range.collection[this.index]){
            this.index++;
            return this.element++;
        }
        this.index++;
        this.element++;
        return next();
    }

    @Override
    public void remove() {
        this.range.collection[index-1] = false;
    }
}

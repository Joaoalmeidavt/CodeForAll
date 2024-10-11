package io.codeforall.fanstatics;

import java.util.Iterator;

public class MyIterator implements Iterator {
    private Range range;
    private int index;
    private int element;

    public MyIterator(Range range) {
        this.range = range;
        this.index = 0;
        this.element = range.getMin() - 1;
    }

    @Override
    public boolean hasNext() {
        element++;
        return this.element <= range.getMax();
    }

    @Override
    public Integer next() {
        if(this.range.collection[element- range.getMin()]) {
            element++;
            return next();
        }

        return element;
    }

    @Override
    public void remove() {
        this.range.collection[element - range.getMin()] = true;
    }
}

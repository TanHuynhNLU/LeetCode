package medium;

import java.util.Iterator;

public class PeekingIterator284 implements Iterator<Integer> {
    private Iterator<Integer> iterator;
    private Integer next;

    public PeekingIterator284(Iterator<Integer> iterator) {
        // initialize any member here.
        this.iterator = iterator;
    }

    // Returns the next element in the iteration without advancing the iterator.
    public Integer peek() {
        if (next == null) next = iterator.next();
        return next;
    }

    // hasNext() and next() should behave the same as in the Iterator interface.
    // Override them if needed.
    @Override
    public Integer next() {
        if (next != null) {
            Integer tmp = Integer.valueOf(next);
            next = null;
            return tmp;
        }
        return iterator.next();
    }

    @Override
    public boolean hasNext() {
        if (next != null) return true;
        return iterator.hasNext();
    }
}

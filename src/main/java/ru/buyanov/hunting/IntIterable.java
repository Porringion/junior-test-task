package ru.buyanov.hunting;

import java.util.Iterator;

/**
 *  @author https://github.com/alex-on-java 03.02.2016
 */
public class IntIterable implements Iterable<Integer> {
    int[] backed;

    public IntIterable(int[] backed) {
        this.backed = backed;
    }

    public IntIterator iterator() {
        return new IntIterator(this);
    }

    public class IntIterator implements Iterator<Integer> {

        IntIterable iterable;
        int current;

        public IntIterator(IntIterable iterable){
            this.iterable = iterable;
            current = 0;
        }

        public boolean hasNext() {
            //TODO: You task is implement this method
            return current < iterable.backed.length;
        }

        public Integer next() {

            //TODO: You task is implement this method

            if(this.hasNext())
                return iterable.backed[current++];
            else
                return null;
        }

        public void remove() {
            throw new IllegalStateException("Could not remove from array");
        }
    }
}

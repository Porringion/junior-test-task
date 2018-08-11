package ru.buyanov.hunting;

import java.util.Iterator;

public class App {

    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4, 5};
        int[] arr = {1};
        IntIterable intIterable = new IntIterable(arr);

        IntIterable.IntIterator iterator = intIterable.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}


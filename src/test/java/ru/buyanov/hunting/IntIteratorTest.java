package ru.buyanov.hunting;


import org.junit.Test;

import static org.junit.Assert.*;

/**
 *  @author https://github.com/alex-on-java 03.02.2016
 */
public class IntIteratorTest {

    @Test
    public void testForeach() {
        int[] arr = {1, 2, 3, 4, 5};
        IntIterable intIterable = new IntIterable(arr);
        Integer i = 0;
        for (Integer el : intIterable) {
            assertEquals(i + " element doesn't match", Integer.valueOf(arr[i]), el);
            i++;
        }
        assertEquals("Didn't went throw array", i, Integer.valueOf(arr.length));
    }

    @Test
    public void testBlankForeach() {
        int[] arr = new int[0];
        for (Integer el : new IntIterable(arr)) {
            assertFalse("Shouldn't come here", true);
        }
    }

    @Test
    public void testHasNextMethod(){

        //Test empty array
        IntIterable iterable = new IntIterable(new int[0]);
        IntIterable.IntIterator iterator = iterable.iterator();
        assertFalse(iterator.hasNext());

        //Test array with element
        iterable = new IntIterable(new int[]{1});
        iterator = iterable.iterator();
        assertTrue("Has next", iterator.hasNext());

        iterator.next();
        assertFalse("Has not next", iterator.hasNext());

    }

    @Test
    public void testNextMethod(){

        int[] arr = {1, 2, 3, 4, 5};
        int counter = 0;

        IntIterable iterable = new IntIterable(arr);
        IntIterable.IntIterator iterator = iterable.iterator();

        while(iterator.hasNext()) {
            assertEquals(counter + "- Element from array", iterator.next(), Integer.valueOf(arr[counter]));
            counter++;
        }

        assertNull(iterator.next());

    }
}

package dk.easv.random;

import dk.easv.IIterator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Stack;

public class RandomIterator implements IIterator<Integer> {

    private final Stack<Integer> shuffled;
    private final Random random = new Random();

    public RandomIterator(Integer[] array) {
        shuffled = new Stack();
        shuffled.addAll(Arrays.asList(array));
        Collections.shuffle(shuffled);
    }

    @Override
    public boolean hasMore() {
        return !shuffled.isEmpty();
    }

    @Override
    public Integer getNext() {
        return shuffled.pop();
    }
}

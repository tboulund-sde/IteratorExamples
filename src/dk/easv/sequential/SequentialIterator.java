package dk.easv.sequential;

import dk.easv.IIterator;

import java.util.ArrayList;
import java.util.Arrays;

public class SequentialIterator implements IIterator<Integer> {

    private ArrayList<Integer> numbers;
    private int index = 0;

    public SequentialIterator(Integer[] numbers) {
        this.numbers = new ArrayList<>(Arrays.asList(numbers));
    }

    @Override
    public boolean hasMore() {
        return index < numbers.size();
    }

    @Override
    public Integer getNext() {
        Integer next = numbers.get(index);
        index++;
        return next;
    }
}

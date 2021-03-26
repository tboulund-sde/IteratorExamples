package dk.easv.random;

import dk.easv.IIterableCollection;
import dk.easv.IIterator;

public class RandomIteratorCollection implements IIterableCollection<Integer> {

    private Integer[] array;

    public RandomIteratorCollection(Integer... array) {
        this.array = array;
    }

    @Override
    public IIterator<Integer> createIterator() {
        return new RandomIterator(array);
    }
}

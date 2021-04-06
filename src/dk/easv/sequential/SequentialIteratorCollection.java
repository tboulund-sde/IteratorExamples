package dk.easv.sequential;

import dk.easv.IIterableCollection;
import dk.easv.IIterator;
import dk.easv.second.SecondIterator;

public class SequentialIteratorCollection implements IIterableCollection<Integer> {

    private Integer[] array;

    public SequentialIteratorCollection(Integer... array) {
        this.array = array;
    }

    @Override
    public IIterator<Integer> createIterator() {
        return new SequentialIterator(array);
    }
}

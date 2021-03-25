package dk.easv;

public class SecondIteratorCollection implements IIterableCollection<Integer> {

    private Integer[] array;

    public SecondIteratorCollection(Integer... array) {
        this.array = array;
    }

    @Override
    public IIterator<Integer> createIterator() {
        return new SecondIterator(array);
    }
}

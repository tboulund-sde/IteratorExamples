package dk.easv.second;

import dk.easv.IIterator;

public class SecondIterator implements IIterator<Integer> {

    private int indexPointer = 0;
    private Integer[] array;

    public SecondIterator(Integer... array) {
        this.array = array;
    }

    @Override
    public boolean hasMore() {
        if (indexPointer >= array.length && indexPointer % 2 != 0) {
            return false;
        }
        return true;
    }

    @Override
    public Integer getNext() {
        Integer next = array[indexPointer];
        moveIndexPointer();
        return next;
    }

    private void moveIndexPointer() {
        indexPointer += 2;
        if (indexPointer >= array.length && indexPointer % 2 == 0) {
            indexPointer = 1;
        }
    }
}

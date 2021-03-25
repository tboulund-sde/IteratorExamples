package dk.easv;

public class Main {

    public static void main(String[] args) {

        IIterableCollection collection = new SecondIteratorCollection(1, 2, 3, 4, 5, 6);
        IIterator iterator = collection.createIterator();

        while(iterator.hasMore()) {
            System.out.println(iterator.getNext());
        }
    }
}

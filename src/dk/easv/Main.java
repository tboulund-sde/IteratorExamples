package dk.easv;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        /*IIterableCollection collection = new SecondIteratorCollection(1, 2, 3, 4, 5, 6);
        IIterator iterator = collection.createIterator();

        while(iterator.hasMore()) {
            System.out.println(iterator.getNext());
        }*/

        IIterableCollection collection = new FolderIteratorCollection("/Users/tbmh/Desktop");
        IIterator iterator = collection.createIterator();


    }
}

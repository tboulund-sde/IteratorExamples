package dk.easv;

import dk.easv.tree.model.Folder;
import dk.easv.random.RandomIteratorCollection;
import dk.easv.second.SecondIteratorCollection;
import dk.easv.tree.FolderIteratorCollection;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        randomIterator();
        secondIterator();
        folderIterator();
    }

    private static void randomIterator() {
        System.out.println();
        System.out.println("--- RANDOM ITERATOR ---");

        IIterableCollection collection = new RandomIteratorCollection(1, 2, 3, 4, 5, 6);
        IIterator iterator = collection.createIterator();

        while(iterator.hasMore()) {
            System.out.println(iterator.getNext());
        }
    }

    private static void secondIterator() {
        System.out.println();
        System.out.println("--- SECOND ITERATOR ---");

        IIterableCollection collection = new SecondIteratorCollection(1, 2, 3, 4, 5, 6);
        IIterator iterator = collection.createIterator();

        while(iterator.hasMore()) {
            System.out.println(iterator.getNext());
        }
    }

    private static void folderIterator() throws IOException {
        System.out.println();
        System.out.println("--- FOLDER ITERATOR ---");

        IIterableCollection collection = new FolderIteratorCollection("/Users/tbmh/Desktop/01A");
        IIterator<Folder> iterator = collection.createIterator();
        while (iterator.hasMore()) {
            Folder f = iterator.getNext();
            System.out.println(f.getName());
        }
    }
}

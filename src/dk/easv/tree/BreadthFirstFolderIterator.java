package dk.easv.tree;

import dk.easv.IIterator;
import dk.easv.tree.model.Folder;

import java.util.ArrayDeque;
import java.util.Queue;

public class BreadthFirstFolderIterator implements IIterator<Folder> {

    private final Queue<Folder> queue = new ArrayDeque<>();

    public BreadthFirstFolderIterator(Folder rootFolder) {
        queue.add(rootFolder);
    }

    @Override
    public boolean hasMore() {
        return !queue.isEmpty();
    }

    @Override
    public Folder getNext() {
        Folder next = queue.remove();

        for(Folder subFolder : next.getSubFolders()) {
            queue.add(subFolder);
        }

        return next;
    }
}

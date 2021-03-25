package dk.easv;

public interface IIterator<TItem> {
    boolean hasMore();
    TItem getNext();
}

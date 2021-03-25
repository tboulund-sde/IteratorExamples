package dk.easv;

public interface IIterableCollection<TItem> {
    IIterator<TItem> createIterator();
}

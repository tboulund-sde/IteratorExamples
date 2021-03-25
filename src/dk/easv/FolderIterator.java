package dk.easv;

public class FolderIterator implements IIterator<String> {

    private String rootFolder;

    public FolderIterator(String rootFolder) {
        this.rootFolder = rootFolder;
    }

    @Override
    public boolean hasMore() {
        return false;
    }

    @Override
    public String getNext() {
        return null;
    }
}

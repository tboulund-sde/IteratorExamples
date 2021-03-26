package dk.easv.tree;

import dk.easv.IIterableCollection;
import dk.easv.IIterator;
import dk.easv.tree.model.Folder;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class FolderIteratorCollection implements IIterableCollection<Folder> {

    private Folder folder;

    public FolderIteratorCollection(String rootFolder) throws IOException {
        folder = collectData(rootFolder);
        System.out.println("Ready");
    }

    public Folder collectData(String folder) throws IOException {
        File root = new File(folder);
        Folder result = new Folder(root.getName());
        File[] files = root.listFiles();
        Arrays.sort(files);
        for(File f : files) {
            if(f.isDirectory()) {
                Folder subFolder = collectData(f.getAbsolutePath());
                result.getSubFolders().add(subFolder);
            }
        }
        return result;
    }

    @Override
    public IIterator<Folder> createIterator() {
        return new BreadthFirstFolderIterator(folder);
    }
}

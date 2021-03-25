package dk.easv;


import dk.easv.model.Folder;

import java.io.File;
import java.io.IOException;

public class FolderIteratorCollection implements IIterableCollection<String> {

    private Folder folder;

    public FolderIteratorCollection(String rootFolder) throws IOException {
        folder = collectData(rootFolder);
        System.out.println("Ready");
    }

    public Folder collectData(String folder) {
        File root = new File(folder);
        Folder result = new Folder(root.getName());
        for(File f : root.listFiles()) {
            if(f.isDirectory()) {
                Folder subFolder = collectData(f.getAbsolutePath());
                result.getSubFolders().add(subFolder);
            } else {
                result.getFiles().add(f.getName());
            }
        }
        return result;
    }

    @Override
    public IIterator<String> createIterator() {
        return null;
    }
}

package dk.easv.model;

import java.util.ArrayList;
import java.util.List;

public class Folder {

    private String name;
    private List<Folder> subFolders = new ArrayList<Folder>();
    private List<String> files = new ArrayList<String>();
    
    public Folder(String name) {
        this.name = name;
    }

    public List<Folder> getSubFolders() {
        return subFolders;
    }

    public List<String> getFiles() {
        return files;
    }

}

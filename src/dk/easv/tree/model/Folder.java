package dk.easv.tree.model;

import java.util.ArrayList;
import java.util.List;

public class Folder implements Comparable {

    private String name;
    private List<Folder> subFolders = new ArrayList<Folder>();
    
    public Folder(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Folder> getSubFolders() {
        return subFolders;
    }

    @Override
    public int compareTo(Object o) {
        Folder other = (Folder)o;
        if (other.name == name) return 0;
        return 1;
    }
}

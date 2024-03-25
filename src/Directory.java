import java.util.ArrayList;

public class Directory implements AbstractFile{
    private String name;
    private ArrayList<AbstractFile> includedFiles = new ArrayList<>();

    public Directory(String name){
        this.name = name;
    }

    public void add(AbstractFile file){
        includedFiles.add((file));
    }
    @Override
    public void ls() {
        System.out.println("Directory: " + name);
        for (AbstractFile file: includedFiles){
            file.ls();
        }
    }
}

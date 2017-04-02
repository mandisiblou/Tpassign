package cput.ac.za.Proxy;

/**
 * Created by Mandisi on 4/2/2017.
 */
public class BurnCD implements CD {

    private String fileName;

    public BurnCD(String fileName){
        this.fileName = fileName;
        burnFromDisk(fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying " + fileName);
    }

    private void burnFromDisk(String fileName){
        System.out.println("burn " + fileName);
    }
}

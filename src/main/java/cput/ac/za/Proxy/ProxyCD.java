package cput.ac.za.Proxy;

/**
 * Created by Mandisi on 4/2/2017.
 */
public class ProxyCD implements CD {

    private BurnCD cdr;
    private String fileName;

    public ProxyCD(String fileName){
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if(cdr == null){
            cdr = new BurnCD(fileName);
        }
        cdr.display();
    }
}
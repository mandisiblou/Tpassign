package cput.ac.za.Adapter;

/**
 * Created by Mandisi on 4/1/2017.
 */
public class CDRead implements CDR_MUSIC {

    @Override
    public void cdWrite(String fileName) {
        //To be implemented in CDWrite
    }

    @Override
    public void cdRead(String fileName) {
        System.out.println("Read on CD-R. Name: "+ fileName);
    }
}

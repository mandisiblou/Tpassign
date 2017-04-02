package cput.ac.za.Adapter;

/**
 * Created by Mandisi on 4/1/2017.
 */
public class CDWrite implements CDR_MUSIC {
    @Override
    public void cdWrite(String fileName) {
        System.out.println("Write on CD-R. Name: "+ fileName);
    }

    @Override
    public void cdRead(String fileName) {
        //To be implemented in CDWrite
    }
}

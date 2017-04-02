package cput.ac.za.Adapter;

/**
 * Created by Mandisi on 4/1/2017.
 */
public class CDRW implements CD {
    CDAdapter CDAdapter;

    @Override
    public void play(String cdType, String fileName) {

        if(cdType.equalsIgnoreCase("cdReadWrite")){
            System.out.println("CD-R READ AND WRITE. Name: " + fileName);
        }

        else if(cdType.equalsIgnoreCase("cdWrite") || cdType.equalsIgnoreCase("cdRead")){
            CDAdapter = new CDAdapter(cdType);
            CDAdapter.play(cdType, fileName);
        }

        else{
            System.out.println("Invalid media. " + cdType + " format not supported");
        }
    }
}

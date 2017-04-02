package cput.ac.za.Adapter;

/**
 * Created by Mandisi on 4/1/2017.
 */
public class CDAdapter implements CD {

    CDR_MUSIC advancedMusicPlayer;

    public CDAdapter(String cdType) {

        if (cdType.equalsIgnoreCase("cdWrite")) {
            advancedMusicPlayer = new CDWrite();

        } else if (cdType.equalsIgnoreCase("cdRead")) {
            advancedMusicPlayer = new CDRead();
        }
    }

    @Override
    public void play(String cdType, String fileName) {

        if (cdType.equalsIgnoreCase("cdWrite")) {
            advancedMusicPlayer.cdWrite(fileName);
        } else if (cdType.equalsIgnoreCase("cdRead")) {
            advancedMusicPlayer.cdRead(fileName);
        }
    }
}
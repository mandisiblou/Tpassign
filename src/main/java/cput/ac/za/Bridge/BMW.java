package cput.ac.za.Bridge;

/**
 * Created by Mandisi on 4/2/2017.
 */
public class BMW implements DisplayDetailsAPI {
    @Override
    public void displays(int speed, String typeFuel) {
        System.out.println("Displaying Motor Details: \nName: BMW, speed: " + speed + ", Fuel: " + typeFuel);
    }
}

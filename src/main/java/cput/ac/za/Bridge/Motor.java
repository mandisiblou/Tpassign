package cput.ac.za.Bridge;

/**
 * Created by Mandisi on 4/2/2017.
 */
public class Motor extends Vehicle {
    private int speed;
    private String typeFuel;

    public Motor(int speed, String typeFuel,DisplayDetailsAPI displayDetailsAPI) {
        super(displayDetailsAPI);
        this.speed = speed;
        this.typeFuel = typeFuel;
    }

    public void show() {
        displayDetailsAPI.displays(speed,typeFuel);
    }
}
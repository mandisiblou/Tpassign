package cput.ac.za.Bridge;

/**
 * Created by Mandisi on 4/2/2017.
 */
public abstract class Vehicle {
    protected DisplayDetailsAPI displayDetailsAPI;

    protected Vehicle(DisplayDetailsAPI displayDetailsAPI){
        this.displayDetailsAPI = displayDetailsAPI;
    }
    public abstract void show();
}
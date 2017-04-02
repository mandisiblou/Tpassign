package cput.ac.za.Singleton;

import org.junit.Test;

/**
 * Created by Mandisi on 4/1/2017.
 */
public class VehicleTest {

    @Test
    public void testShape() throws Exception
    {
        ShapeType tempo = ShapeType.getInstance();
        tempo.Circle();
    }
}

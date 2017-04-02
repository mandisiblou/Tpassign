package cput.ac.za.Bridge;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
/**
 * Created by Mandisi on 4/2/2017.
 */
public class BridgeTest {
    private Vehicle bmw;
    private Vehicle benz;
    @Before
    public void setUp() throws Exception {
        bmw = new Motor(100,"Petrol", new BMW());
        benz = new Motor(100,"Petrol", new Benz());
    }
    @Test
    public void displayCar() throws Exception {
        bmw.show();
        benz.show();
        Assert.assertNotNull(benz);
    }
}

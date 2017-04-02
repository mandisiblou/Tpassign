package cput.ac.za.Proxy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Mandisi on 4/2/2017.
 */
public class ProxyTest {

    CD cd;

    @Before
    public void setUp() throws Exception {
        cd = new ProxyCD("Inamandla.CDR");
    }
    @Test
    public void personCreation() throws Exception {
        cd.display();
        Assert.assertNotNull(cd);
    }
}

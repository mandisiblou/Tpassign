package cput.ac.za.Prototype;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Mandisi on 4/1/2017.
 */
public class VehicleCopy {
    private CloneObject stud;
    private CloneObject sub;

    @Before
    public void setUp() throws Exception {
        stud = new Student("marah");
        sub = new Subject("blue");
    }
    @Test
    public void makeCopyV() throws Exception {
        System.out.println(stud.makeCopy());
        Assert.assertEquals("Subject name = blue",sub.toString());
    }
}

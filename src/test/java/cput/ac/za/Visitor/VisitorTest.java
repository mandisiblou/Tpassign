package cput.ac.za.Visitor;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Mandisi on 4/2/2017.
 */
public class VisitorTest {
    private Operations operations;
    @Before
    public void setUp() throws Exception {
        operations = new Subtract();
    }
    @Test
    public void personCreation() throws Exception {
        operations.accept(new OperationsDisplayVisitor());
        Assert.assertNotNull(operations);
    }
}

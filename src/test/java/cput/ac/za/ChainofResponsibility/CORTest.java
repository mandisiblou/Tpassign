package cput.ac.za.ChainofResponsibility;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Mandisi on 4/2/2017.
 */
public class CORTest {
        GradeHandler aa;
        GradeHandler successor = new GradeAHandler();
        GradeHandler successors = new GradeBHandler();
        GradeHandler successorss = new GradeCHandler();
        GradeHandler successorsss = new GradeDHandler();


    @Before
    public void setUp() throws Exception {

/*        successor.setSuccessor(successors);
        successors.setSuccessor(successorss);
        successorss.setSuccessor(successorsss);*/
    }
    @Test
    public void handlingTest() throws Exception {
        successor.handleRequest(76);
        successors.handleRequest(72);
        successorss.handleRequest(68);
        successorsss.handleRequest(63);
    }
}

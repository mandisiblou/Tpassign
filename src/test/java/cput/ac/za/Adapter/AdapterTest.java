package cput.ac.za.Adapter;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Mandisi on 4/1/2017.
 */
public class AdapterTest {
    CDRW cdToDo;
    @Before
    public void setUp() throws Exception {
        cdToDo = new CDRW();
    }
    @Test
    public void cdAction() throws Exception {
        cdToDo.play("cdReadWrite", "Around the world.cdrw");
        cdToDo.play("cdRead", "Real Madrid.cdr");
        cdToDo.play("cdWrite", "How it is!.cdw");
        cdToDo.play("avi", "Once upon a time.dvd");
    }
}


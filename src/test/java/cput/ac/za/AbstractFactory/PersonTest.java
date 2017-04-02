package cput.ac.za.AbstractFactory;

import cput.ac.za.AbstractFactory.Factories.LecturerFactory;
import cput.ac.za.AbstractFactory.Factories.StudentFactory;
import cput.ac.za.AbstractFactory.Factories.PersonFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Mandisi on 4/1/2017.
 */
public class PersonTest {
    private PersonFactory studentFactory;
    private PersonFactory lecturerFactory;

    @Before
    public void setUp() throws Exception {
        studentFactory = new StudentFactory();
        lecturerFactory = new LecturerFactory();
    }
    @Test
    public void personCreation() throws Exception {
        System.out.println(studentFactory.getPersonName("Mandisi"));
    }
}

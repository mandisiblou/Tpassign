package cput.ac.za.AbstractFactory.Domain;

/**
 * Created by Mandisi on 4/1/2017.
 */
public class Student implements Person {
    @Override
    public String getPersonName() {
        return "Students";
    }
}

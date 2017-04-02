package cput.ac.za.Prototype;

/**
 * Created by Mandisi on 4/1/2017.
 */
public class Student implements CloneObject{
    private String name;
    public Student(String name) {
        this.name = name;
    }
    @Override
    public CloneObject makeCopy() {
        return new Student(name);
    }
    @Override
    public String toString() {
        return "Student " +
                "name = " + name;
    }
}

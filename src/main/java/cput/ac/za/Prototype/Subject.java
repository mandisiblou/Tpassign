package cput.ac.za.Prototype;

/**
 * Created by Mandisi on 4/1/2017.
 */
public class Subject implements CloneObject{
    private String subjectCode;
    public Subject(String subjectCode) {
        this.subjectCode = subjectCode;
    }
    @Override
    public CloneObject makeCopy() {
        return new Subject(subjectCode);
    }
    @Override
    public String toString() {
        return "Subject " +
                "name = " + subjectCode;
    }
}

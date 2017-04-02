package cput.ac.za.ChainofResponsibility;

/**
 * Created by Mandisi on 4/2/2017.
 */
public abstract class GradeHandler {
    GradeHandler successor;

    public void setSuccessor(GradeHandler successor) {
        this.successor = successor;
    }
    public abstract String handleRequest(int request);
}

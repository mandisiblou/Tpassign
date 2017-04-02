package cput.ac.za.Visitor;

/**
 * Created by Mandisi on 4/2/2017.
 */
public interface OperationsVisitor {
    public void visit(Subtract subtract);
    public void visit(Divide divide);
    public void visit(Multiply multiply);
    public void visit(Add add);
}

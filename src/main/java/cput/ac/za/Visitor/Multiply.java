package cput.ac.za.Visitor;

/**
 * Created by Mandisi on 4/2/2017.
 */
public class Multiply implements Operations {
    @Override
    public void accept(OperationsVisitor operationsVisitor) {
        operationsVisitor.visit(this);
    }
}

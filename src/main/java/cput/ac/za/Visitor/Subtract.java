package cput.ac.za.Visitor;

/**
 * Created by Mandisi on 4/2/2017.
 */
public class Subtract implements Operations {
    Operations[] parts;

    public Subtract(){
        parts = new Operations[] {new Divide(), new Multiply(), new Add()};
    }

    @Override
    public void accept(OperationsVisitor operationsVisitor) {
        for (int i = 0; i < parts.length; i++) {
            parts[i].accept(operationsVisitor);
        }
        operationsVisitor.visit(this);
    }
}
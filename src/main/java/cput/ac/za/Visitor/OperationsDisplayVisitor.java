package cput.ac.za.Visitor;

/**
 * Created by Mandisi on 4/2/2017.
 */
public class OperationsDisplayVisitor implements OperationsVisitor {
    @Override
    public void visit(Subtract subtract) {
        System.out.println("Subtract : a = b - c ");
    }

    @Override
    public void visit(Divide divide) {
        System.out.println("Divide   : a = b / c");
    }

    @Override
    public void visit(Multiply multiply) {
        System.out.println("Multiply : a = b * c");
    }

    @Override
    public void visit(Add add) {
        System.out.println("Add      : a = b + c");
    }
}

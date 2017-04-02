package cput.ac.za.Strategy;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by Mandisi on 4/2/2017.
 */
public class StrategyTest {
    Context context;

    @Test
    public void operationss() throws Exception {
        context = new Context(new AddOperation());
        System.out.println("Add       :- 10 + 5 = " + context.executeStrategy(10, 5));
        context = new Context(new SubstractOperation());
        System.out.println("Substract :- 10 - 5 = " + context.executeStrategy(10, 5));
        context = new Context(new MultiplyOperation());
        System.out.println("Multiply  :- 10 * 5 = " + context.executeStrategy(10, 5));
        context = new Context(new DivideOperation());
        System.out.println("Divide    :- 10 / 5 = " + context.executeStrategy(10, 5));
    }
}

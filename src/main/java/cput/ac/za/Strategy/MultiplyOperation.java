package cput.ac.za.Strategy;

/**
 * Created by Mandisi on 4/2/2017.
 */
public class MultiplyOperation implements Strategy{
    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}

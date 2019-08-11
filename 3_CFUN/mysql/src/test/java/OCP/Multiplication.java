package OCP;

public class Multiplication implements IOperation
{
    private double firstOperand;
    private double secondOperand;
    private double result = 0.0;

    public Multiplication(double firstOperand, double secondOperand) {
        this.firstOperand = firstOperand;
        this.secondOperand = secondOperand;
    }

    //Setters and getters

    @Override
    public void performOperation() {
        result = firstOperand * secondOperand;
    }
}

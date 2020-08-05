package arithmetic;

public class Multiply implements Actions {
    @Override
    public int exec(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }
}

package arithmetic;

public class Add implements Actions {
    @Override
    public int exec(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
}

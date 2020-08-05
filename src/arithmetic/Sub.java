package arithmetic;

public class Sub implements Actions {
    @Override
    public int exec(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }
}

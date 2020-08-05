package arithmetic;

public class Division implements Actions {
    @Override
    public int exec(int firstNumber, int secondNumber) {
        try {
            int result = firstNumber / secondNumber;
        } catch (ArithmeticException e){
            System.out.println("Ошибка! Деление на ноль!");
            return 0;
        }
        return firstNumber / secondNumber;
    }
}

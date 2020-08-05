import arithmetic.*;

public class Calculator {
    /**
     * Калькулятор с доступными действиями: +-/*
     *
     * @param firstNumber  первое входное число
     * @param secondNumber второе входное число
     * @param chooseAction арифмитическое действие
     * @param isRoman      входные данные арабские?
     */

    public static void calculate(int firstNumber, int secondNumber, String chooseAction, boolean isRoman) {
        Actions action;
        int result = 0;
        switch (chooseAction) {
            case "+" -> {
                action = new Add();
                result = action.exec(firstNumber, secondNumber);
            }
            case "-" -> {
                action = new Sub();
                result = action.exec(firstNumber, secondNumber);
            }
            case "*" -> {
                action = new Multiply();
                result = action.exec(firstNumber, secondNumber);
            }
            case "/" -> {
                action = new Division();
                result = action.exec(firstNumber, secondNumber);
            }
        }
        if (isRoman) {
            if (result < 0) {
                System.out.println(Converter.negativeRoman(result) + " (" + result + ")");
            } else {
                System.out.println(Converter.arabicToRoman(result) + " (" + result + ")");
            }
        } else {
            System.out.println(result);
        }
    }
}

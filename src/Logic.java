public class Logic {
    public static void logic(String input) {
        String[] analyzedInput = LexicalAnalyzer.splitInput(input);
        String firstStringNumber;
        String secondStringNumber;
        String action;
        int firstNumber;
        int secondNumber;
        boolean isRoman = false;

        if (analyzedInput == null) {
            System.out.println("Неверный ввод! (Что-то со строкой!)");
            return;
        }

        firstStringNumber = analyzedInput[0];
        action = analyzedInput[1];
        secondStringNumber = analyzedInput[2];

        if (LexicalAnalyzer.isBothArabic(firstStringNumber, secondStringNumber)) {
            firstNumber = Integer.parseInt(firstStringNumber);
            secondNumber = Integer.parseInt(secondStringNumber);
        } else if (LexicalAnalyzer.isBothRoman(firstStringNumber, secondStringNumber)) {
            firstNumber = Converter.romanToArabic(firstStringNumber);
            secondNumber = Converter.romanToArabic(secondStringNumber);
            isRoman = true;
        } else {
            System.out.println("Неверный ввод! (Что-то со строкой)");
            return;
        }

        if (analyzedInput[3].equals("-")) {
            firstNumber *= -1;
        }

        if (analyzedInput[4].equals("-")) {
            secondNumber *= -1;
        }

        if (!((Math.abs(firstNumber) >= 1 && Math.abs(firstNumber) <= 10) || (Math.abs(secondNumber) >= 1 && Math.abs(secondNumber) <= 10))) {
            System.out.println("Неверный ввод! (Цифры должны быть 1...10)");
            return;
        }

        if (!(action.equals("+") || action.equals("-") || action.equals("/") || action.equals("*"))) {
            System.out.println("Неверный ввод! (Доступны только операции [+-/*])");
            return;
        }

        Calculator.calculate(firstNumber, secondNumber, action, isRoman);
    }
}

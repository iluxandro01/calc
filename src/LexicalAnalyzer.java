import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LexicalAnalyzer {
    /**
     * Функция разделяющая входную строку на два числа и соотвествующее действие
     * Игнорирует пробелы в начале и конце строки, также
     * игнорирует пробелы вокруг действия
     * также проверяется является ли число отрицательным
     * @param input входная строка
     * @return массив из двух чисел и действием (число, действие, число)
     */

    public static String[] splitInput(String input) {
        String numbers = "(10|\\d|X|IX|VIII|VII|VI|V|IV|III|II|I)";
        Pattern numbersPattern = Pattern.compile
                ("^\\s*(-)?" + numbers + "\\s*([+*/-])\\s*(-)?" + numbers + "\\s*$");
        try {
            Matcher numbersMatcher = numbersPattern.matcher(input);
            numbersMatcher.find();
            String[] result = new String[]{
                    numbersMatcher.group(2),
                    numbersMatcher.group(3),
                    numbersMatcher.group(5),
                    "0",
                    "0"
            };
            try {
                if (numbersMatcher.group(1).equals("-")) {
                    result[3] = "-";
                }
            } catch (NullPointerException ignored) {}
            try {
                if (numbersMatcher.group(4).equals("-")) {
                    result[4] = "-";
                }
            } catch (NullPointerException ignored) {}
            return result;
        } catch (IllegalStateException ignored) {}
        return null;
    }

    /**
     * Функция проверяет являются ли оба значения арабскими цифрами
     *
     * @param firstStringNumber  первая цифра ввиде строки
     * @param secondStringNumber вторая цифра ввиде строки
     * @return является ли оба значения арабскими цифрами
     */
    public static boolean isBothArabic(String firstStringNumber, String secondStringNumber) {
        Pattern patternArabic = Pattern.compile("^(-)?10|\\d$");
        return patternArabic.matcher(firstStringNumber).matches() && patternArabic.matcher(secondStringNumber).matches();
    }

    /**
     * Функция проверяет являются ли оба значения римскими цифрами
     *
     * @param firstStringNumber  - первая цифра ввиде строки
     * @param secondStringNumber - вторая цифра ввиде строки
     * @return является ли оба значения римскими цифрами
     */
    public static boolean isBothRoman(String firstStringNumber, String secondStringNumber) {
        Pattern patternRoman = Pattern.compile
                ("^(-)?(X|IX|VIII|VII|VI|V|IV|III|II|I)$");
        return patternRoman.matcher(firstStringNumber).matches() && patternRoman.matcher(secondStringNumber).matches();
    }


}

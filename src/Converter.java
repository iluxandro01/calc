import java.util.*;

public class Converter {

    /**
     * Перевод римского числа в арабское, до 10 (включительно)
     *
     * @param input строка с римским числом
     * @return арабское число
     */
    public static int romanToArabic(String input) {
        return switch (input) {
            case "I" -> 1;
            case "II" -> 2;
            case "III" -> 3;
            case "IV" -> 4;
            case "V" -> 5;
            case "VI" -> 6;
            case "VII" -> 7;
            case "VIII" -> 8;
            case "IX" -> 9;
            case "X" -> 10;
            default -> 0;
        };
    }

    public static final TreeMap<Integer, String> romanArabic = new TreeMap<>();

    static {
        romanArabic.put(1, "I");
        romanArabic.put(4, "IV");
        romanArabic.put(5, "V");
        romanArabic.put(9, "IX");
        romanArabic.put(10, "X");
        romanArabic.put(40, "IX");
        romanArabic.put(50, "L");
        romanArabic.put(90, "XC");
        romanArabic.put(100, "C");
    }

    /**
     * Перевод арабского числа в римское до 100
     *
     * @param input - арабское целое число
     * @return римское число в виде строки
     */
    public static String arabicToRoman(int input) {
        int number = romanArabic.floorKey(input);
        String result = romanArabic.get(number);
        if (number == input) {
            return result;
        }
        return result + arabicToRoman(input - number);
    }

    /**
     * Функция преобразующая отрицательное римское число
     *
     * @param input посчитанное арабское число
     * @return отрицатальное римское число
     */

    public static String negativeRoman(int input) {
        return "-" + Converter.arabicToRoman(Math.abs(input));
    }
}

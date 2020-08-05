import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Введите строку в формате: ");
        System.out.println("Число действие число");
        System.out.println("Принимаются как арабские, так и римские цифры (от 1 до 10)");
        System.out.print("Пример входных данных: ");
        System.out.println("I + IV");
        Scanner in = new Scanner(System.in);
        Logic.logic(in.nextLine());
    }
}

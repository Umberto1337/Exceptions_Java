import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        float number = getUserFloat();
        System.out.println("Вы ввели число: " + number);
    }

    public static float getUserFloat() {
        Scanner scanner = new Scanner(System.in);
        float result = 0;

        while (true) {
            System.out.print("Введите дробное число: ");

            try {
                result = Float.parseFloat(scanner.nextLine());
                break; // Ввод корректен, выходим из цикла
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: некорректный ввод. Попробуйте снова.");
            }
        }

        scanner.close();
        return result;
    }
}

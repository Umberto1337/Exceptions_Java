import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        String input = getUserInput();
        System.out.println("Вы ввели: " + input);
    }

    public static String getUserInput() {
        Scanner scanner = new Scanner(System.in);
        String input = "";

        while (input.isEmpty()) {
            System.out.print("Введите текст: ");
            input = scanner.nextLine().trim();

            try {
                if (input.isEmpty()) {
                    throw new Exception("Ошибка: пустые строки вводить нельзя.");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                input = ""; // Обнуляем input, чтобы снова запросить ввод
            }
        }

        scanner.close();
        return input;
    }
}


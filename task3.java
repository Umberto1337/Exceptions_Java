import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws Exception {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            // Допустимые индексы для массива abc: 0 и 1
            // abc[3] = 9; // Закомментировано, так как приведет к IndexOutOfBoundsException
        } catch (Exception ex) {
            System.out.println("Что-то пошло не так...");
        }
    }

    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }
}

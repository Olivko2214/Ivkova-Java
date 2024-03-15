import java.io.Console;

public class ThirdTask {

    private static final Console CONSOLE = System.console();

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        CONSOLE.printf("Even numbers are: ");

        for (int number : array) {
            if (number % 2 == 0) {
                CONSOLE.printf("%d ", number);
            }
        }
    }
}

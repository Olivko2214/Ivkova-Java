import java.io.Console;

public class FirstTask {

    private static final Console CONSOLE = System.console();
    private static final String EMPTY_COMPARE_RESULT = "";

    public static void main(String[] args) throws Exception {
        int a = Integer.parseInt(CONSOLE.readLine("Please enter first number = ").trim());
        int b = Integer.parseInt(CONSOLE.readLine("Please enter second number = ").trim());

        CONSOLE.printf("Comparison result is %d %s %d\n", a, createComparisonResult(a, b), b);
        CONSOLE.printf("Summation reasult is a + b = %d\n", a + b);
        CONSOLE.printf("Subtraction reasult is a - b = %d\n", a - b);
        CONSOLE.printf("Division reasult is a : b = %.2f\n", (float) a / b);
        CONSOLE.printf("Multiplication reasult is a * b = %d\n", a * b);
    }

    private static String createComparisonResult(int a, int b) {
        switch (Integer.compare(a, b)) {
            case -1:
                return "<";
            case 0:
                return "=";
            case 1:
                return ">";
            default:
                return EMPTY_COMPARE_RESULT;
        }
    }
}

import java.io.Console;

public class SecondTask {

    private static final Console CONSOLE = System.console();

    public static void main(String[] args) {
        String a = CONSOLE.readLine("Please enter first string = ");
        String b = CONSOLE.readLine("Please enter second string = ");

        String comparisonResult = a.equals(b) ? "String are identical" : "Strings are not identical";

        CONSOLE.printf("%s", comparisonResult);
    }
}

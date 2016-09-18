import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number");
        int a = scanner.nextInt();

        System.out.println("Enter second number");
        int b = scanner.nextInt();

        System.out.println("Enter operation");
        String operation = scanner.next();

        int result = 0;

        switch (operation) {
            case "*":
                result = a * b;
                System.out.println("Result is " + result);
                break;
            case "/":
                result = a / b;
                System.out.println("Result is " + result);
                break;
            case "+":
                result = a + b;
                System.out.println("Result is " + result);
                break;
            case "-":
                result = a - b;
                System.out.println("Result is " + result);
                break;
            case "%":
                result = a % b;
                System.out.println("Result is " + result);
                break;
        }
    }
}

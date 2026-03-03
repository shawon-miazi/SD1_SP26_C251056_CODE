package SD1_SP26_C251056_CODE;
import java.util.*;

public class calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        double a = input.nextDouble();
        double b = input.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        char op = input.next().charAt(0);

        double result;

        if (op == '+') result = a + b;
        else if (op == '-') result = a - b;
        else if (op == '*') result = a * b;
        else if (op == '/') result = a / b;
        else {
            System.out.println("Invalid operator");
            input.close();
            return;
        }

        System.out.println("Result: " + result);
        input.close();
    }
}
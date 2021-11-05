import java.util.Scanner;

public class CaicIF {
    public static void main(String [] args) {
        Scanner num = new Scanner (System.in);
        double a, b;
        System.out.println("Input first number: ");
        a = num.nextDouble();
        System.out.println("Input second number: ");
        b = num.nextDouble();
        char operation;
        System.out.println("Choose the operation(+,-,*,/,%): ");
        operation = num.next().charAt(0);
        if (operation == '+') {
            System.out.println(a + b);
        } else if (operation == '-') {
            System.out.println(a - b);
        } else if (operation == '*') {
            System.out.println(a * b);
        } else if (operation == '/') {
            System.out.println(a / b);
        } else if (operation == '%') {
            System.out.println(a % b);
        } else {
            System.out.println("Incorrect opetion!");
        }
    }
}


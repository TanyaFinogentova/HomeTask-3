import java.util.Scanner;

public class CalcSwitc {
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
        switch (operation){
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                System.out.println(a / b);
                break;
            case'%':
                System.out.println(a % b);
                break;
            default:
                System.out.println("Incorrect opetion!");
        }
    }
}


import java.util.Scanner;
public class ifelse {
    public static void main(String[]args) {
        double a, b, output=0;
        char operator;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a value");
        a = sc.nextDouble();

        System.out.println("enter b value");
        b= sc.nextDouble();

        System.out.println("enter an expression (+,-,*,/)");
        operator = sc.next().charAt(0);

        switch (operator) {
            case '+':
                output = a + b;
                break;

            case '-':
                output = a - b;
                break;

            case '*':
                output = a * b;
                break;

            case '/':
                output = a / b;
                break;

            default:
                System.out.println("you have entered wrong option");


        }
        System.out.println(a+ " " + b + " :" + output);
                return;

    }
}

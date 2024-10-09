import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int num1 = scanner.nextInt();

        System.out.println("Enter the second number:");
        int num2 = scanner.nextInt();

        int sum = num1 + num2;

        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);

        int diff = num1 - num2;

        System.out.println ("The difference of" + num1 + "and" + num2 + "is:" + diff);

        int product = num1 * num2;

        System.out.println ("The product of" + num1 + "and" + num2 + "is:" + product);

         int division = num1 / num2;

        System.out.println ("The division of" + num1 + "and" + num2 + "is:" + division);

         int modulo = num1 % num2;

        System.out.println ("The modulo of" + num1 + "and" + num2 + "is:" + modulo);
    }

}

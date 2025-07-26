import java.util.Scanner;

public class product {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the first number:");
        int a = input.nextInt();
        System.out.print("Now,enter the second number:");
        int b = input.nextInt();
        int product = a * b;
        System.out.print("Product of " + a + " and " + b + " are " + a * b);
    }

}

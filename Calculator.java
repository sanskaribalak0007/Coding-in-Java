import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the first number:");
        int a=input.nextInt();
        System.out.println("Please enter the second number:");
        int b= input.nextInt();

        System.out.println("ehat you want +,-,*,/");
        String type=input.next();

        switch(type){
            case "+": System.out.println(a+b);
                       break;
            case "-": System.out.println(a-b);
                      break;
            case "*": System.out.println(a*b);
                      break;
            case "/": System.out.println(a/b);
                      break;
        }
    }
}
